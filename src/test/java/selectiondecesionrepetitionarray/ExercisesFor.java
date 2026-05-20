package selectiondecesionrepetitionarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExercisesFor {

    int sumOfFourthFifthSixthElementInArray(int[] numbers){
        return numbers[3] + numbers[4] + numbers[5];
    }

    void printEvenNumbers(int[] numbers){
        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }
        }
    }

    void printMultiplicationTableForSeven(){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(i + " * 7 = " + (i * 7));
        }
    }

    int howManyVowels(String text){
        int vowelCount = 0;
        text = text.toLowerCase();

        for(int i = 0 ; i < text.length() ; i++){
            char character = text.charAt(i);
            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                vowelCount++;
            }
        }

        return vowelCount;
    }

    @Test
    public void sumOfFourthFifthSixthElementInArrayTest(){
        int[] numbersArray = {2,14,7,22,66,76,999,11,156,0};

        assertEquals(164, sumOfFourthFifthSixthElementInArray(numbersArray));
    }

    @Test
    public void printEvenNumbersTest(){
        int[] numbersArray = {2,14,7,22,66,76,999,11,156,0};

        printEvenNumbers(numbersArray);
    }

    @Test
    public void printMultiplicationTableForSevenTest(){
        printMultiplicationTableForSeven();
    }

    @Test
    public void repeatedNumberInArray(){
        int[] numbersArray = {2,5,6,4,5};

        for(int i = 0 ; i < numbersArray.length - 1 ; i++){
            for(int j = i + 1 ; j < numbersArray.length ; j++){
                if(numbersArray[i] == numbersArray[j]){
                    System.out.println("Repeated number in the array is: " + numbersArray[i]);
                }
            }
        }
    }

    //cycle 1: i = 0 (2) compare j=1 2==5 X j=2 2==6 X j=3 2==4 X j=4 2==5 X -> i++
    //cycle 2: i = 1 (5) compare j=2 5==6 X j=3 5==4 X j=4 5==5 YES print 5 -> i++
    //cycle 3: i = 2 (6) compare j=3 6==4 X j=4 6==5 X -> i++
    //cycle 4: i = 3 (4) compare j=4 4==5 X
    //cycle 5: i = 4 (5) compare j=5

    @Test
    public void howManyVowelsTest(){
        assertEquals(5, howManyVowels("Creative Hub"));
    }
}
