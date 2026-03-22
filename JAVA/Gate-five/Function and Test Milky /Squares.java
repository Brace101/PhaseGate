public class Squares {

    public static int[] squares(int number) {
        int[] result = new int[number];

        for (int index = 0; index < number; index++) {
            result[index] = (index+ 1) * (index + 1);
        }
        return result;
    }
}




