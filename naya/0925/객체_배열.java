import java.util.Scanner;

public class ��ü_�迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] s = new Student[2];
		Student st=new Student();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("�̸�>>");
			String name = sc.next();
			System.out.println("����>>");
			int mat = sc.nextInt();
			System.out.println("����>>");
			int eng = sc.nextInt();
			System.out.println("����>>");
			int kor = sc.nextInt();
			s[i] = new Student(name,mat,eng,kor);
			
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("�̸���" + s[i].name + "������" + s[i].sum() + "�����" + s[i].avg()+"����" + st.grade());
		}
		
		
	}
	
}
