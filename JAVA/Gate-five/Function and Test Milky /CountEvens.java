public class CountEvens{

    public static int countEvenNumbers (int [] numbers){

    int counter = 0;
    
        for (int index = 0; index < numbers.length; index++){

            if (numbers[index] % 2 == 0){
                    counter++;        
            }
        }
             return counter;
    }

}



