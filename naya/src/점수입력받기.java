import java.util.Scanner;

import javax.swing.JOptionPane;

public class 점수입력받기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		float 점수 = sc.nextFloat();
		학점(점수);
		
		
	}
	public static void pass(float 점수)
	{ 
		if (점수>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}
	public static void 학점(float 점수)
	{
		char g = ' ';
		if (점수 >=90)
			g= 'A';
		else if(점수 >=80)
			g= 'B';
		else if(점수 >=70)
			g= 'C';
		else if(점수 >=60)
			g= 'D';
		else 
			g= 'F';
		System.out.println("너의 학점은="+g);
	}
}
