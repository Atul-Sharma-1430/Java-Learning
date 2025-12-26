import java.util.Scanner;

class ConcatenateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        sc.nextLine();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter word #" + (i + 1) + ": ");
            words[i] = sc.nextLine();
        }

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word);
        }

        System.out.println("Concatenated string: " + sb.toString());

        sc.close();
    }
}
