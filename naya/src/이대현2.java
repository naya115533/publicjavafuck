import java.util.Scanner;

public class �̴���2 {

	static void forEx()
	{
		int i;
		int sum =0;
		for(i=0; i<=10; i++) // for ( ; ; ) ���ѹݺ�, i<=10�� ������ ���ѹݺ�
		{
			System.out.println(i + " ");
		}
		for(i=10;i>=0;i--)
		{
			System.out.println(i + " ");
		}
		for (i=1;i>=100; i+=2)
		{
			System.out.println(i +" "); // 2�� ���� i+2�� ����
			sum += i;
		}
		System.out.println("¦���� ����" + sum);
		sum =0;
		for(i=1;i<=100;i++)
		{
			if (i % 2 != 0)
					sum+=i;
		}
		System.out.println("Ȧ���� ����" + sum);
	}
	static void fact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�");
		int a=sc.nextInt();
		long i,sum=1;
		for(i=1; i<=a;i++)
			sum *= i;
		System.out.println("���� ����" + sum + "�Դϴ�");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// forEx();
		fact();
	}

}
