package arrays;

public class EvenOddFromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("even numbers");
		for(int num:a)
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
		}
		System.out.println("odd number");
		for(int num:a)
		{
			if(num%2!=0)
			{
				System.out.println(num);
			}
		}		
	}
}
