import java.util.Scanner;

public class 복습 {
	static final double PIE = 3.141592; // 밖깥에 다가 빼서 전역함수로 쓸수 있음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("반지름");
		float x = sc.nextFloat();
		area(x); // 원의 넓이
		지름(x);
		cir(x);
	}
	public static void area(float x)
	{
		double area1 = x*x*PIE;
		System.out.println("원의 넓이="+area1);
	}
	public static void 지름(float x)
	{
		double 지름 = 2*x;
		System.out.println("원의 지름="+지름);
	}
	public static void cir (float x)
	{
		double cir = 2*x*Math.PI; // 파이가 기본적으로 있음
		System.out.println("원의둘레="+cir);
	}
}
