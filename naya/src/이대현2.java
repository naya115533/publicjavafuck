import java.util.Scanner;

public class 이대현2 {

	static void forEx()
	{
		int i;
		int sum =0;
		for(i=0; i<=10; i++) // for ( ; ; ) 무한반복, i<=10을 없에도 무한반복
		{
			System.out.println(i + " ");
		}
		for(i=10;i>=0;i--)
		{
			System.out.println(i + " ");
		}
		for (i=1;i>=100; i+=2)
		{
			System.out.println(i +" "); // 2찍 증가 i+2도 가능
			sum += i;
		}
		System.out.println("짝수의 합은" + sum);
		sum =0;
		for(i=1;i<=100;i++)
		{
			if (i % 2 != 0)
					sum+=i;
		}
		System.out.println("홀수의 합은" + sum);
	}
	static void fact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오");
		int a=sc.nextInt();
		long i,sum=1;
		for(i=1; i<=a;i++)
			sum *= i;
		System.out.println("곱의 합은" + sum + "입니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// forEx();
		fact();
	}

}
