import java.util.Scanner;

class Student{
	String name;
	int mat,eng,kor;
	float avg;
	Student(String name,int mat,int eng,int kor)
	{
		this.name = name; this.mat = mat; this.eng = eng; this.kor=kor;
		avg = (mat+eng+kor)/3;
	}
	Student()
	{}
	int sum()
	{
		return mat + eng +kor;
	}
	
	float avg()
	{
		return sum()/3;
	}
	char grade()
	{
		if (avg()>=90)
		{
			return 'A';
		}
		else if (avg()>=80)
		{
			return 'B';
		}
		else if (avg()>=70)
		{
			return 'C';
		}
		else if(avg()>=60)
		{
			return 'D';
		}
		else 
		{
			return 'F';
		}
	}
}

public class ����{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student st=new Student();
		st.name = sc.toString();
		st.mat = sc.nextInt();
		st.eng = sc.nextInt();
		st.kor = sc.nextInt();
		System.out.println("������" + st.sum() +"�����" + st.avg() +"������" + st.grade());
		
		sc.close();
		System.out.println("");
		

	}
}


