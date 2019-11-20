import java.util.Scanner;

public class Binary {
    void convert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오");
        int i = sc.nextInt();
        System.out.println("2진수는 :"+Integer.toBinaryString(i));
        System.out.println("8진수는 :"+Integer.toOctalString(i));
        System.out.println("16진수는 :" +Integer.toHexString(i));
    }
    public static void main(String[] args) {
        int a =55;
        Integer a2=new Integer(55);
        System.out.println("2진수"+Integer.toBinaryString(55));
        // toOctalString() : 8진수
        // toHexString() : 16진수

        String d = "55";
        int f = Integer.parseInt(d);
        System.out.println(Integer.toBinaryString(f));
        Binary b = new Binary();
        b.convert();
    }
}


