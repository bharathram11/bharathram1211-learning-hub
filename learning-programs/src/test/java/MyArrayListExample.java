
import java.util.*;

public class MyArrayListExample {  // Renamed class
    public static void main(String[] args) {
        ArrayList xy = new ArrayList();
        // add elements to the arraylist
        xy.add(11);
        xy.add("bharath");
        xy.add('A');
        xy.add("Bnglr");
        xy.add(87654);
        System.out.println(xy);            //[11, bharath, A, Bnglr, 87654]
        //remove element from the list
        xy.remove(3);//index
         System.out.println(xy);            //[11, bharath, A, 87654]
         //add object at some index
         xy.add(2, "ravi");
         System.out.println(xy);            //[11, bharath, ravi, A, 87654]
         //retrive a specific element
         System.out.println(xy.get(2));     //ravi
         //change element(replace)
         xy.set(1, "ram");
         System.out.println(xy);          //[11, ram, ravi, A, 87654]
         //search contains
         System.out.println(xy.contains('A'));  //true
         System.out.println(xy.contains("bharath"));//false
         System.out.println(xy.isEmpty()); //false
         
         
         //reading elements using for loop
         for(int i=0;i<xy.size();i++)
         {
        	 System.out.println(xy.get(i));
         }
         //reading using for each loop
         for(Object e:xy)
         {
        	 System.out.println(e);
         }
         //reading using iterator
         Iterator it=xy.iterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
         
         //adding all elements to an duplicate list
         ArrayList dup=new ArrayList();
         dup.addAll(xy);
         System.out.println(dup);//[11, ram, ravi, A, 87654]
         dup.removeAll(xy);
         System.out.println(dup);//[]
         //for sorting we need to use collections class sort method
         Collections.sort(xy);  //for same data type
         Collections.sort(xy,Collections.reverseOrder());//for reverse order
         Collections.shuffle(xy);
         
         String arr[]= {"hi","rama","seetha"};
         ArrayList al=new ArrayList(Arrays.asList(arr));//converting array to arraylist using Arrays.aslist
    }
}
