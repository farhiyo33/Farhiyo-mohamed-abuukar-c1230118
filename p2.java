import java.util.Scanner;

public class p2 {
    static final int STUDENTS = 3;
    static String[] names = new String[STUDENTS];
    static int[] grades = new int[STUDENTS];
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Grade Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show Average, Highest, Lowest Grades");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            input.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    addStudent(input);
                    break;
                case 2:
                    showStats();
                    break;
                case 3:
                    searchStudent(input);
                    break;
                case 4:
                    System.out.println("Exiting Program.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }

    static void addStudent(Scanner input) {
        if (count < STUDENTS) {
            System.out.print("Enter student name: ");
            names[count] = input.nextLine();
            System.out.print("Enter grade (0–100): ");
            grades[count] = input.nextInt();
            count++;
        } else {
            System.out.println("Maximum number of students reached.");
        }
    }

    static void showStats() {
        if (count == 0) {
            System.out.println("No students added yet.");
            return;
        }

        int sum = 0, max = grades[0], min = grades[0];
        for (int i = 0; i < count; i++) {
            sum += grades[i];
            if (grades[i] > max) max = grades[i];
            if (grades[i] < min) min = grades[i];
        }

        double average = (double) sum / count;
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + max);
        System.out.println("Lowest Grade: " + min);
    }

    static void searchStudent(Scanner input) {
        System.out.print("Enter student name to search: ");
        String searchName = input.nextLine();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + names[i] + " - Grade: " + grades[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
