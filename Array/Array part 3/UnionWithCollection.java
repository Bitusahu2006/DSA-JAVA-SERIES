
import java.util.*;

public class UnionWithCollection {

    static void getUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr1) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        for (int num : arr2) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 9, 4};
        int arr2[] = {1, 2, 3, 4, 6};

        getUnion(arr1, arr2);
    }
}