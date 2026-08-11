package lamda;

class Employee extends Thread
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
class Manager extends Thread
{
	@Override
	public void run()
	{
		System.out.println("hi"+Thread.currentThread().getName()+" >>"+Thread.currentThread().getId());
	}
	public Manager(String name)
	{
		super(name);
	}
}
public class Test
{
	public static void main(String[] args) {
		Employee e=new Employee();
		e.start();
		Manager m1=new Manager("T2");
		m1.start();
		System.out.println(Thread.activeCount());
	}
}
