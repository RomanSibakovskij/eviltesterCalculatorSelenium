package lt.techin.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.slf4j.*;
import org.slf4j.Logger;
import org.junit.jupiter.api.*;

public class CalculatorPageTest extends TestMethods{

    //positive test cases

    //addition
    @Test
    @DisplayName("Sum of Two Numbers")
    @Tag("Valid_Input_Test")
    void addTwoNumbersTest() {
        addTwoVariablesTest();
    }

    //subtraction
    @Test
    @DisplayName("Subtraction of Two Numbers")
    @Tag("Valid_Input_Test")
    void subtractTwoNumbersTest() {
        minusTwoVariablesTest();
    }

    //multiplication
    @Test
    @DisplayName("Multiplication of Two Numbers")
    @Tag("Valid_Input_Test")
    void multiplyTwoNumbersTest() {
        multiplyTwoVariablesTest();
    }

    //division
    @Test
    @DisplayName("Division of Two Numbers")
    @Tag("Valid_Input_Test")
    void divideTwoNumbersTest() {
        divideTwoVariablesTest();
    }

    //negative test cases (vars as letters)

    //addition
    @Test
    @DisplayName("Add Two Sets Of Letters As Variables")
    @Tag("Invalid_Input_Test")
    @Tag("Invalid_Input_Test_Two_Vars_As_Letters")
    void addTwoLettersTest(){
        addTwoVariablesAsLettersTest();
    }

    //subtraction
    @Test
    @DisplayName("Subtract Two Sets Of Letters As Variables")
    @Tag("Invalid_Input_Test")
    @Tag("Invalid_Input_Test_Two_Vars_As_Letters")
    void subtractTwoLettersTest(){
        subtractTwoVariablesAsLettersTest();
    }

    //multiplication
    @Test
    @DisplayName("Multiply Two Sets Of Letters As Variables")
    @Tag("Invalid_Input_Test")
    @Tag("Invalid_Input_Test_Two_Vars_As_Letters")
    void multiplyTwoLettersTest(){
        multiplyTwoVariablesAsLettersTest();
    }

    //division
    @Test
    @DisplayName("Divide Two Sets Of Letters As Variables")
    @Tag("Invalid_Input_Test")
    @Tag("Invalid_Input_Test_Two_Vars_As_Letters")
    void divideTwoLettersTest(){
        divideTwoVariablesAsLettersTest();
    }

    //negative test cases (one var as letters)

    //addition
    @Test
    @DisplayName("Add One Set Of Letters As Variables")
    @Tag("Invalid_Input_Test")
    @Tag("Invalid_Input_Test_One_Var_As_Letters")
    void addOneAsLettersTest(){
        addOneVariableAsLettersTest();
    }

    //subtraction
    @Test
    @DisplayName("Subtract One Set Of Letters As Variables")
    @Tag("Invalid_Input_Test")
    @Tag("Invalid_Input_Test_One_Var_As_Letters")
    void subtractOneAsLettersTest(){
        subtractOneVariableAsLettersTest();
    }

    //multiplication
    @Test
    @DisplayName("Multiply One Set Of Letters As Variables")
    @Tag("Invalid_Input_Test")
    @Tag("Invalid_Input_Test_One_Var_As_Letters")
    void multiplyOneAsLettersTest(){
        multiplyOneVariableAsLettersTest();
    }

    //division
    @Test
    @DisplayName("Divide One Set Of Letters As Variables")
    @Tag("Invalid_Input_Test")
    @Tag("Invalid_Input_Test_One_Var_As_Letters")
    void divideOneAsLettersTest(){
        divideOneVariableAsLettersTest();
    }

    //negative test cases (miss one var as input)

    //addition
    @Test
    @DisplayName("Add Two Numbers As Variables (one is missing)")
    @Tag("Invalid_Input_Test")
    @Tag("Invalid_Input_Miss_One_Var_As_Input")
    void addMissOneVarTest(){
        addMissOneVariableTest();
    }

    //subtraction
    @Test
    @DisplayName("Subtract Two Numbers As Variables (one is missing)")
    @Tag("Invalid_Input_Test")
    @Tag("Invalid_Input_Miss_One_Var_As_Input")
    void subtractMissOneAsVarTest(){
        subtractMissOneVariableTest();
    }

    //multiplication
    @Test
    @DisplayName("Multiply Two Numbers As Variables (one is missing)")
    @Tag("Invalid_Input_Test")
    @Tag("Invalid_Input_Miss_One_Var_As_Input")
    void multiplyMissOneAsVarTest(){
        multiplyMissOneVariableTest();
    }

    //division
    @Test
    @DisplayName("Divide Two Numbers As Variables (one is missing)")
    @Tag("Invalid_Input_Test")
    @Tag("Invalid_Input_Miss_One_Var_As_Input")
    void divideMissOneAsVarTest(){
        divideMissOneVariableTest();
    }

    @Test
    @DisplayName("Divide By Zero")
    @Tag("Invalid_Input_Test")
    @Tag("Divide_By_Zero")
    void divideVariableByZeroTest(){
        divideByZeroTest();
    }


    //calculation operations with negative numbers

    //addition
    @Test
    @DisplayName("Sum of Two Negative Numbers")
    @Tag("Invalid_Input_Test")
    @Tag("Negative_Variable_Input")
    void addTwoNegativeNumbersTest() {addTwoNegativeVariablesTest();}

    //subtraction
    @Test
    @DisplayName("Subtraction of Two Negative Numbers")
    @Tag("Invalid_Input_Test")
    @Tag("Negative_Variable_Input")
    void subtractTwoNegativeNumbersTest() {
        minusTwoNegativeVariablesTest();
    }

    //multiplication
    @Test
    @DisplayName("Multiplication of Two Negative Numbers")
    @Tag("Invalid_Input_Test")
    @Tag("Negative_Variable_Input")
    void multiplyTwoNegativeNumbersTest() {
        multiplyTwoNegativeVariablesTest();
    }

    //division
    @Test
    @DisplayName("Division of Two Negative Numbers")
    @Tag("Invalid_Input_Test")
    @Tag("Negative_Variable_Input")
    void divideTwoNegativeNumbersTest() {
        divideTwoNegativeVariablesTest();
    }



}
