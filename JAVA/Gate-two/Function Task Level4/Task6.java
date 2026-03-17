public class Task6 {

    public static int largest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int max = largest(num1, num2);
        System.out.println("The largest number is: " + max);
    }
}
