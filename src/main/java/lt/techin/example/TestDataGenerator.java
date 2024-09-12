package lt.techin.example;

import org.openqa.selenium.WebDriver;

import java.security.SecureRandom;
import java.util.Random;

public class TestDataGenerator extends BasePage{
    private static final int MIN = 1;
    private static final int MAX = 2500;

    private static final int MIN_NEGATIVE = -1000;
    private static final int MAX_NEGATIVE = -2;


    // Generator instance
    private Random random;

    // Input numbers
    private int num1;
    private int num2;

    //negative input numbers
    private int negativeNum1;
    private int negativeNum2;

    public TestDataGenerator(WebDriver driver) {super(driver); this.random = new SecureRandom();}

    // Generate random numbers
    public int generateRandomNumber1() {num1 = random.nextInt((MAX - MIN) + 1) + MIN; return num1;}
    public int generateRandomNumber2() {num2 = random.nextInt((MAX - MIN) + 1) + MIN; return num2;}

    // Method to generate the first random negative number
    public int generateRandomNegativeNumber1() {
        negativeNum1 = MIN_NEGATIVE + random.nextInt((MAX_NEGATIVE - MIN_NEGATIVE) + 1);
        return negativeNum1;
    }

    // Method to generate the second random negative number
    public int generateRandomNegativeNumber2() {
        negativeNum2 = MIN_NEGATIVE + random.nextInt((MAX_NEGATIVE - MIN_NEGATIVE) + 1);
        return negativeNum2;
    }
    // Getters
    public int getNum1() { return num1; }
    public int getNum2() { return num2; }

    //Negative number getters
    public int getNegativeNum1() { return negativeNum1; }
    public int getNegativeNum2() { return negativeNum2; }
}
