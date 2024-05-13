package fundamentals;

public class Temperature {
    public static void main(String[] args) {
        double fahrenheit = 150;
        double celsius;
        final double variable = 5d/9d;
        celsius = (fahrenheit - 32) * variable;
        System.out.println("The result is: " + celsius);
    }
}
