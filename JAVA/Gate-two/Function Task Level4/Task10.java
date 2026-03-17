public class Task10 {

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;     
            reversed = reversed * 10 + digit;
            number /= 10;         
        }
        return reversed;
    }

    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = reverseNumber(num);
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reversedNum);
    }
}
