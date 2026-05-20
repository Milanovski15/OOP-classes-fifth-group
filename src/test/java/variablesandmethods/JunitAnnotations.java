package variablesandmethods;

import org.junit.*;

public class JunitAnnotations {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before the first test");
    }

    @Before
    public void before(){
        System.out.println("This executes before every test case");
    }

    @Test
    public void test1(){
        System.out.println("This is test method 1");
    }

    @Test
    public void test2(){
        System.out.println("This is test method 2");
    }

    @Test
    public void test3(){
        System.out.println("This is test method 3");
    }

    @After
    public void after(){
        System.out.println("This executes after every test case");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This executes after the last test");
    }
}
