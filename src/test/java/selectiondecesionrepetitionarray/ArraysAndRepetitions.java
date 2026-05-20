package selectiondecesionrepetitionarray;

import org.junit.Test;

import java.util.Arrays;

public class ArraysAndRepetitions {


    @Test
    public void arrays(){

        int[] arrayIntegers = new int[5];
        arrayIntegers[0] = 900;
        arrayIntegers[1] = 20;
        arrayIntegers[2] = 1000;
        arrayIntegers[3] = 999;
        arrayIntegers[4] = 1;

        int[] numbersForSorting = {5,2,1,4,3};
        char[] charsForSorting = {'c','b','a','e','d'};

        //printing separate elements of array by index
        System.out.println("First nummber of the integer array -> " + arrayIntegers[0]);
        System.out.println("Second nummber of the integer array -> " + arrayIntegers[1]);
        System.out.println("Third nummber of the integer array -> " + arrayIntegers[2]);
        System.out.println("Fourth nummber of the integer array -> " + arrayIntegers[3]);
        System.out.println("Fifth nummber of the integer array -> " + arrayIntegers[4]);

        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] dayOfTheWeekCopy;
        String[] workingDays;
        String[] weekend;
        String[] undefinedArray = new String[7];

        System.out.println(" ");
        System.out.println("First day of the week -> " + daysOfTheWeek[0]);
        System.out.println("Second day of the week -> " + daysOfTheWeek[1]);
        System.out.println("Third day of the week -> " + daysOfTheWeek[2]);
        System.out.println("Fourth day of the week -> " + daysOfTheWeek[3]);
        System.out.println("Fifth day of the week -> " + daysOfTheWeek[4]);
        System.out.println("Sixth day of the week -> " + daysOfTheWeek[5]);
        System.out.println("Seventh day of the week -> " + daysOfTheWeek[6]);

        //printing whole array with for loop
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("for cycle integer array ->" + arrayIntegers[i]);
        }

        for(int i = 0 ; i < 7 ; i++){
            System.out.println("for cycle days of the week array ->" + daysOfTheWeek[i]);
        }
        // i = 0 Monday i++ (0+1, i=1) 0 < 7
        // i = 1 Tuesday i++ (1+1, i=2) 1 < 7
        // i = 2 Wednesday i++ (2+1, i=3) 2 < 7
        // i = 3 Thursday i++ (3+1, i=4) 3 < 7
        // i = 4 Friday i++ (4+1, i=5) 4 < 7
        // i = 5 Saturday i++ (5+1, i=6) 5 < 7
        // i = 6 Sunday i++ (6+1, i=7) 6 < 7
        //------------------------------------
        // i = 7  7 < 7 XXXXXXXXX


        //copy of array
        dayOfTheWeekCopy = Arrays.copyOf(daysOfTheWeek, 7);

        for(int i = 0 ; i < daysOfTheWeek.length ; i++){
            System.out.println("Copied day of the week array value -> " + dayOfTheWeekCopy[i]);
        }

        //copy of range
        workingDays = Arrays.copyOfRange(daysOfTheWeek, 0, 5);
        weekend = Arrays.copyOfRange(daysOfTheWeek, 5, 7);

        for(int i = 0 ; i < workingDays.length ; i++){
            System.out.println("Work day => " + workingDays[i]);
        }

        for(int i = 0 ; i < weekend.length ; i++){
            System.out.println("Weekend day => " + weekend[i]);
        }

        //fill
        Arrays.fill(undefinedArray, "Some value");

        for(int i = 0 ; i < undefinedArray.length ; i++){
            System.out.println("Undefined array value => " + undefinedArray[i]);
        }

        //sort
        Arrays.sort(numbersForSorting);
        Arrays.sort(charsForSorting);

        for(int i = 0 ; i < numbersForSorting.length ; i++){
            System.out.println("Sorted numbers array value => " + numbersForSorting[i]);
        }

        for(int i = 0 ; i < charsForSorting.length ; i++){
            System.out.println("Sorted characters array value => " + charsForSorting[i]);
        }

    }
}
