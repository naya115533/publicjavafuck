
public class 생성자 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.width=5;
		r.height=8;
		System.out.println("면적"+r.getArea());
		
		Rectangle r2 = new Rectangle(7,8);
		System.out.println("사각형 면적");
	}

}
