import java.util.*;

public class JavaListInterface {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);

        System.out.println("list1 = " + list1);


        List<Integer> list2 = new ArrayList<>();

        list2.add(9);
        list2.add(10);
        list2.add(11);

        System.out.println("list2 = " + list2);


        // addAll()
        list1.addAll(list2);
        System.out.println("After addAll() = " + list1);


        // get()
        System.out.println("get(5) = " + list1.get(5));


        // set()
        list1.set(0, 100);
        System.out.println("After set(0, 100) = " + list1);


        // remove(index)
        list1.remove(1);
        System.out.println("After remove(1) = " + list1);


        // remove(object)
        list1.remove(Integer.valueOf(7));
        System.out.println("After remove(7) = " + list1);


        // contains()
        System.out.println("Contains 10? " + list1.contains(10));
        System.out.println("Contains 50? " + list1.contains(50));


        // size()
        System.out.println("Size = " + list1.size());


        // removeAll()
        list1.removeAll(list2);
        System.out.println("After removeAll(list2) = " + list1);


        // toArray()
        Object[] arr = list1.toArray();

        System.out.println("Array elements:");
        for (Object x : arr) {
            System.out.println(x);
        }


        // clear()
        list1.clear();
        System.out.println("After clear() = " + list1);


        // size after clear
        System.out.println("Size after clear = " + list1.size());
    }
}