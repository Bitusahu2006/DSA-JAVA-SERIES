import java.util.*;

public class JavaIterator {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println("List = " + list);

        // Iterator create
        Iterator<Integer> iterator = list.iterator();

        // Traverse list
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
    }
}