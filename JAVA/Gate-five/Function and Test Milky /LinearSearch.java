public class LinearSearch {

    public static int linearSearch(int[] numbers , int target) {

        for (int index = 0; index < numbers.length; index++) {

            if (numbers[index] == target) {
                return index; 
            }
        }
                return -1;
    }
}

