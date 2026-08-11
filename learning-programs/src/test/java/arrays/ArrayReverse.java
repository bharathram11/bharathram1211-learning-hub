package arrays;

public class ArrayReverse  {
	public static void main(String[] args) {	
		int array[]= {11,44,11,55,22};
		//int []array1=new int [] {11,44,11,55,22,44,59,25,31,99,90,88};
		for(int i=array.length-1;i>0;i--)
		{
			System.out.print(array[i]+",");
		}
		
	}
}

