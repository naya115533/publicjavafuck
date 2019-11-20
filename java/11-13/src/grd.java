public class grd {
    public static void main(String[] args) {
        String a = "banana";
        String b = "aorange";

        System.out.println(a.compareTo(b));
        //CompareTo
        //음수가 나오면 앞문자가 사전적으로 먼저나오고 >> 뒷문자가 우선순위가 높다
        //양수가 나오면 뒷문자가 사전적으로 먼저나오고 r>> 앞문자가 우선순위가 높다
        // 0 이면 같다

        String st[] = {"배유진","이인범","이하은","한지성","김채규"};

        System.out.println("원본입니다");
        for(int i=0;i<st.length;i++)
        {
            System.out.print(st[i] + ",");
        }
        String temp;
        for(int i=0;i<st.length;i++)
        {
            for(int j=0;j<st.length;j++)
            {
                int ab = st[i].compareTo(st[j]);
                if(j<i) {
                    if (ab < 0) {
                        temp = st[i];
                        st[i] = st[j];
                        st[j] = temp;
                    }
                }
            }
        }
        System.out.println();
        for (String s:st)
        {
            System.out.print(s+" ,");
        }
    }
}
