import java.util.Scanner;

public class PalindroneCheckerApp {

    // Method to check palindrome
    public static void checkPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Use Case 1
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        checkPalindrome(num1);

        // Use Case 2
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        checkPalindrome(num2);

        sc.close();
    }
}