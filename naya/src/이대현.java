import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class �̴��� {

	static final int t = 60;
	public static void timer()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�");
		
		int time = sc.nextInt();
		int second = time % t;
		int minute = (time/t) % t;
		int hour = (time/t/t);
	
		System.out.println(time +"�ʴ�" + hour +"�ð�" + minute + "��" +second+"���Դϴ�");
	
	
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
