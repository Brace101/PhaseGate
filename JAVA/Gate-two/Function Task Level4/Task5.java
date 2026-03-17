public class Task5 {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int index = 2; index <= Math.sqrt(number); index++) {
            if (number % index == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int num = 29;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
