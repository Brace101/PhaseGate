public class MoveZeros {

    public static int[] moveZerosToEnd(int[] input) {
        int[] result = new int[input.length];
        int index = 0;

        for (int num : input) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}
