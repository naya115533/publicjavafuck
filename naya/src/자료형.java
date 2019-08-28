
public class 자료형 {
	
	public static void dateType()
	{
		boolean a = true; // 1바이트 :: 참이면 1 거짓이면 0
		System.out.println("bool형="+a);
		char b = 'T';
		char c = '\uac00';
		System.out.println("char형="+c);
		byte d = 127; //-128~127까지 쓸수 있음		
		short e = 128;
		int f = 2100000000; // 약 21억까지
		long g = 2200000000L; // long형은 뒤에 L 붙혀 줘야함
		float h = 4.5F; // F붙혀 줘야함
		double i = 4.5; // D 안붙혀 줘도됨
		
		String st = "Hello World"; //내가 쓰는 만큼 크기가 형성됨
		final double PIE = 3.141592; //final 은 더이상 변형이 안되게 값을 고정 아래서 변경 x
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dateType(); // 메소드명
	}

}
