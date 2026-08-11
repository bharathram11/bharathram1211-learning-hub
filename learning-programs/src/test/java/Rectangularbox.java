
public class Rectangularbox {

	public static void main(String[] args) {
		
		for(int i=1;i<=40;i++)
		{
			System.out.print("-");
		}
		System.out.println();
		for(int m=1;m<=5;m++)
		{
			for(int k=1;k<=40;k++)
			{
			   if(k==1 || k==40)
			    {
				System.out.print("|");
			    }
			    else
			    {
				System.out.print(" ");
			    }
			}
			System.out.println();
		}
		for(int j=1;j<=40;j++) {
			System.out.print("-");
		}

	}

}
