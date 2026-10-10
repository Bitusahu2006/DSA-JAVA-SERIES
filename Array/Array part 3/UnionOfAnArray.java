
public class UnionOfAnArray {

    static void getUnion(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] arr = new int[n1 + n2];
        int k = 0;

        for (int i = 0; i < n1; i++) {
            arr[k++] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (arr[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                arr[k++] = arr2[i];
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 9, 4};
        int arr2[] = {1, 2, 3, 4, 6};

        getUnion(arr1, arr2);
    }
}