package javaExcercises;

public class Program37
{
	public static void main(String[] args)
	{
		String x="abdul kalam";
		char c1=x.charAt(0); //a
		System.out.println(c1);
		char c2=x.charAt(8); //l
		System.out.println(c2);
		char c3=x.charAt(100); //"StringIndexOutOfBoundsException" will come
		System.out.println(c3);
	}

}
/*
x = "abdul kalam"

# Accessing characters at specific indices
c1 = x[0]  # 'a'
print(c1)

c2 = x[8]  # 'l'
print(c2)

# Trying to access an invalid index (will raise IndexError)
try:
    c3 = x[100]  # Index out of bounds
    print(c3)
except IndexError:
    print("Index out of bounds")
*/