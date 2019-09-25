import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class 이대현 {

	static final int t = 60;
	public static void timer()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		
		int time = sc.nextInt();
		int second = time % t;
		int minute = (time/t) % t;
		int hour = (time/t/t);
	
		System.out.println(time +"초는" + hour +"시간" + minute + "분" +second+"초입니다");
	
	
	}
	public static void shift()
	{
		int a =1;
		System.out.println(a<<10);
		for(int i=0;i<=15;i++)
		{
			System.out.println(a<<i);
		}
	}
	public static void main(String[] args) {
		// timer();
		shift();
	}
}
