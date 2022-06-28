package com.techproed;
import org.junit.*;

public class Day04_FirstJUnitClass {
    //    We no longer need MAIN METHOD
//    @Test creates a test case.
//    @Ignore skips test case
// setUp -> tearDown -> test1 -> test2(SKIPPED) -> test3
//    @After runs after EACH METHOD
//    @Before runs before EACH METHOD
    @BeforeClass

    @Before
    public void setUp(){
        System.out.println("This will be reusable set up method");
    }
    @Test
    public void test1(){
        System.out.println("Test Case 1");
    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("Test Case 2");
    }
    @Test
    public void test3(){
        System.out.println("Test Case 3");
    }
    @After
    public void tearDown(){
        System.out.println("This should run after each method");
    }
    //ASSERTIONS:If expected= actual
    //assertion()
    @Test
    public void assertion(){
        //1.Assert.assertTrue(statement);if statement=True, then P
        //Assert.assertFalse();
        Assert.assertTrue(3==3);
        Assert.assertFalse(3==4);
        String expected="junit";
        Assert.assertTrue(expected.contains("j"));
        Assert.assertEquals("junit","j");

    }
}
