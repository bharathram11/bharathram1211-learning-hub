package javaExcercises;

public class A3b4c3abcd {
	public static void main(String[] args) {
		String s = "aaaabbbccccbcd";
        String result = ""; // Start with an empty result string
        char currentChar = s.charAt(0); // First character of the string
        int count = 1; // Start counting from 1

        // Loop through the string starting from the second character
        for (int i = 1; i < s.length(); i++) 
        {
            if (s.charAt(i) == currentChar) 
            {
                count++; // Same character, increase count
            } 
            else 
            {
                // Add the character and its count to result
                result += currentChar;
                if (count > 1) 
                {
                    result += count; // Only add count if greater than 1
                }
                // Update currentChar and reset count
                currentChar = s.charAt(i);
                count = 1;
            }
        }

        // Add the last character and its count
        result += currentChar;
        if (count > 1) {
            result += count;
        }

        // Print the result
        System.out.println(result);
	}

}
