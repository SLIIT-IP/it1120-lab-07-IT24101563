import java.util.Scanner;

public class IT24101563Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] marks = new double[4];
        double total = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ":");
            marks[i] = scanner.nextDouble();
            total += marks[i]; 
        }

        double average = total / 4;

        System.out.print("Average Marks: " + average);

        if (average >= 75 && average <= 100) {
            System.out.print("Grade: Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.print("Grade: Credit");
        } else if (average >= 0 && average < 50) {
            System.out.print("Grade: Fail");
        } else {
            System.out.print("Invalid marks entered.");
        }
       
    }
}
