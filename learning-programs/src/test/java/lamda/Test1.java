package lamda;
//Runnable-run();
//comparable-compareTo();
//comparator-comapre();
//actionlister-actionperformed();
//callable-call();


@FunctionalInterface
interface interf
{
	public void m1(int a,int b);
}
class Test1
{
	public static void main(String[] args) {
		interf d=(a,b)->System.out.println(a+b);
		d.m1(30, 20);
	
	}
}