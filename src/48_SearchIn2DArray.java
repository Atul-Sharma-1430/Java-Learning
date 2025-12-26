import java.util.Scanner;

class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] array = ArrayInputFunction.TwoDArrayInput();

        int rows = array.length;
        int cols = array[0].length;

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(array[i][j] == key) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.println("Element not found in the array");
        }
    }
}
