import java.util.Scanner;

class AbsoluteUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        AbsoluteUsingTernary obj = new AbsoluteUsingTernary();
        System.out.print("The absolute value of " + num + " is: " + obj.absoluteOf(num));

        sc.close();
    }

    public int absoluteOf(int num) {
        return num >= 0 ? num : -num;
    }
}

