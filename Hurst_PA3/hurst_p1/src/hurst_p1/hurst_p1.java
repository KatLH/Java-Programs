package hurst_p1;

import java.util.*;

public class hurst_p1 {

    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);

        Random ran = new Random();
        SecureRandom randomNumber = new SecureRandom();
        SecureRandom question = new SecureRandom();

        int userInput, num1, num2;
        int randomCommentNum, i;
        double correctAnswers = 0, percentage = 0;
        char choice = 'Y';

        int difficulty = 0;
        int operator = 0;
        char operatorChar;
        int operatorInt = 0;

        while (choice == 'y' || choice == 'Y') {
            System.out.println("[Level 1]\t[Level 2]\t[Level 3]\t[Level 4]\nChoose Difficulty: ");
            difficulty = in.nextInt();

            System.out.println("1. [+]\t2. [*]\t3. [-]\t4. [/]\t5. [Random]\nWhat arithmetic problem would you like to study?");
            operator = in.nextInt();

            for (i = 1; i <= 10; i++) {
                randomNumber.setNum1(difficulty);
                randomNumber.setNum2(difficulty);
                question.setOperator(operator);

                num1 = randomNumber.getNum1();
                num2 = randomNumber.getNum2();
                operatorChar = question.getOperatorChar();
                operatorInt = question.getOperator();

                System.out.print(i + ". ");
                question.generateQuestion(num1, num2, operatorChar);
                userInput = in.nextInt();
                question.setUserInput(userInput);

                if (userInput == question.getCorrectAnswer(num1, num2, operatorInt)) {
                    correctAnswers++;

                    randomCommentNum = ran.nextInt(4) + 1;
                    switch (randomCommentNum) {
                        case 1:
                            System.out.println("Very good!");
                            break;
                        case 2:
                            System.out.println("Excellent!");
                            break;
                        case 3:
                            System.out.println("Nice work!");
                            break;
                        case 4:
                            System.out.println("Keep up the good work!");
                            break;
                    }
                } else {
                    randomCommentNum = ran.nextInt(4) + 1;
                    switch (randomCommentNum) {
                        case 1:
                            System.out.println("No. Please try again.");
                            break;
                        case 2:
                            System.out.println("Wrong. Try once more.");
                            break;
                        case 3:
                            System.out.println("Don't give up!");
                            break;
                        case 4:
                            System.out.println("No. Keep trying.");
                            break;
                    }
                }

            }

            question.setPercentage(correctAnswers);
            percentage = question.getPercentage();

            System.out.println("\nFinal Score: " + question.getPercentage() + "%");

            if (percentage < 75)
                System.out.println("Please ask you teacher for extra help.");
            else
                System.out.println("Congratulations, you are ready to move on to the next level!");


            System.out.println("Would you like to solve another set of questions? (Y/N)");
            choice = in.next().charAt(0);

        }

    }

}

