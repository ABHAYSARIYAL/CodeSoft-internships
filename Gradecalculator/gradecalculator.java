package Gradecalculator;
import java.util.Scanner;
public class gradecalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("welcome!");
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            // Initialization of variables
            int totalMarks = 0;
            double averagePercentage;

            // Input marks for each subject
            for (int i = 1; i <= numSubjects; i++) {
                System.out.print("Enter marks for subject " + i + " : ");
                int marks = scanner.nextInt();
                totalMarks += marks;
            }

            // Calculate average percentage
            averagePercentage = (double) totalMarks / numSubjects;

            // Assign grade based on average percentage
            String grade;
            if (averagePercentage >= 90) {
                grade = "A+";
            } else if (averagePercentage >= 75) {
                grade = "A";
            } else if (averagePercentage >= 60) {
                grade = "B";
            } else if (averagePercentage >= 40) {
                grade = "C";
            } else if (averagePercentage >= 33){
                grade = "D";
            }
            else {
                grade = "F";
            }

            // Display results
            System.out.println("---------------------------------------------------------------");
            System.out.println("\nResults:");
            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
            System.out.println("Grade: " + grade);
            System.out.println("---------------------------------------------------------------");
            scanner.close();
        }
    }

