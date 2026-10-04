public class Intersection {

    static int[] getIntersectionElement(int nums1[], int nums2[]) {

        int[] result = new int[nums1.length];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    result[k] = nums1[i];
                    k++;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 3, 4, 9};

        int[] arr = getIntersectionElement(arr1, arr2);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

