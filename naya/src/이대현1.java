import java.util.Scanner;

public class �̴���1 {

	public static void success()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է�: ");
		int score=sc.nextInt();
		if(score >=80)
			System.out.println("�հ��Դϴ�");
		else
			System.out.println("���հ��Դϴ�");
		sc.close();
	}
	public static void grade()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�: ");
		int score=sc.nextInt();
		
		if (score > 100 || score < 0)
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		else if (score>=90)
			System.out.println("��");
		else if (score < 60)
			System.out.println("��");
		else
			System.out.println("��");
	}
	public static void coffee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���� Ŀ��");
		String order = sc.next();
		System.out.println("����");
		int i = sc.nextInt();
		int price = 0;
		System.out.println("���� Ŀ�� �帱���?");
		switch (order){
		case "���̽���Ϻ����̳�ġ����Ŀ��":
		case "�޸�ũ��������ġ��":
		case "���̽�����Ŀ��":
			price = 3500;
			break;
		case "Ŀ�ǿ� ���ΰ� �����ٸ�":
			price = 2000;
			break;
		default:
			System.out.println("�׷� �޴� ���� ���ڽ���");
			break;
		}
		
		price = price *i;
		if(price!=0)
			System.out.print(order + i + "����" + price + "�Դϴ�");
		
		sc.close();
	}
	 public static void game() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("���������� �����Դϴ�.\n���� | ���� | �� �߿��� �Է��ϼ���.");
	        System.out.print("ö�� >> ");
	        String player1 = sc.next();
	        int ran = (int) (Math.random()*3+1);

	        switch(ran) {
	            case 1:
	                System.out.println("���� >> ����");
	                if (player1.equals("����")) System.out.println("�������������� �����ϴ�.");
	                else if (player1.equals("����")) System.out.println("ö���� �������������� �̰���ϴ�.");
	                else if (player1.equals("��")) System.out.println("���� �������������� �̰���ϴ�.");
	                break;
	            case 2:
	                System.out.println("���� >> ����");
	                if (player1.equals("����")) System.out.println("���� �������������� �̰���ϴ�.");
	                else if (player1.equals("����")) System.out.println("�������������� �����ϴ�.");
	                else if (player1.equals("��")) System.out.println("ö���� �������������� �̰���ϴ�.");
	                break;
	            case 3:
	                System.out.println("���� >> ��");
	                if (player1.equals("����")) System.out.println("���� �������������� �̰���ϴ�.");
	                else if (player1.equals("����")) System.out.println("ö���� �������������� �̰���ϴ�.");
	                else if (player1.equals("��")) System.out.println("�������������� �����ϴ�.");
	                break;
	        }

	    }
	 public static void game2()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("ö�� >>");
		 String chul = sc.next();
		 System.out.println("����");
		 String young = sc.next();
		 String a = "����";
		 String b = "����";
		 if(chul.equals(young))
			 System.out.println("����");
		 else if (chul.equals(a) && young.equals("��") || chul.equals(b) && young.equals("����"))
			 System.out.println("ö���� �̰���ϴ�");
		 else
			 System.out.println("���� �̰���ϴ�");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// success();
		// grade();
		// coffee();
		game();
		
	}

}
