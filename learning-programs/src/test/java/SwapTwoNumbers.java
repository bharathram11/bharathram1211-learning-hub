
public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=5;
		int b=7;
		//wihtout using third variable
		System.out.println("before swap a is "+a + " value of b is "+b);
//		a=a+b;  
//		b=a-b;  
//		a=a-b;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swap a is "+a+" value of b is "+b);
	}

}
