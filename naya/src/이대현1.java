import java.util.Scanner;

public class 이대현1 {

	public static void success()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력: ");
		int score=sc.nextInt();
		if(score >=80)
			System.out.println("합격입니다");
		else
			System.out.println("불합격입니다");
		sc.close();
	}
	public static void grade()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오: ");
		int score=sc.nextInt();
		
		if (score > 100 || score < 0)
			System.out.println("잘못 입력하셨습니다.");
		else if (score>=90)
			System.out.println("상");
		else if (score < 60)
			System.out.println("하");
		else
			System.out.println("중");
	}
	public static void coffee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("무슨 커피");
		String order = sc.next();
		System.out.println("개수");
		int i = sc.nextInt();
		int price = 0;
		System.out.println("무슨 커피 드릴까요?");
		switch (order){
		case "아이스용암볼케이노치즈스노우커피":
		case "메리크리스마스치즈":
		case "아이스데빌커피":
			price = 3500;
			break;
		case "커피에 원두가 빠진다면":
			price = 2000;
			break;
		default:
			System.out.println("그런 메뉴 없다 이자슥아");
			break;
		}
		
		price = price *i;
		if(price!=0)
			System.out.print(order + i + "개는" + price + "입니다");
		
		sc.close();
	}
	 public static void game() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("가위바위보 게임입니다.\n가위 | 바위 | 보 중에서 입력하세요.");
	        System.out.print("철수 >> ");
	        String player1 = sc.next();
	        int ran = (int) (Math.random()*3+1);

	        switch(ran) {
	            case 1:
	                System.out.println("영희 >> 가위");
	                if (player1.equals("가위")) System.out.println("가위바위보에서 비겼습니다.");
	                else if (player1.equals("바위")) System.out.println("철수가 가위바위보에서 이겼습니다.");
	                else if (player1.equals("보")) System.out.println("영희가 가위바위보에서 이겼습니다.");
	                break;
	            case 2:
	                System.out.println("영희 >> 바위");
	                if (player1.equals("가위")) System.out.println("영희가 가위바위보에서 이겼습니다.");
	                else if (player1.equals("바위")) System.out.println("가위바위보에서 비겼습니다.");
	                else if (player1.equals("보")) System.out.println("철수가 가위바위보에서 이겼습니다.");
	                break;
	            case 3:
	                System.out.println("영희 >> 보");
	                if (player1.equals("가위")) System.out.println("영희가 가위바위보에서 이겼습니다.");
	                else if (player1.equals("바위")) System.out.println("철수가 가위바위보에서 이겼습니다.");
	                else if (player1.equals("보")) System.out.println("가위바위보에서 비겼습니다.");
	                break;
	        }

	    }
	 public static void game2()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("철수 >>");
		 String chul = sc.next();
		 System.out.println("영희");
		 String young = sc.next();
		 String a = "가위";
		 String b = "바위";
		 if(chul.equals(young))
			 System.out.println("비겼다");
		 else if (chul.equals(a) && young.equals("보") || chul.equals(b) && young.equals("가위"))
			 System.out.println("철수가 이겼습니다");
		 else
			 System.out.println("영희가 이겼습니다");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// success();
		// grade();
		// coffee();
		game();
		
	}

}
