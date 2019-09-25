package n9_18;

class Person{//사람객체 생성
	//속성과 메소드정의 : 먹는다, 잔다, 이름,나이
	String name;
	int age;
	void eat()
	{
		System.out.println("먹는다");
	}
	void sleep()
	{
		System.out.println("잔다");
	}
	
}
//----------------------------------------------------------------------------------
class lol{
	String champion;
	String script;
	void tall()
	{
		System.out.println(champion + "왈" + script);
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
		System.out.println(name + "은 최고속도가" + speed + "입고 색깔은" + color + "이다" );
	}
	void park()
	{
		System.out.println(name +"이 주차한다");
	}
}
//----------------------------------------------------------------------------------
public class leedaehyeon3 {
	
	public leedaehyeon3(){
		this(123,152);
		System.out.println("하 수업하기 싫다");
		
	}
	public leedaehyeon3(int a){
		System.out.println("하 수업하기 싫다2");
	}
	public leedaehyeon3(int a,int b){
		System.out.println("하 수업하기 싫다3");
	}
//----------------------------------------------------------------------------------
	//속성과 메소드(행위)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name="이대현";p1.age=20;
		p1.eat();p1.sleep();
		System.out.println("이름 =" + p1.name + "나이 =" +p1.age + "이다");
//----------------------------------------------------------------------------------
		lol l1 = new lol();
		l1.champion="문도"; l1.script ="하고싶은대로 한다";
		l1.line = "탑"; l1.Pinkrate = 52.17;
//----------------------------------------------------------------------------------
		lol l2 = new lol();
		l2.champion="마스터이"; l2.script ="우주류 검술";
		l2.line = "정글"; l2.Pinkrate = 48.89;
//----------------------------------------------------------------------------------
		car c1 = new car();
		c1.name = "람보르기니"; c1.speed=200;
		c1.color ="빨강";
		c1.park(); c1.run();
		
		
	}

}
