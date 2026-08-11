
public class SimpleStringConcatenation {
    public static void main(String[] args) {
        String input = "aaabbbacfwww";
        String output = ""; // To store the final output
        int count = 1; // Initialize the count for consecutive characters

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {   
                count++; // Increment count if the same character repeats
            } else {
                // Add the previous character and its count if more than 1
                output =output+ input.charAt(i - 1);
                if (count > 1) {
                    output =output+ count;
                }
                count = 1; // Reset count
            }
        }
        // Add the last character and its count (if applicable)
        output =output+ input.charAt(input.length() - 1);
        if (count > 1) {
            output = output+count;
        }

        System.out.println("Output: " + output);
    }
}
