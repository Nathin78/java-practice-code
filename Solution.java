import java.util.*;

class Solution {

    public static int[] getConcatenation(int[] nums) {
        int ind = 0;
        int[] arr = new int[2 * nums.length];

        for(int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        for(int i = nums.length; i < arr.length; i++) {
            arr[i] = nums[ind++];
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = getConcatenation(nums);

        System.out.println("Concatenated array:");

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}