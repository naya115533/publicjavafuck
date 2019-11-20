public class Wrapper_String {
    public static void main(String[] args) {
        String a = "We are the Champion";
        String b = new String ("나는 파이썬을 사랑한다");
        // char At() : 번호에 해당하는 값 리턴
        System.out.println(a.charAt(5));
        System.out.println(b.charAt(5));

        //concat() : 문자 합치기
        System.out.println(a.concat(b));

        //subStr() 1,8 : 1부터 8전까지(7까지)
        System.out.println(a.substring(3,8));
        System.out.println(b.substring(3,6));

        int j=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) == 'a')
            {
                j++;
                System.out.println("자리는" + i + "번째 자리에 있습니다");
            }
        }
        System.out.println("개수는"+j+"개 입니다");


    }
}
