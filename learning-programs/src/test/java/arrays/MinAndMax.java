package arrays;

public class MinAndMax {

	public static void main(String[] args) {
		int a[]= {50,30,40,20,60};
		int max=a[0];//compare each and every element with a[0]
		/*for(int i=1;i<a.length;i++)                   //take intial value as max the first element a[0] and from a[i] to a.length compare the values
		{
			if(a[i]>max)                                //if the values is greater than max then consider the value is max loop continues
			{
				max=a[i];
			}
		}
		System.out.println("max element in an array is :"+max);*/
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max element in an array is :"+min);
	}
}
