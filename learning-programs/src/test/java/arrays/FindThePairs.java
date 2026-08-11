package arrays;

public class FindThePairs {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6,7,8};
		int sum=9;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}

	}

}
