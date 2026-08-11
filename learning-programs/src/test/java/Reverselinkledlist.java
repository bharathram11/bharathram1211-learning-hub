import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Reverselinkledlist {
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(12,33,45,66,2,44);
		
		for(int i=li.size()-1;i>=0;i--)
		{
			System.out.print(li.get(i)+",");
		}
	}

}
