import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		//Even :-if a number is divide by 2 then remainder will be zero
		Scanner ri=new Scanner(System.in);
		System.out.println("enter the number");
		int i=ri.nextInt();
		if(i%2==0)
		{
			System.out.println(i+"even number");
		}
		else
		{
			System.out.println(i+"odd number");
		}	
	}
}
