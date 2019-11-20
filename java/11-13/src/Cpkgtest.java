import Cpkg.Cpkg;

import java.util.Scanner;

public class Cpkgtest implements Cpkg {
    public void show(){
        System.out.println("cm->mm로 바꿉니다 입력하세요");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i+"cm는"+c*i+"mm입니다");
    }
    public static void main(String[] args) {
        Cpkgtest c = new Cpkgtest();
        c.show();
    }
}
