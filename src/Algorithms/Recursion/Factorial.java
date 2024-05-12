package Algorithms.Recursion;

public class Factorial {

    public static int findFactorialRecursive(int number) {
        if (number == 0) {
            return 1;
        }
        return number * findFactorialRecursive(number - 1);
    }

    public static int findFactorialIterative(int number) {
        int answer = 1;

        for (int i = 0; i <= number; i++) {
            answer = answer * i;
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(findFactorialRecursive(6));
    }
}
