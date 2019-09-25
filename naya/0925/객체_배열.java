import java.util.Scanner;

public class 객체_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] s = new Student[2];
		Student st=new Student();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("이름>>");
			String name = sc.next();
			System.out.println("수학>>");
			int mat = sc.nextInt();
			System.out.println("영어>>");
			int eng = sc.nextInt();
			System.out.println("국어>>");
			int kor = sc.nextInt();
			s[i] = new Student(name,mat,eng,kor);
			
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("이름은" + s[i].name + "총점은" + s[i].sum() + "평균은" + s[i].avg()+"학점" + st.grade());
		}
		
		
	}
	
}
