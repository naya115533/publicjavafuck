import java.util.Scanner;

class TV{
	String name;
	int channel;
	int i;
	public TV(String name,int channel)
	{
		this.name = name; this.channel = channel;
	}
	float volume;
	
	void on()
	{
		i=1;
		System.out.println("LG wide TV가 켜졌습니다");
		System.out.println("현재 채널은" + channel +"입니다");
	}
	void off()
	{
		i=0;
		System.out.println("LG wide TV가 꺼졌습니다");
	}
	public int up()
	{
		channel +=1;
		if(channel >=21)
			channel = 1;
		return channel;
	}
	public int down()
	{
		channel -=1;
		if(channel <=0)
			channel = 20;
		return channel;
	}
}

public class 생성자2 {

	public static void main(String[] args) {
		TV t = new TV("LG wide 60inch", 8);
		Scanner sc=new Scanner(System.in);
		String in;
		while(true)
		{	
			System.out.println("리모컨을 눌러 주세요");
			
			in = sc.next();
			if(t.i==1)
			{
				switch(in) 
				{
					case "u" : t.up(); break;
					case "d" : t.down(); break;
					case "x" : t.off(); return;
					default :
						System.out.println("잘못입력함");
				}
				System.out.println("현재 채널은 " + t.channel +"입니다");
			}
			else if(t.i==0)
			{
				switch(in){
					case "o" : t.on(); break;}
				if(t.i==0)
					System.out.println("TV를 켜주세요");
			}	
			
		}
	
	
	}

}
