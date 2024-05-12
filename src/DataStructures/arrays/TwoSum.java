package DataStructures.arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {3, 3};

        int[] twoSumArray = twoSum(array, 6);

        for (int num : twoSumArray) {
            System.out.println(num);
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
