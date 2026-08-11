package javaExcercises;

public class Program36
{
	public static void main(String[] args)
	{
		String x="quality";
		String y="Quality";
		if(x.equalsIgnoreCase(y))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
	}
}
/*
if x.lower() == y.lower():
print("Both are equal")
else:
print("Both are not equal")*/