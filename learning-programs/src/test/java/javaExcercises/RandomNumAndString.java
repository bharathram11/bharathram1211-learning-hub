package javaExcercises;

import java.util.Random;

//import RandomStringUtils;

public class RandomNumAndString {

	public static void main(String[] args) {
		//Approach-1
		Random rand=new Random();
		int rand_int=rand.nextInt(10);
		System.out.println(rand_int);
		
		double rand_dbl=rand.nextDouble();//between 0.0 and less than 1.0
		System.out.println(rand_dbl);
		
		System.out.println(Math.random());//gives only double number
		
//		String randNum=RandomStringUtils.randomNumeric(10);  //num in the form of string in 10 decimal
//		System.out.println(randNum);
//		//System.out.println(Integer.parseInt(randNum));
//		
//		String randAlpha=RandomStringUtils.randomAlphabetic(10);  //string in 10 char
//		System.out.println(randAlpha);
//		
//		String randAlphaNum=RandomStringUtils.randomAlphanumeric(10);  //num&string in 10 char
//		System.out.println(randAlphaNum);

	}

}
