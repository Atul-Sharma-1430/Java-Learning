import java.util.Scanner;

class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Score: ");
        int score = sc.nextInt();

        StudentScoreTernary st = new StudentScoreTernary();
        System.out.println("You are under " + st.studentCategory(score) + " category" );

        sc.close();

    }

    public String studentCategory(int score) {
        return score > 80 ? "High" : (score > 50 ?  "Moderate" : "Low");
    }
}
