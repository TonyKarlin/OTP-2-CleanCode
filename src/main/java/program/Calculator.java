package program;

public class Calculator {

    private Calculator() {
        throw new IllegalArgumentException("Utility class");
    }

    public static double addValues(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtractValues(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplyValues(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisionValues(double num1, double num2) {
        return num1 / num2;
    }
}
