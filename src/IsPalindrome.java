public class IsPalindrome {

    public static void main(String[] args) {
//        System.out.println(isPalindromeString(10));
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindromeString(int x) {
        String number = String.valueOf(x);
        int length = number.length();
        boolean isPalindrome = false;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == number.charAt(length - 1 - i)) {
                isPalindrome = true;
            }

        }
        return isPalindrome;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        boolean isPalindrome = false;
        int temp = x;
        int reversedSum = 0;
        int remainder;
        while (temp != 0) {
            remainder = temp % 10;
            reversedSum = reversedSum * 10 + remainder;
            temp = temp / 10;

        }
        if (x == reversedSum) {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}
