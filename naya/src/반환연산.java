
public class ��ȯ���� {

	public static void test2()
	{
		System.out.println("�ڹ� 2 ���α׷�");
	}
	
	public static void main(String[] args) {
		
		System.out.println("fuck");
		//�ҽ������ۼ�-������-���� : Ctrl + F11
		test2();
		test1();
		test2();
		System.out.println("��="+test3());
		System.out.println("�̸���="+test4());
	}

	public static void test1()// �޼ҵ� �̸� ������� ���� ���� ������ �ȵ����� �̰� ��
	{
		System.out.println("���� ���α׷� 1");
	}
	//������ �ҷ������ �׷��� ���� ����

	public static int test3()
	{
		return 100;
	}
	public static String test4()
	{
		return "ȫ�浿";
	}
	
}
