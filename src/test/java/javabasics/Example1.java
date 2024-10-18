package javabasics;

public class Example1 
{
	public static void main(String[] args)
	{
		//If any one of operands or two operands are "String", "+" means concatenation. 
		System.out.println("Hello"+10); //"+" is concatenation
		System.out.println("Hello"+"World"); //"+" is concatenation
		System.out.println("Hello"+12.4);  //"+" is concatenation
		System.out.println("Hello"+'Q');    //"+" is concatenation
		//If operands are in other type like int, float, char, ...etc, "+" means addition only.
		System.out.println(12+10); //"+" is addition
		System.out.println(12+10.78); //"+" is addition
		System.out.println('B'+'T'); //"+" is addition to add ASCII values of 'B' and 'T'
		//If our operand is boolean, "+"
		//System.out.println(10+true); 
		System.out.println("I love"+143+10);
		System.out.println("I love"+(143+10));
		System.out.println(143+10+"I love");
	}
}
