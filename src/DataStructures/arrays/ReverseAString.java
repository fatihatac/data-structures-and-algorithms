package DataStructures.arrays;


public class ReverseAString {

    public static void main(String[] args) {
        String str = "Fatih";
        System.out.println(reverse(str));

        System.out.println(reverse(str));
    }


    public static String reverse(String str) {
        if (str == null || str.length() < 2) {
            return "That is bad !";
        }
        int length = str.length();
        String reversedString = "";
        for (int i = length - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }

    public static String reverseBuiltIn(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
