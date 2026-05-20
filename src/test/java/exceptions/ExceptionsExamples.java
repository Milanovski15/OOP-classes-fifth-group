package exceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ExceptionsExamples {

    @Test (expected = NullPointerException.class)
    public void nullPointerException(){
        Integer age = null;

        String ageAsString;

        ageAsString = age.toString();

        System.out.println(ageAsString);
        assertNotNull(ageAsString);
    }

    @Test
    public void nullPointerExceptionHandled(){
        Integer age = null;

        String ageAsString;


        try{
            System.out.println("We are in a try block");
            ageAsString = age.toString();
        } catch (NullPointerException e){
            System.out.println("We are in a catch block");

            System.out.println("Exception message" + e.getMessage());
            System.out.println("Stack trace -> ");
            e.printStackTrace();

            age = 0;
            ageAsString = age.toString();
        }

        System.out.println(ageAsString);
        assertNotNull(ageAsString);
    }

    @Test
    public void outOfBoundsException(){
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        try{
            System.out.println(daysOfTheWeek[10]);
        } catch (IndexOutOfBoundsException e){
            System.out.println(daysOfTheWeek[daysOfTheWeek.length-1]);
        }
    }
}
