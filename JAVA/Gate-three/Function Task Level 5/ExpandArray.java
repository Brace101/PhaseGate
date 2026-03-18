public class ExpandArray {
    public static int[] expandArray (int[] input, int newLength) {

        int[] result = new int[newLength];

        for (int index = 0; index < newLength; index++) {
            if (index < input.length) {
                result[index] = input[index];
            } else {
                result[index] = -1;
              }
        }

        return result;
    }
}
