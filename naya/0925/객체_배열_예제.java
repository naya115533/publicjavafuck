import java.util.Scanner;

class Book{
	String title, author;
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
}

public class 按眉_硅凯_抗力 {

	public static void main(String[] args) {
		Book [] b = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<b.length;i++)
		{
			System.out.println("力格>>");
			String title = sc.nextLine();
			System.out.println("历磊>>");
			String author = sc.nextLine();
			b[i] = new Book(title,author);
		}
		
		for(int i=0;i<b.length;i++)
			System.out.println("(" + b[i].title + "," + b[i].author + ")");

	}

}
