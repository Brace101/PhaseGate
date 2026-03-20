import java.util.Arrays;

public class ReplaceNegatives {

    public static int[] replaceNegativesWithZero(int[] input) {
        for (int index = 0; index < input.length; index++) {
            if (input[index] < 0) {
                input[index] = 0;
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = {5, -9, 3, -6, 2, -11};
        int[] output = replaceNegativesWithZero(input);
        System.out.println(Arrays.toString(output));
    }
}
