
public class 랜덤 {

	public static void main(String[] args) {
		int x = (int) (Math.random()*46); // 46까지의 수까지 나옴
		System.out.println("임의의수="+x);
		random2();
	}
	public static void random()
	{
		System.out.println(Math.random());// 메소드임 import 안써도 됨
	}
	public static void random2()
	{
		int x = (int)(Math.random()*100+1);
		int y = (int)(Math.random()*100+1);
		int z = (int)(Math.random()*100+1);
		int sum = x+y+z;
		System.out.println("임의의수="+x+","+y+","+z);
		System.out.println("합="+sum);
	}
	
}