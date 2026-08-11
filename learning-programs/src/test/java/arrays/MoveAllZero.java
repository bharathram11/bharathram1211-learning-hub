package arrays;

public class MoveAllZero {
	public static void main(String[] args) {
		int[]arr= {1,3,0,5,6,7,0,8,5,0,5,6};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];  //1,3,5,6,7,8,5,5,6
			}
		}
		while(count<arr.length)
		{
			arr[count++]=0;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
