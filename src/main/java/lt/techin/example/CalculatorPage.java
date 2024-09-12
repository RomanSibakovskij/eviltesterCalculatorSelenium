package lt.techin.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalculatorPage extends BasePage{

    //variables input fields elements
    @FindBy(css = "[name='number1']")
    private WebElement num1InputField;
     @FindBy(css = "[name='number2']")
    private WebElement num2InputField;

    //logical operator dropdown selector element
    @FindBy(css = "select#function")
    private WebElement operatorSelector;

    //logical operator elements
    @FindBy(css = "[value='plus']")
    private WebElement plusOperator;
    @FindBy(css = "[value='times']")
    private WebElement timesOperator;
    @FindBy(css = "[value='minus']")
    private WebElement minusOperator;
    @FindBy(css = "[value='divide']")
    private WebElement divideOperator;

    //calculate button
    @FindBy(css = "input#calculate")
    private WebElement calculateButton;

    //answer response output element
    @FindBy(css = "span#answer")
    private WebElement answerText;

    //input data
    private int number1;
    private int number2;

    //negative numbers
    private int negativeNum1;
    private int negativeNum2;


    public CalculatorPage(WebDriver driver) {
        super(driver);
    }
    //input data picker from generator
    public void inputData() {
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        number1 = testDataGenerator.generateRandomNumber1();
        number2 = testDataGenerator.generateRandomNumber2();

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        logger.info("Generated data: " + "\n");
        logger.info("Number 1: " + number1);
        logger.info("Number 2: " + number2);
    }

    //data input methods
    public void inputNumberOne() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num1InputField));
        num1InputField.sendKeys(String.valueOf(number1));
    }
    public void inputNumberTwo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num2InputField));
        num2InputField.sendKeys(String.valueOf(number2));
    }

    //logical op selector
    public void selectOperatorDropdown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(operatorSelector));
        operatorSelector.click();
    }

    //calculate button method
    public void clickCalculateButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(calculateButton));
        calculateButton.click();
    }

    //logical operators choice methods
    public void selectPlusOperator() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(plusOperator));
        plusOperator.click();
    }
    public void selectTimesOperator() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(timesOperator));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", timesOperator);
        timesOperator.click();
    }
    public void selectMinusOperator() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(minusOperator));
        minusOperator.click();
    }
    public void selectDivideOperator() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(divideOperator));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", divideOperator);
        divideOperator.click();
    }

    //invalid input methods (letters as variables)

    public void inputLettersIntoNum1InputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num1InputField));
        num1InputField.sendKeys("AsD");
    }
    public void inputLettersIntoNum2InputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num2InputField));
        num2InputField.sendKeys("BsD");
    }

    //invalid input methods (one var is missing)

    public void missInputNum1InputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num1InputField));
        num1InputField.sendKeys("");
    }
    public void missInputIntoNum2InputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num2InputField));
        num2InputField.sendKeys("");
    }

    public void inputDataDivByZero() {
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        if (true) {
            // number1 has to be greater than zero for the 'division by zero'
            number1 = testDataGenerator.generateRandomNumber1();
            while (number1 == 0) {
                number1 = testDataGenerator.generateRandomNumber1();
            }
        }
        number2 = 0;

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        logger.info("Generated data: " + "\n");
        logger.info("Number 1: " + number1);
        logger.info("Number 2: " + number2);
    }

    //invalid input method (divide by zero)
    public void inputZeroIntoNum2InputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num2InputField));
        num2InputField.sendKeys(String.valueOf(0));
    }

    //negative numbers input data picker from generator
    public void inputNegativeNumbersData() {
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        negativeNum1 = testDataGenerator.generateRandomNegativeNumber1();
        negativeNum2 = testDataGenerator.generateRandomNegativeNumber2();

//        if (number1 < number2) {
//            int temp = number1;
//            number1 = number2;
//            number2 = temp;
//        }

        logger.info("Generated data: " + "\n");
        logger.info("Number 1: " + negativeNum1);
        logger.info("Number 2: " + negativeNum2);
    }

    //operations with negative numbers
    //invalid input methods (addition with negative numbers)
    public void addNegativeNum1InputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num1InputField));
        num1InputField.sendKeys(String.valueOf(negativeNum1));
    }
    public void addNegativeIntoNum2InputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num2InputField));
        num2InputField.sendKeys(String.valueOf(negativeNum2));
    }
    //assert methods
    public boolean isNum1InputFieldDisplayed() {return num1InputField.isDisplayed();}
    public boolean isNum2InputFieldDisplayed() {return num2InputField.isDisplayed();}
    public boolean isOperatorSelectorDisplayed() {return operatorSelector.isDisplayed();}
    public boolean isCalculateButtonDisplayed(){return calculateButton.isDisplayed();}

    //assert operator options methods
    public boolean isPlusSelected(){return plusOperator.isSelected();}
    public boolean isTimesSelected(){return timesOperator.isSelected();}
    public boolean isMinusSelected(){return minusOperator.isSelected();}
    public boolean isDivideSelected(){return divideOperator.isSelected();}

    //input data getter
    public int getNumber1(){return number1;}
    public int getNumber2(){return number2;}

    //input field data getter (for negative tcs)

    public String getNumber1Values(){return num1InputField.getAttribute("value");}
    public String getNumber2Values(){return num2InputField.getAttribute("value");}

    //negative number getter
    public int getNegativeNumber1Value(){return negativeNum1;}
    public int getNegativeNumber2Value(){return negativeNum2;}

    //answer getter
    public String getCalculationAnswer() {return answerText.getText();}
}
