
public class 반환연산 {

	public static void test2()
	{
		System.out.println("자바 2 프로그램");
	}
	
	public static void main(String[] args) {
		
		System.out.println("fuck");
		//소스파일작성-컴파일-실행 : Ctrl + F11
		test2();
		test1();
		test2();
		System.out.println("값="+test3());
		System.out.println("이름은="+test4());
	}

	public static void test1()// 메소드 이름 내맘대로 설정 가능 메인은 안되지만 이건 됨
	{
		System.out.println("서브 프로그램 1");
	}
	//메인이 불러줘야함 그래야 실행 가능

	public static int test3()
	{
		return 100;
	}
	public static String test4()
	{
		return "홍길동";
	}
	
}
