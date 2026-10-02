public class linearsearch {

    public static boolean linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 20;

        boolean ans = linearSearch(arr, target);

        System.out.println(ans);
    }
}