import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of students: ");
        int totalStudents = sc.nextInt();
        sc.nextLine();  // consume leftover newline

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentMarks = new ArrayList<>();

        // Input
        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            studentNames.add(name);

            System.out.print("Enter marks of " + name + ": ");
            int marks = sc.nextInt();
            sc.nextLine();
            studentMarks.add(marks);

            System.out.println();
        }

        // Calculations
        int highest = studentMarks.get(0);
        int lowest = studentMarks.get(0);
        int sum = 0;

        for (int marks : studentMarks) {
            sum += marks;

            if (marks > highest)
                highest = marks;

            if (marks < lowest)
                lowest = marks;
        }

        double average = (double) sum / totalStudents;

        // Output Summary
        System.out.println("\n===== STUDENT MARKS SUMMARY =====");
        for (int i = 0; i < totalStudents; i++) {
            System.out.println((i + 1) + ". " + studentNames.get(i) + " - " + studentMarks.get(i) + " marks");
        }

        System.out.println("---------------------------------");
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);
        System.out.println("=================================\n");
    }
}
