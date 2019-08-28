import java.util.Scanner;

public class 스캐너로_받아서_연산하기_다른곳에서도 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("임의의 세수");
		int a = scan.nextInt();//함수 입력
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("합="+매개변수_설정.sum(a, b, c));// 다른곳에서 받아올수 있따
	}

}
