package zero;
public class IfElseExample {
    public static void main(String[] args) {
        int a = 10, b = 0;
        if (b != 0) {
            int result = a / b;  // Executes only if b is not zero
            System.out.println("Result: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
