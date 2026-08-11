public class PersonToString
{
	String name;
	int age;
	public PersonToString(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayInfo()
	{
		System.out.println("Name"+name);
		System.out.println("Age"+age);
	}
	public String toString()
	{
		return("Name :"+name+"  Age :"+age);
	}
	public static void main(String[] args) {
		 PersonToString p=new PersonToString("kalem",91);
		 System.out.println(p);
		
	}
}
