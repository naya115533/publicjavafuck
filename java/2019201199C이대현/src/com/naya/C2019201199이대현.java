import java.util.Scanner;

abstract class Camera{
    private String model; // 클래스내 사용
    private String maker; // 클래스내 사용
    protected int volume;
    protected int flim;
    abstract void picture(); // 추상클래스 사용
    abstract void save(); // 추상클래스 사용
    public String getmodel(){ // 모델을 보내줌
        return model;
    }
    public String getmaker(){ // 메이커를 보내줌
        return maker;
    }
    Camera(String model,String maker,int volume,int flim){
        this.volume = volume;this.flim = flim;
        this.model = model;this.maker = maker;
    }
    Camera(){};
}
class DSLR extends Camera{ // DSLR 클래스 Camera 참조
    int pixel; // 화소 생성
    static int z=0;
    void picture(){
        z++; volume -= 50*z; // z는 한번 할때마다 증가 용량 은 한번 할때마다 50씩 감소
        if(volume >=0){
            System.out.println("DSLR사진기의 남은 용량은" + volume + "kb남았고, 현재 사진수는 " + z +"개 입니다");
        }
        else
            System.out.println("용량이 부족합니다");
    }
    void save(){
        flim -= z; // 필름수 받아온것에서 작아짐
        System.out.println("DSLR 사진기의 남은 필림수는 " + flim);
    }
    DSLR(String model,String maker,int volume,int flim,int pixel){
        super(model,maker,volume,flim); // 4개 올려줌
        this.pixel = pixel; // 자신 가리킴
    }
}
class Polaroid extends Camera{
    String color;
    static int i =0;
    void picture(){
        i++; volume -= 50*i; // 한번 돌때마다 i 1씩 증가
        if(volume >= 0){
            flim -= i; // flim 수 감소
            if(flim >=0){
                System.out.println("폴라로이드 사진기의 용량은 " + volume + "남았고, 현재 사진수는"+ i);
            }
            else{
                System.out.println("필름이 부족합니다");
                return;
            }
        }
        else
            System.out.println("용량이 부족합니다");
    }











    void save()
    {
        flim -= i; // flim 수 감소
        if(flim > 0){
            System.out.println("폴라로이드 남은 필름수는" + flim);
        }
        else if(flim <=0){
            System.out.println("폴라로이드 사진기의 남은 필림수는 0. 더이상 저장할 수 없습니다.");
            return;
        }
    }
    Polaroid(String model,String maker,int volume,int flim,String color){ // 아래서 받음
        super(model,maker,volume,flim); // 위로 올려줌
        this.color = color; // 자신 가리킴
    }
}
public class C2019201199이대현 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 사용

        while(true) // 무한반복
        {
            System.out.println("1.DSLR\n2.폴라로이드\n3.종료" );
            int i = sc.nextInt(); // i 값 입력
            if(i == 1){
                System.out.println("1.사진찍기\n2.저장하기");
                int j = sc.nextInt(); // j 값 입력
                DSLR d = new DSLR("sm-500","삼성",300,20,1700); // 입력
                System.out.println("모델명:"+ d.getmodel() + " 제조사:" + d.getmaker() + " 메모리:"+ d.volume +" 필름수:" + d.flim + " 화소수:" + d.pixel);
                if(j == 1)
                    d.picture(); // DSLR picture 실행
                else if(j == 2)
                    d.save();// DSLR save 실행
            }
            else if(i == 2){
                System.out.println("1.사진찍기\n2.저장하기");
                int j = sc.nextInt();
                Polaroid p = new Polaroid("mini-200","canon",800,15,"노랑");
                System.out.println("모델명:"+ p.getmodel() + " 제조사:" + p.getmaker() + " 메모리:"+ p.volume +" 필름수:" + p.flim + " 화소수:" + p.color);
                if(j == 1)
                    p.picture(); // 폴라로이드 picture 실행
                else if (j ==2)
                    p.save(); // 폴라로이드 save 실행
            }
            else if(i ==3)
                return; // 잘못 입력 햇을때 끝냄
            else
                System.out.println("잘못입력하셨습니다");
        }
    }
}