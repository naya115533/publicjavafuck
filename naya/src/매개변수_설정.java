
public class 매개변수_설정 {

	public static void hap(int a,int b)
	{
		int s = a+b;
		
		System.out.println("합="+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=7, c=9;
		hap(a,b); cha(a,b);
		System.out.println("합="+sum(a,b,c));
		System.out.println("합="+sum1(a,b,c));
		System.out.println("평균="+avg(a,b,c));
	}
	public static void cha(int a,int b)
	{
		int c = a-b;
		
		System.out.println("차"+c);
	}

	public static int sum(int a,int b,int c)
	{
		int sum = a+b+c;
		
		return sum;
	}
	public static int sum1(int a,int b,int c)
	{
		return a+b+c;
	}
	public static float avg(int a,int b,int c)
	{
		return (a+b+c)/3;
	}
}
class 월드
{
	public static void gop(int a,int b)
	{
		int g = a*b;
		System.out.println("곱="+g);
	}
	public static float avg(int a,int b,int c)
	{
		float avg = (int)(a+b+c)/3; // 형변환
		
		return avg;
	}
}
	
