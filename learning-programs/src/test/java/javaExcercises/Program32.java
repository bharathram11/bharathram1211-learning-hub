package javaExcercises;

public class Program32
{
	public static void main(String[] args)
	{
		//As "String" class
		String x=new String("abdul kalam");  //declare and define an object using constructor method
		System.out.println(x); //x is behaving like a variable
		x.length(); //x is behaving like an object to call method
		//As "String" data type
		String y="abdul kalm"; //declare and initialize as an variable.
		System.out.println(y); //y is behaving like a variable
		y.length(); //y is behaving like an object to call method
	}
}
/*
# As "String" class (Using constructor-like approach, which is not necessary in Python)
x = "abdul kalam"  # Declare and define a string
print(x)  # Print the string
print(len(x))  # Calling method to get the length of the string

# As "String" data type (Direct assignment)
y = "abdul kalam"  # Declare and initialize a string
print(y)  # Print the string
print(len(y))  # Calling method to get the length of the string
*/