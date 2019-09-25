package n9_18;

public class trycatch {

	public static void main(String[] args) {
		try{
			int a = 7, b=3;
			int c=a/b;
			System.out.println("몫= " +c);
			int x[] = {5,7,3,4,8,1,9};
			for (int i=0;i<x.length;i++)
			{
				System.out.print(x[i] + " ");
			}
		}catch(ArithmeticException e) // 오류 이름 + 이름 지정
		{
			System.out.println("예외 발생중" + e.getMessage());
		}/*catch(Exception s)
		{
			System.out.println("잘못 실행" + s.getMessage());
		}*/catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("배열 잘못 실행"+ a.getMessage());
		}finally
		{
			System.out.println("무조건 실행");
		}
		
	}

}
