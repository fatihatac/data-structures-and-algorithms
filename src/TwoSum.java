import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] array, int target) {
        int[] targetArray = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }

        for (int i = 0; i < array.length; i++) {
            int targetNumber = target - array[i];
            if (map.containsKey(targetNumber) && i != map.get(targetNumber)) {
                targetArray[0] = i;
                targetArray[1] = map.get(targetNumber);
                return targetArray;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array1 = twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] array2 = twoSum(new int[]{1, 3, 10, 11, 14}, 13);
        int[] array3 = twoSum(new int[]{3, 2, 4}, 6);
        int[] array4 = twoSum(new int[]{3, 3}, 6);

        System.out.printf("[%s,%s]", array1[0], array1[1]);
        System.out.printf("[%s,%s]", array2[0], array2[1]);
        System.out.printf("[%s,%s]", array3[0], array3[1]);
        System.out.printf("[%s,%s]", array4[0], array4[1]);
    }
}
