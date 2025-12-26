import java.util.Scanner;
/*
<< : Left shift (multiplies the number by 2^positions)
>> : Right shift (divides the number by 2^positions)
>>> : Unsigned right shift (fills leftmost bits with 0)
 */

class ShiftOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter number of positions to shift: ");
        int positions = sc.nextInt();

        // Left Shift
        int leftShift = num << positions;
        System.out.println(num + " << " + positions + " = " + leftShift);

        // Right Shift
        int rightShift = num >> positions;
        System.out.println(num + " >> " + positions + " = " + rightShift);

        // Optional: Unsigned right shift
        int unsignedRightShift = num >>> positions;
        System.out.println(num + " >>> " + positions + " = " + unsignedRightShift);

        sc.close();
    }
}
