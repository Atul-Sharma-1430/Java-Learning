import java.util.Comparator;
import java.util.PriorityQueue;

class PriorityQGrading {

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrade() - t1.getGrade();
            }
        });

        pq.offer(new Student("Atul", 'B'));
        pq.offer(new Student("Aditya", 'A'));
        pq.offer(new Student("Rajesh", 'C'));
        pq.offer(new Student("Shaurya", 'D'));
        pq.offer(new Student("Krishna", 'E'));

        System.out.println(pq); // Here it will be printed normally as it is added in Queue

        // Popping will be done based in the Grades  A->B->C->D->E this will be order here while popping
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }

    private static class Student {
        private String name;
        private char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + " : " + grade;
        }


    }

    
}