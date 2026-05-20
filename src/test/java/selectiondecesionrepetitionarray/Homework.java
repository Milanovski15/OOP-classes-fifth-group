package selectiondecesionrepetitionarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Homework {

    int calculator(int num1, int num2, String sign){
        if(sign.equals("+")){
            return num1 + num2;
        } else if (sign.equals("-")) {
            return num1 - num2;
        } else if (sign.equals("*")) {
            return num1 * num2;
        } else if (sign.equals("/")) {
            if(num1 == 0){
                return 0;
            }
            return num1 / num2;
        } else {
            System.out.println("The sign must be +,-,* or /");
            return 0;
        }
    }

    String grades(int score){
        String mark = "";

        if(score >= 90 && score <= 100){
            mark = "A";
            if(score == 90){
                mark += "-";
            } else if (score == 100) {
                mark += "+";
            }
        } else if (score >= 80 && score <=89) {
            mark = "B";
            if(score == 80){
                mark += "-";
            } else if (score == 89) {
                mark += "+";
            }
        } else if (score >= 70 && score <=79) {
            mark = "C";
            if(score == 70){
                mark += "-";
            } else if (score == 79) {
                mark += "+";
            }
        } else if (score >= 60 && score <= 69) { // mark -> ""
            mark = "D"; // mark -> D
            if(score == 60){
                mark += "-";      //mark -> D-
            } else if (score == 69) {
                mark += "+";    //mark -> D+
            }
        } else if (score >= 0 && score <=59) {
            mark = "F";
        } else {
            return "You must enter a value between 0 and 100";
        }

        return mark;
    }

    int thirdElementOfIntegerArray(int[] numberArray){

        return numberArray[2];

    }

    @Test
    public void thirdElementOfIntegerArrayTest(){
        int[] numbers = {2,7,34,7,9,3};

        assertEquals(34, thirdElementOfIntegerArray(numbers));
    }

    String height(int height){
        if(height >= 181 && height <= 250){
            return "tall";
        } else if (height >= 81 && height <= 180){
            return "average";
        } else if (height >= 1 && height <= 80) {
            return "short";
        } else {
            return "You must enter a value between 1 and 250";
        }
    }

    @Test
    public void calculatorTest(){

        assertEquals(10, calculator(5, 5 , "+"));
        assertEquals(10, calculator(15, 5 , "-"));
        assertEquals(10, calculator(2, 5 , "*"));
        assertEquals(10, calculator(100, 10 , "/"));
        assertEquals(0, calculator(5, 5 , "^"));

    }

    @Test
    public void gradesTest(){

        //positive scenario validations
        assertEquals("A+", grades(100));
        assertEquals("A", grades(99));
        assertEquals("A", grades(95));
        assertEquals("A", grades(91));
        assertEquals("A-", grades(90));

        assertEquals("B+", grades(89));
        assertEquals("B", grades(88));
        assertEquals("B", grades(85));
        assertEquals("B", grades(81));
        assertEquals("B-", grades(80));

        assertEquals("C+", grades(79));
        assertEquals("C", grades(78));
        assertEquals("C", grades(75));
        assertEquals("C", grades(71));
        assertEquals("C-", grades(70));

        assertEquals("D+", grades(69));
        assertEquals("D", grades(68));
        assertEquals("D", grades(65));
        assertEquals("D", grades(61));
        assertEquals("D-", grades(60));

        assertEquals("F", grades(59));
        assertEquals("F", grades(30));
        assertEquals("F", grades(0));

        //negative scenario validations
        assertEquals("You must enter a value between 0 and 100", grades(-1));
        assertEquals("You must enter a value between 0 and 100", grades(101));
        assertEquals("You must enter a value between 0 and 100", grades(-50));
        assertEquals("You must enter a value between 0 and 100", grades(150));
    }

    @Test
    public void heightTest(){
        assertEquals("tall", height(250));
        assertEquals("tall", height(200));
        assertEquals("tall", height(181));

        assertEquals("average", height(180));
        assertEquals("average", height(140));
        assertEquals("average", height(81));

        assertEquals("short", height(80));
        assertEquals("short", height(60));
        assertEquals("short", height(1));

        assertEquals("You must enter a value between 1 and 250", height(251));
        assertEquals("You must enter a value between 1 and 250", height(500));
        assertEquals("You must enter a value between 1 and 250", height(0));
        assertEquals("You must enter a value between 1 and 250", height(-500));
    }




}
