import java.util.Scanner;

class OddEvenTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        OddEvenTernary obj = new OddEvenTernary();

        System.out.println(num + " is an " + obj.oddEvenTernary(num) + " number");
        sc.close();

        sc.close();
    }

    public String oddEvenTernary(int num){
        return num % 2 != 0 ? "odd" : "even";
    }

}
