import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	public int getArea()
	{
		return width*height;
	}
	public Rectangle(int width,int height)
	{
		this.width =width; this.height =height;
	}
	public Rectangle()
	{ }
}
class Rectangle2{
	int width;
	int height;
	public int getArea()
	{
		return 2*width + 2*height;
	}
}

public class Circle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();
		Rectangle2 rect2=new Rectangle2();
		Scanner sc = new Scanner(System.in);
		System.out.println(">>");
		rect.width=sc.nextInt();
		rect.height=sc.nextInt();
		System.out.println("�簢���� ������?"+rect.getArea());
		System.out.println(">>");
		rect2.width=sc.nextInt();
		rect2.height=sc.nextInt();
		System.out.println("�簢���� �ѷ���?" + rect2.getArea());
		
		sc.close();
		
	}

}