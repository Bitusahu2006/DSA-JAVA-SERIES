public class StringMethod {
    public static void main(String[] args) {

        String str = "Hello World";
        String str2 = "hello world";

        // 1. length()
        System.out.println(str.length());
        // Output: 11


        // 2. charAt(index)
        System.out.println(str.charAt(1));
        // Output: e


        // 3. substring(beginIndex, endIndex)
        System.out.println(str.substring(0, 5));
        // Output: Hello


        // 4. contains()
        System.out.println(str.contains("World"));
        // Output: true


        // 5. equals()
        System.out.println(str.equals(str2));
        // Output: false


        // 6. equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase(str2));
        // Output: true


        // 7. toUpperCase()
        System.out.println(str.toUpperCase());
        // Output: HELLO WORLD


        // 8. toLowerCase()
        System.out.println(str.toLowerCase());
        // Output: hello world


        // 9. trim()
        String name = "   Bitu   ";
        System.out.println(name.trim());
        // Output: Bitu


        // 10. split()
        String fruits = "Apple,Banana,Mango";
        String[] arr = fruits.split(",");

        for (String fruit : arr) {
            System.out.println(fruit);
        }
        // Output:
        // Apple
        // Banana
        // Mango


        // 11. startsWith()
        System.out.println(str.startsWith("Hello"));
        // Output: true


        // 12. endsWith()
        System.out.println(str.endsWith("World"));
        // Output: true


        // 13. valueOf()
        int num = 100;
        String s = String.valueOf(num);

        System.out.println(s);
        // Output: 100


        // 14. toCharArray()
        char[] chars = str.toCharArray();

        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        // Output: H e l l o   W o r l d


        // 15. isEmpty()
        String empty = "";
        System.out.println(empty.isEmpty());
        // Output: true


        // 16. isBlank()
        String blank = "   ";
        System.out.println(blank.isBlank());
        // Output: true


        // 17. replace()
        String text = "Java is easy";

        System.out.println(text.replace('a', 'o'));
        // Output: Jovo is eosy
    }
}