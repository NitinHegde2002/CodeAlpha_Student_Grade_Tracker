import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create an array to store grades
        double[] grades = new double[numStudents];

        // Input grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        // Compute average, highest, and lowest grades
        double sum = 0;
        double highestGrade = grades[0];
        double lowestGrade = grades[0];
        for (double grade : grades) {
            sum += grade;
            if (grade > highestGrade) {
                highestGrade = grade;
            }
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }
        double average = sum / numStudents;

        // Display results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);

        scanner.close();
    }
}