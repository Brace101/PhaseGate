import java.util.Arrays;

public class PrimeSorter {
    public static int[] getSortedPrimes(int[] input) {

        int count = 0;
        for (int num : input) {
            if (isPrime(num)) {
                count++;
            }
        }

        int[] primes = new int[count];
        int index = 0;

        for (int num : input) {
            if (isPrime(num)) {
                primes[index++] = num;
            }
        }

        Arrays.sort(primes);

        for (index = 0; index < primes.length / 2; index++) {
            int temp = primes[index];
            primes[index] = primes[primes.length - 1 - index];
            primes[primes.length - 1 - index] = temp;
        }

        return primes;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int index = 2; index <= Math.sqrt(number); index++) {
            if (number % index == 0) return false;
        }
        return true;
    }
}

