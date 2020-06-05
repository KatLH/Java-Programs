package hurst_p1;

import java.util.*;

public class SecureRandom {

    private int num1;
    private int num2;
    private int userInput;
    private int correctAnswer;
    private double percentCorrect;
    private char operatorChar;
    private int operator;

    Random ran = new Random();

    public SecureRandom() {
        num1 = 0;
        num2 = 0;
        userInput = 0;
        correctAnswer = 0;
        percentCorrect = 0;
        operator = 0;
    }

    public SecureRandom(int num1, int num2, int userInput, int correctAnswer, double percentCorrect, char operatorChar, int operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.userInput = userInput;
        this.correctAnswer = correctAnswer;
        this.percentCorrect = percentCorrect;
        this.operatorChar = operatorChar;
        this.operator = operator;
    }

    public void setNum1(int difficulty) {
        switch (difficulty) {
            case 1:
                num1 = ran.nextInt(9) + 1;
                break;
            case 2:
                num1 = ran.nextInt(100);
                break;
            case 3:
                num1 = ran.nextInt(1000);
                break;
            case 4:
                num1 = ran.nextInt(10000);
                break;

        }
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int difficulty) {
        Random ran = new Random();
        switch (difficulty) {
            case 1:
                num2 = ran.nextInt(9) + 1;
                break;
            case 2:
                num2 = ran.nextInt(100);
                break;
            case 3:
                num2 = ran.nextInt(1000);
                break;
            case 4:
                num2 = ran.nextInt(10000);
                break;
        }
    }

    public int getNum2() {
        return num2;
    }

    public void setUserInput(int value) {
        userInput = value;
    }

    public void generateQuestion(int num1, int num2, char operatorChar) {
        if (operator == 1)
            System.out.println("How much is " + num1 + " " + operatorChar + " " + num2 + "?");
        else if (operator == 2)
            System.out.println("How much is " + num1 + " " + operatorChar + " " + num2 + "?");
        else if (operator == 3)
            System.out.println("How much is " + num1 + " " + operatorChar + " " + num2 + "?");
        else if (operator == 4)
            System.out.println("How much is " + num1 + " " + operatorChar + " " + num2 + "?");
        else if (operator == 5)
            System.out.println("How much is " + num1 + " " + operatorChar + " " + num2 + "?");
    }

    public int getCorrectAnswer(int num1, int num2, int operator) {
        if (operator == 1)
            correctAnswer = num1 + num2;
        else if (operator == 2)
            correctAnswer = num1 * num2;
        else if (operator == 3)
            correctAnswer = num1 - num2;
        else if (operator == 4)
            correctAnswer = num1 / num2;
        else if (operator == 5)
            correctAnswer = num1 / num2;

        return correctAnswer;
    }


    public void setPercentage(double correctAnswers) {
        percentCorrect = correctAnswers / 10;
    }

    public double getPercentage() {
        return percentCorrect * 100;
    }


    /* PART 5 */
    public void setOperator(int userInput) {
        if (userInput >= 1 && userInput <= 4) {
            switch (userInput) {
                case 1:
                    operatorChar = '+';
                    operator = 1;
                    break;
                case 2:
                    operatorChar = '*';
                    operator = 2;
                    break;
                case 3:
                    operatorChar = '-';
                    operator = 3;
                    break;
                case 4:
                    operatorChar = '/';
                    operator = 4;
                    break;
            }
        } else if (userInput == 5) {
            operator = ran.nextInt(4) + 1;

            switch (operator) {
                case 1:
                    operatorChar = '+';
                    operator = 1;
                    break;
                case 2:
                    operatorChar = '*';
                    operator = 2;
                    break;
                case 3:
                    operatorChar = '-';
                    operator = 3;
                    break;
                case 4:
                    operatorChar = '/';
                    operator = 4;
                    break;
            }
        } else
            System.out.println("Invalid input. Program terminated.");
    }

    public char getOperatorChar() {
        return operatorChar;
    }

    public int getOperator() {
        return operator;
    }

}
