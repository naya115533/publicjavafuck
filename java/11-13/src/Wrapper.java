public class Wrapper {
    public static void main(String[] args) {

        System.out.println("long 최대값:"+Long.MAX_VALUE);
        System.out.println("long 최소값:"+Integer.MAX_VALUE);
        char a[] = {'b',' ','#','7','T'};
        for(char st:a)
        {
            System.out.print(st+" ");
        }System.out.println();
        for(int i=0;i<a.length;i++) {
            if (Character.isAlphabetic(a[i]))
                System.out.println(a[i] + "는 알파벳");

            else if (Character.isDigit(a[i]))
                System.out.println(a[i] + "은 숫자");

            else if(Character.isLetter(a[i]))
                System.out.println(a[i]+"는 문자");

            else if(Character.isSpace(a[i]))
                System.out.println(a[i]+"는 공백");
            else
                System.out.println(a[i]+"는 특수문자");
        }
    }
}
