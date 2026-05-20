package oopprinciples;

import oopprinciples.animal.Bird;
import oopprinciples.animal.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTests {

    Bird bird1 = new Bird(10, "yellow", "Suki", "nimf parrot", "rounded");
    Bird bird2 = new Bird();

    Dog dog1 = new Dog(7, "grey", "Sharko", "Sharplaninec", true);
    Dog dog2 = new Dog();

    @Test
    public void testBirds(){

        assertEquals(10, bird1.getAge());
        assertEquals("yellow", bird1.getColor());
        assertEquals("Suki", bird1.getName());
        assertEquals("nimf parrot", bird1.getType());
        assertEquals("rounded", bird1.getBeakType());
        assertEquals("The bird Suki is eating", bird1.eat());

        bird2.setAge(5);
        bird2.setColor("blue");
        bird2.setName("Palce");
        bird2.setType("Budgerigar");
        bird2.setBeakType("straight");

        assertEquals(5, bird2.getAge());
        assertEquals("blue", bird2.getColor());
        assertEquals("Palce", bird2.getName());
        assertEquals("Budgerigar", bird2.getType());
        assertEquals("straight", bird2.getBeakType());
        assertEquals("The bird Palce is eating", bird2.eat());

    }

    @Test
    public void testDogs(){
        assertEquals(7, dog1.getAge());
        assertEquals("grey", dog1.getColor());
        assertEquals("Sharko", dog1.getName());
        assertEquals("Sharplaninec", dog1.getType());
        assertTrue(dog1.getIsTrained());
        assertEquals("The dog Sharko is eating", dog1.eat());

        dog2.setAge(5);
        dog2.setColor("brown");
        dog2.setName("Peki");
        dog2.setType("Chiwawa");
        dog2.setIsTrained(false);

        assertEquals(5, dog2.getAge());
        assertEquals("brown", dog2.getColor());
        assertEquals("Peki", dog2.getName());
        assertEquals("Chiwawa", dog2.getType());
        assertFalse(dog2.getIsTrained());
        assertEquals("The dog Peki is eating", dog2.eat());

    }

    @Test
    public void newTestCase(){

    }
}
