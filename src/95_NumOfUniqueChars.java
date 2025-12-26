import java.util.*;

class NumOfUniqueChars {
    public static void main(String[] args) {
        
        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your String: ");
        String str = sc.nextLine();

        for (char ch : str.toCharArray()) {    // In build Function
            if(ch == ' ') continue;
            unique.add(ch);
        }

        System.out.println("The number of Unique Characters in " + str + " is " + unique.size());

        sc.close();
    }
}
