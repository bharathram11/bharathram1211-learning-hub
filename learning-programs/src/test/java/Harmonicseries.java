import java.util.Scanner;

public class Harmonicseries {

	public static void main(String[] args) {
		//harmonic series=1/1+1/2+1/3+1/4+.......+1/n
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		double sum=0.0;
		for(int i=1;i<=num;i++)   //1,2,3,4
		{
			sum=sum+(double)1/i;   //0.0+1.0 =1.0+0.5  =1.5+0.3 ,1.8+0.25 2.05	 1/2=0.5 i=12;double=12.0  double=12.5; int =12;
		}
		System.out.println(sum);
	}

}
