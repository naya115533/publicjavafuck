package n9_18;

class Person{//�����ü ����
	//�Ӽ��� �޼ҵ����� : �Դ´�, �ܴ�, �̸�,����
	String name;
	int age;
	void eat()
	{
		System.out.println("�Դ´�");
	}
	void sleep()
	{
		System.out.println("�ܴ�");
	}
	
}
//----------------------------------------------------------------------------------
class lol{
	String champion;
	String script;
	void tall()
	{
		System.out.println(champion + "��" + script);
	}
	String line;
	double Pinkrate;
}
//----------------------------------------------------------------------------------
class car{
	
	String name;
	int speed;
	String color;
	void run()
	{
		System.out.println(name + "�� �ְ�ӵ���" + speed + "�԰� ������" + color + "�̴�" );
	}
	void park()
	{
		System.out.println(name +"�� �����Ѵ�");
	}
}
//----------------------------------------------------------------------------------
public class leedaehyeon3 {
	
	public leedaehyeon3(){
		this(123,152);
		System.out.println("�� �����ϱ� �ȴ�");
		
	}
	public leedaehyeon3(int a){
		System.out.println("�� �����ϱ� �ȴ�2");
	}
	public leedaehyeon3(int a,int b){
		System.out.println("�� �����ϱ� �ȴ�3");
	}
//----------------------------------------------------------------------------------
	//�Ӽ��� �޼ҵ�(����)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name="�̴���";p1.age=20;
		p1.eat();p1.sleep();
		System.out.println("�̸� =" + p1.name + "���� =" +p1.age + "�̴�");
//----------------------------------------------------------------------------------
		lol l1 = new lol();
		l1.champion="����"; l1.script ="�ϰ������� �Ѵ�";
		l1.line = "ž"; l1.Pinkrate = 52.17;
//----------------------------------------------------------------------------------
		lol l2 = new lol();
		l2.champion="��������"; l2.script ="���ַ� �˼�";
		l2.line = "����"; l2.Pinkrate = 48.89;
//----------------------------------------------------------------------------------
		car c1 = new car();
		c1.name = "���������"; c1.speed=200;
		c1.color ="����";
		c1.park(); c1.run();
		
		
	}

}
