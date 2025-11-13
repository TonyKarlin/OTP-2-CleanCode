package program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Log log = new Log();

        log.printLog("Enter first number:");
        double num1 = sc.nextDouble();

        log.printLog("Enter second number:");
        double num2 = sc.nextDouble();

        log.printLog("Sum: " + Calculator.addValues(num1, num2));
        log.printLog("Subtraction: " + Calculator.subtractValues(num1, num2));
        log.printLog("Multiply: " + Calculator.multiplyValues(num1, num2));
        log.printLog("Division: " + Calculator.divisionValues(num1, num2));
    }
}
