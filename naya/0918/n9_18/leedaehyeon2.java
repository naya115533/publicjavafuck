package n9_18;

public class leedaehyeon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// ckdnjs2();
			//ckdnjs3();
			question();
		}
	
	
	public static void ckdnjs2() 
	{
		int [][] array = new int [3][4];
		array[1][0]=8;
		int [][] array2={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		int i,j;
		for(i=0;i<array.length;i++){
			for(j=0;j<array2[0].length;j++)
				System.out.print(array2[i][j] + " ");
			System.out.println();
			}
	}
	public static void ckdnjs3()
	{
		int [][][] array3= {{{1,2,3},{4,5,6},{7,8,9}},
						   {{10,11,12},{13,14,15},{16,17,18}},
						   {{19,20,21},{22,23,24},{25,26,27}}};
		int i,j,z;
		for(i=0;i<array3.length;i++){
			for(j=0;j<3;j++){
				System.out.println();
				for(z=0;z<3;z++)
					System.out.print(array3[i][j][z] + " ");
				System.out.println("");}
				System.out.print("---------");
			}
		
	}
	public static void question()
	{
		
		String [] array= {"    ","ȫ�浿","ȫ���","ȫ�濵"};
		String [][] array2 = {{"���"},{"���"},{"���"}};
		int [][] array3 = {{27,67,100},{100,67,100}};
		float [][] array4 = new float [1][3];
		int i,j;
		
		for (i=0;i<4;i++)
			System.out.print(array[i] + "\t");
		
		System.out.println();
		
		for(i=0;i<3;i++)
		{
			System.out.print(array2[i][0]+ "\t");
			
				for(j=0;j<3;j++)
				{
					if(i<2)
						System.out.print(array3[i][j] + "\t");
					else
					{
						for(j=0;j<3;j++)
						{
							array4[0][j] = (array3[0][j] + array3[1][j])/2; 
							System.out.print(array4[0][j] + "\t");
						}
					}
				}
			System.out.println();
		}
	}
}