package variablesandmethods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VariablesAndMethods {


    int x = 10;
    int y = 1;
    int z = 1;

    int broj = 100;

    /*comment in
     2 different lines*/

    //Integral types
    byte byteVar = 120;
    short shortVar = 10000;
    int intVar = 20000;
    long longVar = 99999999;

    //Floating point types
    float floatVar = 3.14f;
    double doubleVar = 3.14;

    //Characters
    char charVar = '!';
    char charVar1 = 'a';
    char charVar2 = '1';
    char charVar3 = '1';

    //Booleans
    boolean booleanVarTrue = true;
    boolean booleanVarFalse = false;

    int additionOfTwoNumbersWithoutParams(){
        int x = 10;
        int y = 20;

        return x+y;
    }

    char returnCharWithoutParams(){
        return '?';
    }

    char returnCharWithParams(char character){
        return character;
    }

    char returnCalculator(int x, int y){
        System.out.println(x+y);

        return '+';
    }

    @Test
    public void charTest(){
        System.out.println(returnCharWithoutParams());
        System.out.println(returnCharWithParams('$'));

    }

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

    char returnTheChar(char c){
        return c;
    }

    void printSomeTextWithoutParams(){
        System.out.println("I am a void method without parameters");
    }

    void printSomeTextWithParams(String text){
        System.out.println(text);
    }


    @Test
    public void additionOfTwoNumbersWithParamsTest(){
        assertEquals("The sum of the numbers in the method does not correspond with the expected result",
                20, additionOfTwoNumbersWithParams(10,10));
    }

    @Test
    public void substractionOfTwoNumbersWithParamsTest(){
        assertEquals(20, substractionOfTwoNumbersWithParams(30,10));
    }

    @Test
    public void multiplicationOfTwoNumbersWithParamsTest(){
        assertEquals(20, multiplicationOfTwoNumbersWithParams(2,10));
    }

    @Test
    public void divisionOfTwoNumbersWithParamsTest(){
        assertEquals(20, divisionOfTwoNumbersWithParams(40,2));
    }

    @Test
    public void returnTheCharTest(){
        assertEquals('X', returnTheChar('X'));
    }

//    @Test
//    public void test2(){
//        System.out.println(additionOfTwoNumbersWithoutParams());
//
//        System.out.println(additionOfTwoNumbersWithParams(10, 20));
//        System.out.println(additionOfTwoNumbersWithParams(100, 200));
//        System.out.println(additionOfTwoNumbersWithParams(1, 2));
//    }
//
//    @Test
//    public void test(){
//        System.out.println(x);
//    }
//
//    @Test
//    public void test1(){
//        System.out.println(y+z);
//        System.out.println(charVar2 + charVar3);
//    }
//

    @Test
    public void test3(){
        int x = 10;
        int y = 20;

        System.out.println(10+20);
        System.out.println(x+y);
        System.out.println(additionOfTwoNumbersWithParams(5,5) + additionOfTwoNumbersWithParams(10,10));
        System.out.println(x + additionOfTwoNumbersWithParams(10,10));

        System.out.println(x + floatVar);
    }
//
//    @Test
//    public void test4(){
//        printSomeTextWithoutParams();
//        printSomeTextWithParams("I am a void method with params");
//        printSomeTextWithParams("11243243242");
//        printSomeTextWithParams("!!!!! dfjhghjfd 34235 DDERHSH");
//    }



}