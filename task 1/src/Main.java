import java.util.ArrayList;
import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> grades = new ArrayList<>();

        // Input loop
        System.out.println("Enter the students' grades (enter -1 to finish):");
        while (true) {
            System.out.print("Enter grade (or -1 to finish): ");
            double grade = scanner.nextDouble();
            if (grade == -1) {
                break;
            }
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
            return;
        }

        // Compute average
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();

        // Find highest and lowest grades
        double highest = grades.get(0);
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        // Output results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }
}
