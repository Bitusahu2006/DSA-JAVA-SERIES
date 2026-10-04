public class Alternate {

    static void arrange(int nums[]) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            System.out.print(nums[start] + " ");

            if (start != end) {
                System.out.print(nums[end] + " ");
            }

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int nums[] = {1, 4, 3, 2, 6, 9};

        arrange(nums);
    }
}