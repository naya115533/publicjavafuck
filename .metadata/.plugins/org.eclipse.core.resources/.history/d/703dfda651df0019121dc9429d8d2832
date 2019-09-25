package n9_25;
import java.util.Scanner;

class Student{
	String name;
	int mat,eng,kor;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student st=new Student();
		st.name = sc.toString();
		st.mat = sc.nextInt();
		st.eng = sc.nextInt();
		st.kor = sc.nextInt();
		System.out.println("√—¡°¿∫" + st.sum() +"∆Ú±’¿∫" + st.avg() +"«–¡°¿∫" + st.grade());
		
		sc.close();
		System.out.println("");
	}

}
