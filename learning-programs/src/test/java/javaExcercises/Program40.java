package javaExcercises;

public class Program40
{
	public static void main(String[] args)
	{
		String x="my name is kalam";
		String y=x.substring(3,6); 
		//returns a substring begins at the specified "beginIndex" and extends to the character 
		//at index (endIndex-1).Thus the length of the substring is (endIndex-beginIndex). 
		System.out.println(y);
		String z=x.substring(3,60);  //"StringIndexOutOfBoundsException" will come
		System.out.println(z);
		
	}
}
/*
x = "my name is kalam"

# Extract a substring from index 3 to 6 (exclusive of index 6)
y = x[3:6]  # This gives the substring from index 3 to 5
print(y)

# Handling out-of-bounds indices
try:
    z = x[3:60]  # This will attempt to extract from index 3 to 59, which is out of bounds
    print(z)
except IndexError:
    print("Index out of bounds")*/  
//nam
//name is kalam