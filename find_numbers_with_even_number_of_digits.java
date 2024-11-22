class Solution {
public    static int findNumbers(int[] numbers) { 

        int totalEvens = 0;

        for (int number : numbers) {

            Boolean isEvenNumber = false;

            if (number < 10) {
                isEvenNumber = false;
            } else {

                while (number >= 10) {

                    number = number / 10;
                    isEvenNumber = !isEvenNumber;
                }
            }


            if(isEvenNumber) {
                totalEvens++;
            }
 
        } 
        return totalEvens;
    }

   
}
