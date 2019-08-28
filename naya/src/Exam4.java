import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		String a;
		int b;
		float c;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름");
		a=sc.next();
		System.out.println("나이");
		b=sc.nextInt();
		System.out.println("키");
		c=sc.nextInt();
		System.out.println("이름은:"+ a +("나이는:")+ b +("키는:")+ c);

	}

}
