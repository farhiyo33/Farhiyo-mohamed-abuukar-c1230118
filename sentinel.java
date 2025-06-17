import java.util.Scanner;

    public class sentinel {
        public static void main(String[] args) {
            // Sentinel Value
            int sum = 0;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter numbers to add \nPress n to exit: ");
            System.out.println("Enter an integer number: ");

            String userinput = input.nextLine();

            while (!userinput.equalsIgnoreCase("n")) {
                int number =Integer.parseInt(userinput);
                sum += number;

                System.out.println("Enter an integer number: ");
                input.nextLine();
            }

            System.out.println("The Sum: "+sum);
        }
    }
