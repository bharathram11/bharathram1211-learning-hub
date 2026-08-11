
public class Objects {
	int i=80;
	int j=90;
	//object is an instance of class ,class have some variables and methods so if we need to access that methods and properties
	//we need to allocate some memory,memory allocation is done by object creation for object creation we need Constructor method
	public Objects()
	{
		i=10;
		j=40;
	}
	public Objects(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public int add()
	{
		return i+j;
	}
	public static void main(String[] args) {
		Objects obj1=new Objects();
		Objects obj2=new Objects(15,45);
		Objects obj3=new Objects(80,59);
		System.out.println(obj1.add());//50
		System.out.println(obj2.add());//60
		System.out.println(obj3.add());//139
	}
}
