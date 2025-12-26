import java.util.Arrays;

class PalindromeArrayOrNot {
    public static void main(String[] args) {

        int [] array = ArrayInputFunction.OneDArrayInput();

        boolean isPalindrome = true;
        for (int i = 0; i < array.length/2; i++) {
            if(array[i] != array[array.length-1-i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(Arrays.toString(array));
        if (isPalindrome) {
            System.out.println("The array is a palindrome array.");
        } else {
            System.out.println("The array is not a palindrome array.");
        }
    }
}
