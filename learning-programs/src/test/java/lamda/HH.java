package lamda;

class Employee1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("hello"+Thread.currentThread().getName()+" >>"+Thread.currentThread().getId());
	}
//	public Employee(String name)
//	{
//		super(name);
//	}
}
class Manager1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("hi"+Thread.currentThread().getName()+" >>"+Thread.currentThread().getId());
	}
//	public Manager(String name)
//	{
//		super(name);
//	}
}
public class HH
{
	public static void main(String[] args) {
		Employee1 e=new Employee1();
		Thread t1=new Thread(e);
		t1.start();
		Manager1 m1=new Manager1();
		Thread t2=new Thread(m1);
		t2.start();
		System.out.println(Thread.activeCount());
	}
}
/*
0-new thread t1=new thread
1-running  t1.start()
2-blocked
3-waiting(join)
4-waiting(specfic time/sleep)
5-terminated 
*/