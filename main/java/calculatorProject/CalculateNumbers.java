package calculatorProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CalculatorImplement cal = new CalculatorImplement();

        int option = 0;


            do {
                try {
                System.out.println(" ---------- Welcome to Calculator App -----------");
                System.out.println("      ");
                System.out.println("1 - Add Numbers");
                System.out.println("2 - Subtract Numbers");
                System.out.println("3 - Multiply Numbers");
                System.out.println("4 - Divide Numbers");
                System.out.println("5 - Exit");

                System.out.println("Enter your Option");

                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        cal.addNumbers(scanner);
                        break;
                    case 2:
                        cal.subtractNumbers(scanner);
                        break;
                    case 3:
                        cal.multiplyNumbers(scanner);
                        break;
                    case 4:
                        cal.divisionNumbers(scanner);
                        break;
                    case 5:
                        System.out.println("Exiting the Program, Thank you bye");
                        break;
                    default:
                        System.out.println("Invalid option Number");
                }

                } catch (InputMismatchException e) {
                    System.out.println(" Invalid Value : "  + e.getMessage());
                    System.out.println("Please input Only number");
                }
                return;
            } while (option != 5);




       // scanner.close();
    }

}
