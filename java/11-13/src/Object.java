class Test{

}
public class Object {
    public static void main(String[] args) {
    Test t = new Test();
        System.out.println(t.toString());
        System.out.println(t.hashCode());
        System.out.println(t.getClass());

        String a ="자바"; // String 생성 방법 1
        String b=new String("자바"); //방법 2

        if(a.equals(b)){ // 문자는 ==으로 비교가 안되서 Ojbect 안에 있는 equals를 사용해야함
            System.out.println("같다");
        }
        else {
            System.out.println("다르다");
        }
    }
}
