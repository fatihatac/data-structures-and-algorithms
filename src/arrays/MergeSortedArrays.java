package arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] array1 = new int[]{0,3,4,31};
        int[] array2 = new int[]{3,4,6,30};

        int[] mergedArray  = mergeSortedArray(array1,array2);

        Arrays.stream(mergedArray).forEach(System.out::println);


    }

    public static int[] mergeSortedArray(int[] array1, int[] array2){
        int[] mergedArray =new int[array1.length + array2.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (k != array1.length && (j==array2.length || array1[k] <= array2[j])){
                mergedArray[i] = array1[k];
                k++;
            }else{
                mergedArray[i] = array2[j];
                j++;
            }
        }

        return mergedArray;
    }
}
