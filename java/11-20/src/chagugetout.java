import java.util.StringTokenizer;

public class chagugetout {
    public static void main(String[] args) {
        StringBuffer a= new StringBuffer();
        a.append("박예진,");
        a.append("김채규,");
        a.append("심현보,");
        a.append("이유찬");
        a.delete(3,7);
        a.insert(8,"한지성,");
        System.out.println();

        String b = "김준오/김채규/이진욱/이인직/이대현";
        StringTokenizer t= new StringTokenizer(b,"/");
        int n = t.countTokens();
        System.out.println("갯수="+n);
        for(int i=0;i<n;i++)
        {
            System.out.println(t.nextToken());
        }

        String c = "바나나,오렌지,배,귤,수박,사과";
        StringTokenizer tz = new StringTokenizer(c,",");
        int nz = tz.countTokens();
        System.out.println("갯수="+nz);
        while(tz.hasMoreElements())
        {
            System.out.println(tz.nextToken());
        }
    }
}
