package n9_18;

public class leedaehyeon {

	public static void main(String[] args) {
		int [] array = new int[5]; // = int a,b,c;
		int[] b = {6,3,7,4,2,1,8,9};
		int i;
		for(i=0;i<b.length;i++)
		{
			//System.out.println( b[i]);
			
		}
		for(int array2:b) // for \-each for(타입 변수; 배열명)
			System.out.print(array2 + " ");
		System.out.println();
		
		char[] c= { 't','y','p','m','d'};
		String [] d= {"바나나","포도","오렌지"};
		
		for (char array3:c)
			System.out.print(array3 + " ");
		System.out.println();
		System.out.println(array[3]);
		for (String array4 : d)
			System.out.print(array4 + " ");
		System.out.println();
	
		int [] ha = new int [10];
		int j,sum =0,max=0,min=2000000001;
		for(j=0;j<ha.length;j++)
		{	
		int x = (int)(Math.random()*100+1);
		ha[j] = x;
		System.out.print(ha[j] + " ");
		sum += ha[j];
		if(max<=ha[j])
			max=ha[j];
		else if(min>=ha[j])
			min=ha[j];

		}
		System.out.println("합은" + sum + "평균은" + (double)sum/ha.length);
		System.out.println("최대는" + max);
		System.out.println("최소는" + min);
	}
}


