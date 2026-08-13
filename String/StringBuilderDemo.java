public class StringBuilderDemo {

    public static void main(String[] args) {

        // 1. Create StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original: " + sb);


        // 2. append()
        sb.append(" World");

        System.out.println("After append: " + sb);


        // 3. insert()
        sb.insert(5, " Java");

        System.out.println("After insert: " + sb);


        // 4. delete()
        sb.delete(5, 10);

        System.out.println("After delete: " + sb);


        // 5. deleteCharAt()
        sb.deleteCharAt(5);

        System.out.println("After deleteCharAt: " + sb);


        // 6. setCharAt()
        sb.setCharAt(0, 'Y');

        System.out.println("After setCharAt: " + sb);


        // 7. charAt()
        System.out.println("Character at index 1: " + sb.charAt(1));


        // 8. length()
        System.out.println("Length: " + sb.length());


        // 9. reverse()
        sb.reverse();

        System.out.println("After reverse: " + sb);


        // 10. Convert StringBuilder to String
        String str = sb.toString();

        System.out.println("String: " + str);
    }
}