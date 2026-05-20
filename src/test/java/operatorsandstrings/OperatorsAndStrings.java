package operatorsandstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperatorsAndStrings {

    int additionOfTwoNumbersWithParams(int x, int y){
        return x+y;
    }

    int substractionOfTwoNumbersWithParams(int x, int y){
        return x-y;
    }

    int multiplicationOfTwoNumbersWithParams(int x, int y){
        return x*y;
    }

    int divisionOfTwoNumbersWithParams(int x, int y){
        return x/y;
    }

    boolean boolMethod(){
        return 10==10;
    }

    void swapTwoNumbers(int num1, int num2){

        int temp;

        System.out.println("Before swap -> num1:" + num1 + ", num2: " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Before swap -> num1:" + num1 + ", num2: " + num2);

    }

    @Test
    public void swapTwoNumbersTest(){
        swapTwoNumbers(10,20);
    }

    @Test
    public void incrementDecrementTest(){

        int x = 10;

        System.out.println("Before increment: " + x);

        x++; // 10 + 1

        System.out.println("After increment: " + x); //11

        x--; // 11 - 1

        System.out.println("After decrement: " + x);

        x+=5;//10 + 5

        assertEquals(15, x);

        x-=5; //15 - 5

        assertEquals(10, x);

        x*=5;//10 * 5

        assertEquals(50, x);

        x/=5;//50 / 5

        assertEquals(10, x);


        for(int i = 0; i<10 ; i++){
            System.out.println("increment " + i);
        }

        for(int i = 10; i>0 ; i--){
            System.out.println("decrement " + i);
        }

    }

    @Test
    public void comparisonOperatorsTest(){
        int num1 = 10;
        int num2 = 10;
        int num3 = 20;


        assertTrue(num1 == num2);
        assertTrue(num1 != num3);
        assertTrue(num3 > num1);
        assertTrue(num1 < num3);

        assertTrue(num1 >= num2);
        assertTrue(num1 <= num2);
        assertTrue(num1 <= num3);


        assertFalse(num1 == num3);

    }

    @Test
    public void logicalOperatorsTest(){
        int num1 = 10;
        int num2 = 10;
        int num3 = 20;


        if(num1 == 10 && num2 == 10 && num3 == 20){
            System.out.println("This text will be printed if num1 AND num2 vars have value 10 AND num3 has value 20");
        }

        if(num1 == 10 || num2 == 12 || num3 == 20){
            System.out.println("This text will be printed if num1 OR num2 vars have value 10 OR num3 has value 20");
        }

        if(num1 != 20){
            System.out.println("number 1 does not have value 20");
        }


        System.out.println("bool method value -> " + boolMethod());

    }

    @Test
    public void stringTest(){
        int x = 10;
        int y = 20;
        int sum = x + y;
        String m = "10";
        String n = "10";

        System.out.println("This is the sum of x and y " + sum);//30
        System.out.println(m+n);//1010

        String phrase = "Creative Hub 123!";
        String phraseSame = "Creative Hub 123!";
        String phraseUpperCase = "CREATIVE HUB 123!";
        String phraseLowerCase = "creative hub 123!";

        String string1 = "Creative";
        String string2 = "Hub";
        String finalString = string1 + " " + string2;

        assertEquals("Creative Hub", finalString);

        assertEquals(17, phrase.length());

        assertEquals("CREATIVE HUB 123!", phraseLowerCase.toUpperCase());
        assertEquals("creative hub 123!", phraseUpperCase.toLowerCase());
        assertEquals(3, phrase.indexOf('a'));

        assertTrue(phrase.equals(phraseSame));
        assertTrue(phraseLowerCase.equalsIgnoreCase(phraseUpperCase));




    }


}
