public class IntersectionElement {

    static void getIntersection(int[] nums1, int[] nums2) {

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    System.out.print(nums1[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 3, 4, 9};

        getIntersection(arr1, arr2);
    }
}