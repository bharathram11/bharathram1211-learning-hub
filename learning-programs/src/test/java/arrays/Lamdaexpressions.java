package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Lamdaexpressions {

	public static void main(String[] args) {
		//Lambda expressions allow you to write concise and functional-style code. They provide a way to pass behavior as parameters to methods.
		//Syntax: (parameters) -> expression
		String name[]= {"Alice","Bob","Charlie"};
		List<String>names=new ArrayList<String>(Arrays.asList(name));
		names.forEach(name1 -> System.out.println(name1.toUpperCase()));  //lamda expression
        /*for(String name1:names)
        {
        	System.out.println(name1.toLowerCase());
        }*/

	}

}
