package arrays;

public class MaxAndSecondMax {
    public static void main(String[] args) {
        int arr[] = {99,77,66,55,101,152,17,-1};
        // Initialize max and secondMax with the first two elements
        int FirstMax=Integer.MIN_VALUE;
        int SecondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
        	if(FirstMax<arr[i])  
        	{
        		SecondMax=FirstMax;
        		FirstMax=arr[i];
        	}
        	else if(SecondMax<arr[i])  
        	{
        		SecondMax=arr[i];  
        	}
        }
        System.out.println("Max: " + FirstMax);
        System.out.println("Second Max: " + SecondMax);
    }
}
