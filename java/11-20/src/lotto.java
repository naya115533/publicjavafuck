public class lotto {
    public static void main(String[] args) {
        int a[] = new int[7];

        for(int i=0;i<a.length;i++)
        {
            a[i] =(int)(Math.random()*45+1);
            if(i != 0) {
                for (int j = 0; j < i; j++) {
                    if (a[j] == a[i]) {
                        i = i - 1;
                    }
                }
            }
        }
        for(int j=0;j<a.length;j++) {
            System.out.println(j+"번째 수는 =" +a[j]);
        }
    }
}
