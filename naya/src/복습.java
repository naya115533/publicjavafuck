import java.util.Scanner;

public class ���� {
	static final double PIE = 3.141592; // �۱��� �ٰ� ���� �����Լ��� ���� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("������");
		float x = sc.nextFloat();
		area(x); // ���� ����
		����(x);
		cir(x);
	}
	public static void area(float x)
	{
		double area1 = x*x*PIE;
		System.out.println("���� ����="+area1);
	}
	public static void ����(float x)
	{
		double ���� = 2*x;
		System.out.println("���� ����="+����);
	}
	public static void cir (float x)
	{
		double cir = 2*x*Math.PI; // ���̰� �⺻������ ����
		System.out.println("���ǵѷ�="+cir);
	}
}
