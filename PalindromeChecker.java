import java.util.Scanner;

class PalindromeChecker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string for validation: ");
        String inputString = scanner.nextLine();
        System.out.print(isPalindrome(inputString));
        scanner.close();
    }

    private static String isPalindrome(String string) {
        String input = string.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(input);
        int length = input.length();
        for (int i = 0; i <=length / 2; i++) {
            if (!input.substring(i, i + 1).equals(input.substring(length - 1 - i, length - i))) {
                return "Not a Palindrome";
            }
        }
        return "Palindrome";
    }
}
