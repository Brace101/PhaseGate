public class Task9 {

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        double length = 10;
        double width = 5;

        double area = rectangleArea(length, width);
        System.out.println("Area of the rectangle = " + area);
    }
}
