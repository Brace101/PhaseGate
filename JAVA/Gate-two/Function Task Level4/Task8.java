public class Task8 {

    public static void printMultiplicationTable(int number) {
        System.out.println("Multiplication Table of " + number + ":");
        for (int index = 1; index <= 12; index++) {
            System.out.println(number + " x " + index + " = " + (number * index));
        }
    }
            
    public static void main(String[] args) {
        int num = 7;
        printMultiplicationTable(num);
    }
}
