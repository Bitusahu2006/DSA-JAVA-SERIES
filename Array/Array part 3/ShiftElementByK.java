import java.util.*;
public class ShiftElementByK {

    static void rightShift(int nums[], int k) {
        int n = nums.length;
        k = k % n;

        for (int j = 0; j < k; j++) {
            int temp = nums[n - 1];

            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }

            nums[0] = temp;
        }

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of K: ");
        int k=sc.nextInt();
        // int k = 2;
        rightShift(nums, k);
    }
}