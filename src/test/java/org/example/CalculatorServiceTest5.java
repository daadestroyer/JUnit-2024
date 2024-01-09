package org.example;

import org.junit.jupiter.api.*;

public class CalculatorServiceTest5 {


    // if we want to execute some piece of code before all testcase
    @BeforeAll
    public static void init() {
        System.out.println("init executed");
    }

    // if we want to execute some piece of code before each testcase
    @BeforeEach
    public void beforeEachTest(){
        System.out.println("Before each testcase");
    }

    // if we want to execute some piece of code after each testcase
    @AfterEach
    public void afterEachTest(){
        System.out.println("After each testcase");
    }
    @Test
    public void addTwoNumbersTest() {
        System.out.println("Before addTwoNumbersTest");
        int actualResult = CalculatorService.addTwoNumbers(10, 20);
        int expectedResult = 30;
        Assertions.assertEquals(actualResult, expectedResult, () -> "CalculatorService.addTwoNumbersTest(10,20) test failed");
    }

    @Test
    public void sumAnyNumbersTest() {
        System.out.println("Before sumAnyNumbersTest");
        int actualResult = CalculatorService.sumAnyNumbers(10, 20, 30, 40);
        int expectedResult = 100;
        Assertions.assertEquals(actualResult, expectedResult, () -> "CalculatorService.sumAnyNumbersTest(10,20,30,40) test failed");
    }

    // if we want to execute some piece of code after all the testcases
    @AfterAll
    public static void clean(){
        System.out.println("clean executed");
    }
}
