import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        do {
            System.out.print("Enter the year: ");
            year = sc.nextInt();
        } while(year < 0);

        if( year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)){
            System.out.println(year + " is a leap Year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
