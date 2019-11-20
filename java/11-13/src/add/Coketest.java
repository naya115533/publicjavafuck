package add;
import lib.Coke;

public class Coketest implements Coke {
    public void show()
    {
        int r=10;
        System.out.println("반지름은:"+(r*r*pi));
    }
    public static void main(String[] args) {
        Coketest c = new Coketest();
        c.show();
    }
}
