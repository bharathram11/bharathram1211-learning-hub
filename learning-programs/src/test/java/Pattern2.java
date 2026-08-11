
public class Pattern2 {

	public static void main(String[] args) {
		//int r=5;
		for(int i=5;i>=1;i--)      //5,4,3,2,1
		{
			for(int j=1;j<=i;j++)   //1,2,3,4,5  1234 123 12 1  
			{
				System.out.print("*");
				//System.out.print(j);      
				//System.out.print(i);
			}
			System.out.println();
		}
	}
}
