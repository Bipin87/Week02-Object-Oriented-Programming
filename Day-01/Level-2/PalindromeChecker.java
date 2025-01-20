import java.util.*;

class PalindromeChecker {
  
  // Instance variable to hold the text input
  String text;

  // Constructor to initialize the text variable using 'this' keyword
  PalindromeChecker(String text) {
    this.text = text;
  }

  // Method to check if the string is a palindrome
  boolean isPalindrome() {
    // Convert the string to lowercase 
    String toLower = text.toLowerCase();
    int left = 0;
    int right = toLower.length() - 1;

    // Check characters from both ends towards the center
    while (left < right) {
      if (toLower.charAt(left) != toLower.charAt(right)) {
        return false; 
      }
      left++; 
      right--; 
    }

    return true;
  }

  // Method to display the result of the palindrome check
  void displayResult() {
    if (isPalindrome()) {
      System.out.println(text + " is a palindrome.");
    } else {
      System.out.println(text + " is not a palindrome.");
    }
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt user for input
    System.out.println("Enter a string:");
    String str = input.nextLine().trim(); // Read and trim the input string
    
    // Create an instance of the PalindromeChecker class
    PalindromeChecker checker = new PalindromeChecker(str);
    
    // Display the result of the palindrome check
    checker.displayResult();
    input.close();
  }
}



