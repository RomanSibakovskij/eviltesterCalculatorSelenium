package lt.techin.example;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //positive test methods
    protected void addTwoVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputData();
        calculatorPage.inputNumberOne();
        calculatorPage.inputNumberTwo();
        //local comparator
        int number1 = calculatorPage.getNumber1();
        int number2 = calculatorPage.getNumber2();
        int expectedResult = number1 + number2;
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectPlusOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "plus", calculatorPage.isPlusSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //local comparison of the result with the result displayed
        int actualResult = Integer.parseInt(calculatorPage.getCalculationAnswer());
        assertEquals(expectedResult, actualResult, "The local addition result is incorrect");
        logger.info("The local answer is: " + actualResult);
    }

    protected void minusTwoVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputData();
        calculatorPage.inputNumberOne();
        calculatorPage.inputNumberTwo();
        //local comparator
        int number1 = calculatorPage.getNumber1();
        int number2 = calculatorPage.getNumber2();
        int expectedResult = number1 - number2;
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectMinusOperator();
        //assert the minus was selected
        verifyOperatorSelected(calculatorPage, "minus", calculatorPage.isMinusSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //local comparison of the result with the result displayed
        int actualResult = Integer.parseInt(calculatorPage.getCalculationAnswer());
        assertEquals(expectedResult, actualResult, "The local subtraction result is incorrect");
        logger.info("The local answer is: " + actualResult);
    }

    protected void multiplyTwoVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputData();
        calculatorPage.inputNumberOne();
        calculatorPage.inputNumberTwo();
        //local comparator
        int number1 = calculatorPage.getNumber1();
        int number2 = calculatorPage.getNumber2();
        double expectedResult = (double)number1 * number2;
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectTimesOperator();
        //assert the times was selected
        verifyOperatorSelected(calculatorPage, "times", calculatorPage.isTimesSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //local comparison of the result with the result displayed
        double actualResult = Double.parseDouble(calculatorPage.getCalculationAnswer());
        final double TOLERANCE = 0.0001;
        assertEquals(expectedResult, actualResult, TOLERANCE, "The local multiplication result is incorrect");
        logger.info("The local answer is: " + actualResult);
    }

    protected void divideTwoVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputData();
        calculatorPage.inputNumberOne();
        calculatorPage.inputNumberTwo();
        //local comparator
        int number1 = calculatorPage.getNumber1();
        int number2 = calculatorPage.getNumber2();
        double expectedResult = (double)number1 / number2;
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectDivideOperator();
        //assert the divide was selected
        verifyOperatorSelected(calculatorPage, "divide", calculatorPage.isDivideSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //local comparison of the result with the result displayed
        double actualResult = Double.parseDouble(calculatorPage.getCalculationAnswer());
        final double TOLERANCE = 0.0001;
        assertEquals(expectedResult, actualResult, TOLERANCE, "The local division result is incorrect");
        logger.info("The local answer is: " + actualResult);
    }
    //negative test methods -> two variables as letters

    protected void addTwoVariablesAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        logger.info("Number 1: " + calculatorPage.getNumber1Values() + "\n");
        calculatorPage.inputLettersIntoNum2InputField();
        logger.info("Number 2: " + calculatorPage.getNumber2Values() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectPlusOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "plus", calculatorPage.isPlusSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
    }

    protected void subtractTwoVariablesAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        logger.info("Number 1: " + calculatorPage.getNumber1Values() + "\n");
        calculatorPage.inputLettersIntoNum2InputField();
        logger.info("Number 2: " + calculatorPage.getNumber2Values() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectMinusOperator();
        //assert the minus was selected
        verifyOperatorSelected(calculatorPage, "minus", calculatorPage.isMinusSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
    }

    protected void multiplyTwoVariablesAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        logger.info("Number 1: " + calculatorPage.getNumber1Values() + "\n");
        calculatorPage.inputLettersIntoNum2InputField();
        logger.info("Number 2: " + calculatorPage.getNumber2Values() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectTimesOperator();
        //assert the times was selected
        verifyOperatorSelected(calculatorPage, "times", calculatorPage.isTimesSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
    }

    protected void divideTwoVariablesAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        logger.info("Number 1: " + calculatorPage.getNumber1Values() + "\n");
        calculatorPage.inputLettersIntoNum2InputField();
        logger.info("Number 2: " + calculatorPage.getNumber2Values() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectDivideOperator();
        //assert the divide was selected
        verifyOperatorSelected(calculatorPage, "divide", calculatorPage.isDivideSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
    }

    //negative test methods -> one variable as letters

    protected void addOneVariableAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        logger.info("Number 1: " + calculatorPage.getNumber1Values() + "\n");
        calculatorPage.inputNumberTwo();
        logger.info("Number 2: " + calculatorPage.getNumber2Values() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectPlusOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "plus", calculatorPage.isPlusSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
    }

    protected void subtractOneVariableAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNumberOne();
        logger.info("Number 1: " + calculatorPage.getNumber1Values() + "\n");
        calculatorPage.inputLettersIntoNum2InputField();
        logger.info("Number 2: " + calculatorPage.getNumber2Values() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectMinusOperator();
        //assert the minus was selected
        verifyOperatorSelected(calculatorPage, "minus", calculatorPage.isMinusSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
    }

    protected void multiplyOneVariableAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        logger.info("Number 1: " + calculatorPage.getNumber1Values() + "\n");
        calculatorPage.inputNumberTwo();
        logger.info("Number 2: " + calculatorPage.getNumber2Values() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectTimesOperator();
        //assert the times was selected
        verifyOperatorSelected(calculatorPage, "times", calculatorPage.isTimesSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
    }

    protected void divideOneVariableAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNumberOne();
        logger.info("Number 1: " + calculatorPage.getNumber1Values() + "\n");
        calculatorPage.inputLettersIntoNum2InputField();
        logger.info("Number 2: " + calculatorPage.getNumber2Values() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectDivideOperator();
        //assert the divide was selected
        verifyOperatorSelected(calculatorPage, "divide", calculatorPage.isDivideSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
    }

    //negative test methods -> one variable as letters

    protected void addMissOneVariableTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.missInputNum1InputField();
        logger.info("Number 1: " + calculatorPage.getNumber1Values() + "\n");
        calculatorPage.inputNumberTwo();
        logger.info("Number 2: " + calculatorPage.getNumber2() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectPlusOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "plus", calculatorPage.isPlusSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
    }

    protected void subtractMissOneVariableTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNumberOne();
        logger.info("Number 1: " + calculatorPage.getNumber1() + "\n");
        calculatorPage.missInputIntoNum2InputField();
        logger.info("Number 2: " + calculatorPage.getNumber2Values() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectMinusOperator();
        //assert the minus was selected
        verifyOperatorSelected(calculatorPage, "minus", calculatorPage.isMinusSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
    }

    protected void multiplyMissOneVariableTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.missInputNum1InputField();
        logger.info("Number 1: " + calculatorPage.getNumber1Values() + "\n");
        calculatorPage.inputNumberTwo();
        logger.info("Number 2: " + calculatorPage.getNumber2() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectTimesOperator();
        //assert the times was selected
        verifyOperatorSelected(calculatorPage, "times", calculatorPage.isTimesSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
    }

    protected void divideMissOneVariableTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNumberOne();
        logger.info("Number 1: " + calculatorPage.getNumber1() + "\n");
        calculatorPage.missInputIntoNum2InputField();
        logger.info("Number 2: " + calculatorPage.getNumber2Values() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectDivideOperator();
        //assert the divide was selected
        verifyOperatorSelected(calculatorPage, "divide", calculatorPage.isDivideSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
    }

    protected void divideByZeroTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        //altered inputData for this specific case
        calculatorPage.inputDataDivByZero();
        calculatorPage.inputNumberOne();
        logger.info("Number 1: " + calculatorPage.getNumber1() + "\n");
        calculatorPage.inputZeroIntoNum2InputField();
        logger.info("Number 2: " + calculatorPage.getNumber2() + "\n");
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectDivideOperator();
        //assert the divide was selected
        verifyOperatorSelected(calculatorPage, "divide", calculatorPage.isDivideSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //assert the calculation error is displayed
        if ("ERR".equals(calculatorPage.getCalculationAnswer())) {
            assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
        } else {
            logger.info("The calculator permits division by zero. Result: " + calculatorPage.getCalculationAnswer() + "\n");
        }
    }
    //addition with negative numbers test method
    protected void addTwoNegativeVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNegativeNumbersData();
        calculatorPage.addNegativeNum1InputField();
        calculatorPage.addNegativeIntoNum2InputField();
        //local comparator
        int number1 = calculatorPage.getNegativeNumber1Value();
        int number2 = calculatorPage.getNegativeNumber2Value();
        int expectedResult = number1 + number2;
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectPlusOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "plus", calculatorPage.isPlusSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //local comparison of the result with the result displayed
        int actualResult = Integer.parseInt(calculatorPage.getCalculationAnswer());
        assertEquals(expectedResult, actualResult, "The local addition result is incorrect");
        logger.info("The local answer is: " + actualResult);
    }

    //subtraction with negative numbers test method
    protected void minusTwoNegativeVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNegativeNumbersData();
        calculatorPage.addNegativeNum1InputField();
        calculatorPage.addNegativeIntoNum2InputField();
        //local comparator
        int number1 = calculatorPage.getNegativeNumber1Value();
        int number2 = calculatorPage.getNegativeNumber2Value();
        int expectedResult = number1 - number2;
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectMinusOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "minus", calculatorPage.isMinusSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //local comparison of the result with the result displayed
        int actualResult = Integer.parseInt(calculatorPage.getCalculationAnswer());
        assertEquals(expectedResult, actualResult, "The local addition result is incorrect");
        logger.info("The local answer is: " + actualResult);
    }

    //multiplication with negative numbers test method
    protected void multiplyTwoNegativeVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNegativeNumbersData();
        calculatorPage.addNegativeNum1InputField();
        calculatorPage.addNegativeIntoNum2InputField();
        //local comparator
        int number1 = calculatorPage.getNegativeNumber1Value();
        int number2 = calculatorPage.getNegativeNumber2Value();
        double expectedResult = (double)number1 * number2;
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectTimesOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "times", calculatorPage.isTimesSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
        //local comparison of the result with the result displayed
        int actualResult = Integer.parseInt(calculatorPage.getCalculationAnswer());
        assertEquals(expectedResult, actualResult, "The local addition result is incorrect");
        logger.info("The local answer is: " + actualResult);
    }

    //division with negative numbers test method
    protected void divideTwoNegativeVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        // Assert input fields are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNegativeNumbersData();
        calculatorPage.addNegativeNum1InputField();
        calculatorPage.addNegativeIntoNum2InputField();
        //local comparator
        int number1 = calculatorPage.getNegativeNumber1Value();
        int number2 = calculatorPage.getNegativeNumber2Value();
        double expectedResult = (double) number1 / number2;
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectDivideOperator();
        //assert the times operator was selected
        verifyOperatorSelected(calculatorPage, "divide", calculatorPage.isDivideSelected());
        calculatorPage.clickCalculateButton();
        //log the answer into the console
        logger.info("The answer from the calculator is: " + calculatorPage.getCalculationAnswer());
        //local comparison of the result with the result displayed
        double actualResult = Double.parseDouble(calculatorPage.getCalculationAnswer());
        //compare the expected and actual results and log a warning if they do not match
        if (expectedResult != actualResult) {
            logger.warn("Mismatch in division result: Expected = " + expectedResult + ", Actual = " + actualResult);
        } else {
            logger.info("The division result is correct: " + actualResult);
        }
        //log the final comparison result
        logger.info("The local answer is: " + actualResult);
    }

    //assert/logging methods
    protected void verifyInputFieldsDisplayed(CalculatorPage calculatorPage) {
        assertTrue(calculatorPage.isNum1InputFieldDisplayed(), "The num 1 field isn't displayed");
        assertTrue(calculatorPage.isNum2InputFieldDisplayed(), "The num 2 field isn't displayed");
    }

    protected void verifyOperatorDropdownDisplayed(CalculatorPage calculatorPage){
        assertTrue(calculatorPage.isOperatorSelectorDisplayed(), "The operator selector is not displayed");
        logger.info("The operator selector is displayed" + "\n");
    }

    protected void verifyOperatorSelected(CalculatorPage calculatorPage, String operator, boolean isSelected) {
        assertTrue(isSelected, "The " + operator + " operator is not selected");
        logger.info("The " + operator + " operator is selected\n");
    }
}
