package n9_18;

public class trycatch {

	public static void main(String[] args) {
		try{
			int a = 7, b=3;
			int c=a/b;
			System.out.println("��= " +c);
			int x[] = {5,7,3,4,8,1,9};
			for (int i=0;i<x.length;i++)
			{
				System.out.print(x[i] + " ");
			}
		}catch(ArithmeticException e) // ���� �̸� + �̸� ����
		{
			System.out.println("���� �߻���" + e.getMessage());
		}/*catch(Exception s)
		{
			System.out.println("�߸� ����" + s.getMessage());
		}*/catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("�迭 �߸� ����"+ a.getMessage());
		}finally
		{
			System.out.println("������ ����");
		}
		
	}

}
