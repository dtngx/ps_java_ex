package Java;

import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        // clear unnecessary output in Terminal
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        //get user input
        String rawInput;
        System.out.print("Please enter a String to check if it is a palindrome:\n"); 
        Scanner sc = new Scanner(System.in);
        rawInput = sc.nextLine();
        sc.close();

        // clean the Input
        // remove the spaces
        String cleanedInput = rawInput.replaceAll("\\s+","");

        // remove the special characters
        cleanedInput = cleanedInput.replaceAll("[^a-zA-Z0-9]", "");

        // convert to uppercase
        cleanedInput = cleanedInput.toUpperCase();

        // check if entered text is a palindrome by comparing chars 
        int inputLength = cleanedInput.length();
        int firstHalfLength = 0;
        int errorCount = 0;

        if (inputLength % 2 == 0) {
            firstHalfLength = inputLength / 2;
        } else {
            firstHalfLength = (inputLength - 1) / 2;
        }
        for (int i = 1; i <= firstHalfLength; i++) {
            if (cleanedInput.charAt(inputLength-i) != cleanedInput.charAt(i-1)) {
                errorCount += 1;
            } 
        }

        // output a result of the check
        if (errorCount == 0) {
            System.out.println("Yay! Your string is a palindrome!");
        } else {
            System.out.println("Sorry, this string does not seem to be a palindrome...");
        }

        // comment in the next line to see the text that is checked
        // System.out.println(cleanedInput);

    }
}
