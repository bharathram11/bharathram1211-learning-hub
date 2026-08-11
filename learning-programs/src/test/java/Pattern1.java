
public class Pattern1 {

	public static void main(String[] args) {
		//int r=5;
		for(int i=1;i<=5;i++)      //1  ,2
		{
			for(int j=1;j<=i;j++)   //1   1<=1   1,2   1,2,3  1,2,3,4  1,2,3,4,5
			{
				System.out.print("*");
				//System.out.print(j);      
				//System.out.print(i);
			}
			System.out.println();
		}
	}
}
