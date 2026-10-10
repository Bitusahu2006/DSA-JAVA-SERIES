import java.util.*;
public class ArrayListInterface {
    public static void main(String[] args){
        List<Integer>list=new ArrayList<>();
        list.add(40);
        list.add(50);
        list.add(10);
        list.add(70);
        list.add(20);

        System.out.print("Orignal list: "+ list+" ");

        System.out.println();
        Collections.sort(list);

        System.out.print("Accending order Sorted list: "+ list+" ");
        System.out.println();   
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Decending Order sorted list: "+list+" ");

    }
}
