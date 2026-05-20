package selectiondecesionrepetitionarray;

import org.junit.Test;

import static org.junit.Assert.*;

public class Selections {


    String animalSelector(String animal){
        if(animal.equals("Dog")){
            System.out.println("This animal is a dog");
            return animal;
        } else if (animal.equals("Cat")) {
            System.out.println("This animal is a cat");
            return animal;
        }

        return "";
    }

    String isNumberEvenOrOdd(int num){

        if(num % 2 == 0){
            System.out.println("This number is even");
            return "even";
        } else {
            System.out.println("This number is odd");
            return "odd";
        }

    }

    boolean isNumberEven(int num){

        if(num % 2 == 0){
            System.out.println("This number is even");
            return true;
        } else {
            System.out.println("This number is odd");
            return false;
        }

    }

    String daysOfTheWeekIfElse(int day){

        if(day == 1){
            return "Monday";
        } else if (day == 2) {
            return "Tuesday";
        } else if (day == 3) {
            return "Wednesday";
        } else if (day == 4) {
            return "Thursday";
        } else if (day == 5) {
            return "Friday";
        } else if (day == 6) {
            return "Saturday";
        } else if (day == 7) {
            return "Sunday";
        } else {
            System.out.println("The number value must be from 1 to 7");
            return "error";
        }

    }

    String daysOfTheWeekSwitchCase(int day){

        switch (day){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "error";
        }

    }

    String addAbbreviationOfFormalTittle(String name, String gender, boolean isMarried){

        if(gender.equalsIgnoreCase("male")){
            return "Mr. " + name;
        } else if (gender.equalsIgnoreCase("female")) {
            if(isMarried == true){
                return "Mrs. " + name;
            } else {
                return "Ms. " + name;
            }
        } else {
            System.out.println("You need to enter either male or female for the gender value");
            return "error";
        }

    }




    @Test
    public void animalSelectorTest(){
        assertEquals("Cat", animalSelector("Cat"));
    }

    @Test
    public void isNumberEvenOrOddTest(){
        assertEquals("even", isNumberEvenOrOdd(10));
        assertEquals("odd", isNumberEvenOrOdd(11));

        assertTrue(isNumberEven(10));
        assertFalse(isNumberEven(11));
    }

    @Test
    public void daysOfTheWeekTest(){
        assertEquals("Monday", daysOfTheWeekIfElse(1));
        assertEquals("Tuesday", daysOfTheWeekIfElse(2));
        assertEquals("Wednesday", daysOfTheWeekIfElse(3));
        assertEquals("Thursday", daysOfTheWeekIfElse(4));
        assertEquals("Friday", daysOfTheWeekIfElse(5));
        assertEquals("Saturday", daysOfTheWeekIfElse(6));
        assertEquals("Sunday", daysOfTheWeekIfElse(7));

        assertEquals("error",  daysOfTheWeekIfElse(8));
        assertEquals("error",  daysOfTheWeekIfElse(0));


        assertEquals("Monday", daysOfTheWeekSwitchCase(1));
        assertEquals("Tuesday", daysOfTheWeekSwitchCase(2));
        assertEquals("Wednesday", daysOfTheWeekSwitchCase(3));
        assertEquals("Thursday", daysOfTheWeekSwitchCase(4));
        assertEquals("Friday", daysOfTheWeekSwitchCase(5));
        assertEquals("Saturday", daysOfTheWeekSwitchCase(6));
        assertEquals("Sunday", daysOfTheWeekSwitchCase(7));

        assertEquals("error",  daysOfTheWeekIfElse(8));
        assertEquals("error",  daysOfTheWeekIfElse(0));
    }

    @Test
    public void addAbbreviationOfFormalTittleTest(){
        assertEquals("Mr. Martin", addAbbreviationOfFormalTittle("Martin", "male", true));
        assertEquals("Mrs. Simona", addAbbreviationOfFormalTittle("Simona", "female", true));
        assertEquals("Ms. Angelina", addAbbreviationOfFormalTittle("Angelina", "female", false));

        assertEquals("error", addAbbreviationOfFormalTittle("Angelina", "random string", false));
    }


}
