package arrays;

public class MissingNumInArray {

	public static void main(String[] args) {
		//array should not have duplicates
		//array no need to be in sorted order
		//values should be in range
		int a[]= {1,2,4,5,6,7,8,9};
		//sum1=1+2+4+5=12
		//sum2=1+2+3+4+5=15
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of elements in an array :"+sum1);
		int sum2=0;
		for(int i=1;i<=9;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elements in an array :"+sum2);
		System.out.println("missing number is :"+(sum2-sum1));
	}

}
