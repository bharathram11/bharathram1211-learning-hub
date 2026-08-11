package automation;

public class Constructor {
	static int currentbalance=1000;
	public void greet()
	{
		System.out.println("hi welcome to bank");
	}
	public void deposit(int amount)
	{
		currentbalance=currentbalance+amount;
		System.out.println("amount deposited successfuly");
	}
	public static void withdrawl(int amount)
	{
		currentbalance=currentbalance-amount;
		System.out.println("amount withdrawn");
	}
	public int getcurrentbalance()
	{
		return currentbalance;
	}
	public static void main(String[] args) {
		Constructor cp=new Constructor();
		cp.greet();
		cp.deposit(500);
		System.out.println(cp.getcurrentbalance());
		withdrawl(300);
		System.out.println(cp.getcurrentbalance());
		//cp.getcurrentbalance();
		System.out.println(cp.getcurrentbalance());
		
	}
}
