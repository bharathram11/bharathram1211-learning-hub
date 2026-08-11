package arrays;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int a[]= {5,6,7,8,9};
		int sum=0;
//		for(int i=0;i<a.length;i++)
//		{
//		    	sum=sum+a[i];
//		}
//		System.out.println(sum);
		
		for(int v:a)
		{
			sum=sum+v;
		}
		System.out.println(sum);
	}

}
