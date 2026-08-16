public class isPalindromee  {

    // Reverse String
    static String reverseString(String str) {

        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }

        return reverse;
    }

    // Check Palindrome
    static boolean isPalindrome(String str) {

        String original = str;
        String reverse = reverseString(original);

        // Compare original and reverse
        for(int i = 0; i < original.length(); i++) {

            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);

            if(ch1 != ch2) {
                // No match
                return false;
            }
        }

        // All characters matched
        return true;
    }

    public static void main(String args[]) {

        String str = "NOON";

        if(isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}