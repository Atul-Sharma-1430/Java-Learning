class Course {

    static int maxCapacity;

    String courseName;

    int enrollments;

    String[] enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity; // ClassReference is used bcz it is s static member
    }

    public void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    public void unenrollStudent(String studentName) {
        enrollments--;
        System.out.println("Student " + studentName + " is unenrolled");
    }

    public static void main(String[] args) {




    }
}
