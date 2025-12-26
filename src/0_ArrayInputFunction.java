import java.util.Scanner;

class ArrayInputFunction {

    public static int[] OneDArrayInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();

        int [] array = new int[size];
        System.out.println("Enter " + size + " numbers: ");
        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        return array;
    }

    public static int[][] TwoDArrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int [][] array = new int[rows][cols];

        System.out.println("Enter elements of the array:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();

        return array;
    }
}
