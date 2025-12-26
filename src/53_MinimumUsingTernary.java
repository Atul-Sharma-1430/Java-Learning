import java.util.Scanner;

class MinimumUsingTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();

        MinimumUsingTernary mut = new MinimumUsingTernary();;
        System.out.printf("The minimum of %d and %d is %d " , num1 , num2 , mut.findMinimum(num1, num2));

        sc.close();
    }

    public int findMinimum(int num1 , int num2){
        return num1 < num2 ? num1 : num2;
    }
}

