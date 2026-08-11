
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Removeduplicatesfromlist {

	public static void main(String[] args) {
		
		ArrayList<String>li=new ArrayList<String>();
		li.add("egg");
		li.add("potato");
		li.add("veg");
		li.add("egg");
		li.add("rabbit");
		System.out.println(li);
		
		Set<String>si=new HashSet<String>(li);
		System.out.println(si);
	}

}
