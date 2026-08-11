package javaExcercises;

public class RemoveChar {

	public static void main(String[] args) {
		String s="ramanaload";
		char[]c=s.toCharArray();
		String result="";
		for(int i=0;i<s.length();i++)
		{
			if(c[i]!='a')
			{
				result=result+c[i];
			}
		}
		System.out.println(result);
	}
}
/*package javaExcercises;

public class RemoveChar {

    public static void main(String[] args) {
        String s = "ramanaload";
        char[] c = s.toCharArray();
        String result = ""; // Use a plain string instead of StringBuffer
        for (char b : c) {
            if (b != 'l') {
                result += b; // Concatenate characters directly
            }
        }
        System.out.println(result);
    }
}
*/