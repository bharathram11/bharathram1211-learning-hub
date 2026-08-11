package javaExcercises;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		String s="S@#~@@#(*&^%GHIH!FGGHuydwjhqe98765rfguw(!*I!}{P{E;2oooe";
		//String after=s.replaceAll("[a-zA-Z0-9]", "");  //^ without this it can be print special char  @#~@@#(*&^%!(!*!}{{; 
		String after=s.replaceAll("[^a-zA-Z0-9]", "");      //SGHIHFGGHuydwjhqe98765rfguwIPE2oooe
		System.out.println(after);
	}

}
