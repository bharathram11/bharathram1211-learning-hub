package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int []a= {12,13,14,15,16,17,28,12,14};
		System.out.println("with duplicates");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		System.out.println("without duplicates");
		Set<Integer>s=new HashSet<Integer>();
		for(int j=0;j<a.length;j++)
		{
			s.add(a[j]);
		}
        System.out.println(Arrays.toString(s.toArray()));
        //int [] output=Arrays.stream(a).distinct().toArray();
       //for(int e:output)
       //{
    	 //  System.out.println(e);
       //}
	}

}
