public class ArraysEquals {

    public static boolean arrayEquals(int[] number1, int[] number2) {

        if (number1 == null && number2 == null) {
            return true;
        }

        if (number1 == null || number2 == null) {
            return false;
        }

        if (number1.length != number2.length) {
            return false;
        }

        boolean isEqual = true;

        for (int index = 0; index < number1.length; index++) {

            for (int count = index; count <= index; count++) {

                if (number1[index] == number2[count]) {
                    if (number1[index] != number2[count]) {
                        isEqual = false;
                    }
                } else {
                    isEqual = false;
                }
            }
        }

        return isEqual;
    }
}
