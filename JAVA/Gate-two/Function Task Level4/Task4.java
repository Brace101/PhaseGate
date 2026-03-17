public class Task4 {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " is equal to " + fahrenheit);
    }
}
