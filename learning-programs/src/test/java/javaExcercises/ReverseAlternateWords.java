package javaExcercises;

public class ReverseAlternateWords {
    public static void main(String[] args) {
        String s = "selenium cypress playwright webdriverio";
        String words[] = s.split(" "); // Split the string into words
        String rev = ""; // To store the final result
        int count = 0;

        for (String word : words) {
            if (count % 2 !=0) { // Reverse for alternate words (odd positions)
                String re = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    re = re + word.charAt(i);
                }
                rev = rev + re + " ";
            } else { // Keep the word as is
                rev = rev + word + " ";
            }
            count++;
        }

        System.out.println("Output: " + rev.trim());
    }
}
