package calculatorProject;

import java.util.Scanner;

public class CalculatorImplement implements CalculatorService{

    @Override
    public void addNumbers(Scanner scan) {

        System.out.println("Enter your first number");
        double addNumber1 = scan.nextDouble();

        System.out.println("Ent your second number");
        double addNumber2 = scan.nextDouble();

        double addResult = addNumber1 + addNumber2;
        System.out.println(" Add Result");
        System.out.println(addResult);
    }

    @Override
    public void subtractNumbers(Scanner scan) {

        System.out.println("Enter your first number");
        double subNumber1 = scan.nextDouble();

        System.out.println("Ent your second number");
        double subNumber2 = scan.nextDouble();

        double subtractResult = subNumber1 - subNumber2;

        System.out.println(" Subtract Result");
        System.out.println(subtractResult);
    }

    @Override
    public void multiplyNumbers(Scanner scan) {

        System.out.println("Enter your first number");
        double multiNumber1 = scan.nextDouble();

        System.out.println("Ent your second number");
        double multiNumber2 = scan.nextDouble();

        double multiplyResult = multiNumber1 * multiNumber2;

        System.out.println(" Multiply Result ");
        System.out.println(multiplyResult);

    }
    @Override
    public void divisionNumbers(Scanner scan) {

        System.out.println("Enter your first number");
        double divNumber1 = scan.nextDouble();

        System.out.println("Ent your second number");
        double divNumber2 = scan.nextDouble();

        double divisionResult = divNumber1 / divNumber2;
        System.out.println(" Division Result");
        System.out.println(divisionResult);

    }
}
