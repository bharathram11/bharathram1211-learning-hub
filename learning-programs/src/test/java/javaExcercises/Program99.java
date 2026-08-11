package javaExcercises;

public class Program99
{
	static  //its run first
	{
		System.out.println("Hi, i am static block");   
	}
	public void finalize()   //it runs as last
    {   
        System.out.println("Hi, i am finalize() method");   
    } 
	public static void main(String[] args) throws Exception //it runs as 2nd
	{
		System.out.println("Hi, i am main() method");  
		//1. Create an object to class
		Program99 obj=new Program99();   
	    //2. Use that object to call properties and methods
        System.out.println(obj.hashCode());
        //3. Make object as NULL and call garbage collector method
        obj=null;   
        System.gc();   
        System.out.println("end of garbage collection");   
    }     
}  


