public class StringBasics {

    public static void main(String[] args) {

        // Create a String
        String str = "Hello World";

        System.out.println("Original String: " + str);

        // Find length
        System.out.println("Length: " + str.length());

        // Get character using index
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Character at index 6: " + str.charAt(6));

        // Traverse String
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        // Compare two Strings
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println("Equal: " + s1.equals(s2));

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Check if String contains something
        System.out.println(
                "Contains World: " +
                str.contains("World")
        );

        // Check starting characters
        System.out.println(
                "Starts with Hello: " +
                str.startsWith("Hello")
        );

        // Check ending characters
        System.out.println(
                "Ends with World: " +
                str.endsWith("World")
        );

        // Find first occurrence
        System.out.println(
                "Index of o: " +
                str.indexOf('o')
        );

        // Find last occurrence
        System.out.println(
                "Last index of o: " +
                str.lastIndexOf('o')
        );

        // Get part of String
        System.out.println(
                "Substring: " +
                str.substring(0, 5)
        );

        // Get String from a specific index
        System.out.println(
                "Substring from index 6: " +
                str.substring(6)
        );

        // Replace String
        System.out.println(
                "Replace: " +
                str.replace("Hello", "Hi")
        );

        // Replace character
        System.out.println(
                "Replace character: " +
                str.replace('o', 'a')
        );

        // Remove extra spaces from beginning and end
        String name = "   Bitu Sahu   ";

        System.out.println("Trim: " + name.trim());

        // Check if String is empty
        String empty = "";

        System.out.println(
                "Is empty: " +
                empty.isEmpty()
        );

        // Check if String contains only spaces
        String blank = "   ";

        System.out.println(
                "Is blank: " +
                blank.isBlank()
        );

        // Join two Strings
        String firstName = "Bitu";
        String lastName = "Sahu";

        String fullName = firstName + " " + lastName;

        System.out.println("Full name: " + fullName);

        // Split String into parts
        String sentence = "Java is easy";

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // Convert String into character array
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Convert character array into String
        char[] chars = {'J', 'a', 'v', 'a'};

        String newString = new String(chars);

        System.out.println("New String: " + newString);

        // Compare Strings using compareTo
        System.out.println(
                "Compare: " +
                "Apple".compareTo("Banana")
        );

        // Reverse String using StringBuilder
        String original = "Hello";

        StringBuilder sb = new StringBuilder(original);

        sb.reverse();

        System.out.println("Reverse: " + sb);

        // Check palindrome
        String palindrome = "madam";

        String reverse = new StringBuilder(palindrome)
                .reverse()
                .toString();

        if (palindrome.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // Create StringBuilder
        StringBuilder builder = new StringBuilder();

        // Add characters or Strings
        builder.append("Hello");
        builder.append(" World");

        System.out.println("After append: " + builder);

        // Change character
        builder.setCharAt(0, 'Y');

        System.out.println("After setCharAt: " + builder);

        // Insert String
        builder.insert(0, "Java ");

        System.out.println("After insert: " + builder);

        // Delete characters
        builder.delete(0, 5);

        System.out.println("After delete: " + builder);

        // Delete one character
        builder.deleteCharAt(0);

        System.out.println("After deleteCharAt: " + builder);

        // Reverse StringBuilder
        builder.reverse();

        System.out.println("After reverse: " + builder);

        // Convert StringBuilder into String
        String result = builder.toString();

        System.out.println("Final String: " + result);
    }
}