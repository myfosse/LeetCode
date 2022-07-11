package e1_two_sum;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    Solution solution = new Solution();

    int[] nums1 = {2, 7, 11, 15};
    int target1 = 9;
    // answer1 : 0, 1

    int[] nums2 = {3, 2, 4};
    int target2 = 6;
    // answer2 : 1, 2

    int[] nums3 = {3, 3};
    int target3 = 6;
    // answer2 : 0, 1

    int[] nums4 = {2, 5, 5, 11};
    int target4 = 10;
    // answer2 : 1, 2

    System.out.println("MY - O(n^2)");
    System.out.println(Arrays.toString(solution.twoSumMy(nums1, target1)));
    System.out.println(Arrays.toString(solution.twoSumMy(nums2, target2)));
    System.out.println(Arrays.toString(solution.twoSumMy(nums3, target3)));
    System.out.println(Arrays.toString(solution.twoSumMy(nums4, target4)));

    System.out.println();

    System.out.println("INTERNET - O(n)");
    System.out.println(Arrays.toString(solution.twoSumInternet(nums1, target1)));
    System.out.println(Arrays.toString(solution.twoSumInternet(nums2, target2)));
    System.out.println(Arrays.toString(solution.twoSumInternet(nums3, target3)));
    System.out.println(Arrays.toString(solution.twoSumInternet(nums4, target4)));
  }
}
