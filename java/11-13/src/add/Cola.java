package add;
import lib.*; // *은 모든것

public class Cola extends Calc implements Coke {
    int r=5;
    public void show(){
        System.out.println(2*r*pi);
    }
    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a,int b) {
        return a-b;
    }
    public int pro(int a,int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Cola c = new Cola();
    }

}
