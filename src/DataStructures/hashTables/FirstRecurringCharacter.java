package DataStructures.hashTables;

import java.util.Hashtable;

public class FirstRecurringCharacter {

    //Google Question
    //Given an array = [2,5,1,2,3,5,1,2,4]:
    //It should return 2

    //Given an array = [2,1,1,2,3,5,1,2,4]:
    //It should return 1

    //Given an array = [2,3,4,5]:
    //It should return undefined

    public int firstRecurringCharacter(int[] array) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < array.length; i++) {
            if (!hashtable.containsKey(array[i])) {
                hashtable.put(array[i], i);
            } else {
                return array[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstRecurringCharacter firstRecurringCharacter = new FirstRecurringCharacter();

        System.out.println(firstRecurringCharacter.firstRecurringCharacter(new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4}));
        System.out.println(firstRecurringCharacter.firstRecurringCharacter(new int[]{2, 1, 1, 2, 3, 5, 1, 2, 4}));
        System.out.println(firstRecurringCharacter.firstRecurringCharacter(new int[]{2, 3, 4, 5}));
        System.out.println(firstRecurringCharacter.firstRecurringCharacter(new int[]{2, 5, 5, 2, 3, 5, 1, 2, 4}));
    }
    //Bonus... What if we had this:
    // [2,5,5,2,3,5,1,2,4]
    // return 5 because the pairs are before 2,2
}
