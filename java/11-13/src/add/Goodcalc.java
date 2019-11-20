package add;
import lib.Calc; //packet 호출

public class Goodcalc extends Calc{

    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int pro(int a, int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        Goodcalc g = new Goodcalc();
        System.out.println("합="+g.add(1,3));
        System.out.println("차="+g.sub(2,1));
        System.out.println("곱="+g.pro(1,2));
    }
}
