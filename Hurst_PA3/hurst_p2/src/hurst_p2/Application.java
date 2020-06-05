package hurst_p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

class Application {
    private SavingsAccount saver1 = new SavingsAccount();
    private SavingsAccount saver2 = new SavingsAccount();

    private static DecimalFormat percentFormat = new DecimalFormat("#,###,##0");
    private static DecimalFormat moneyFormat = new DecimalFormat("#,###,##0.00");

    @Test
    void setSaver1WithSavingsBalance() {
        saver1.setSavingsBalance(2000);
        assertEquals(saver1.getSavingsBalance(), 2000);
    }

    @Test
    void setSaver2WithSavingsBalance() {
        saver2.setSavingsBalance(3000);
        assertEquals(saver2.getSavingsBalance(), 3000);
    }

    @Test
    void setInterestRateTo4Percent() {
        SavingsAccount.modifyInterestRate(4);
        assertEquals(SavingsAccount.getInterestRate(), 4);
    }

    @Test
    void setInterestRateTo5Percent() {
        SavingsAccount.modifyInterestRate(5);
        assertEquals(SavingsAccount.getInterestRate(), 5);
    }

    @Test
    void calculateMonthlyInterestWith4Percent() {
        SavingsAccount.modifyInterestRate(4);
        saver1.setSavingsBalance(2000);
        calculateMonthlyInterest(saver1.getSavingsBalance(), SavingsAccount.getInterestRate());
        saver2.setSavingsBalance(3000);
        calculateMonthlyInterest(saver2.getSavingsBalance(), SavingsAccount.getInterestRate());
    }

    @Test
    void calculateMonthlyInterestWith5Percent() {
        SavingsAccount.modifyInterestRate(5);
        saver1.setSavingsBalance(2000);
        calculateMonthlyInterest(saver1.getSavingsBalance(), SavingsAccount.getInterestRate());
        saver2.setSavingsBalance(3000);
        calculateMonthlyInterest(saver2.getSavingsBalance(), SavingsAccount.getInterestRate());
    }


    private static void calculateMonthlyInterest(double savingsBalance, double annualInterestRate) {
        double monthlyInterestRate = (savingsBalance * (annualInterestRate / 10)) / 12;
        System.out.println("Annual Interest Rate: " + percentFormat.format(annualInterestRate) + "%");
        System.out.println("Savings Account Balance: $" + moneyFormat.format(savingsBalance));
        System.out.println("Monthly Interest Amount: $" + moneyFormat.format(monthlyInterestRate));
        System.out.println("");
    }

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        SavingsAccount.modifyInterestRate(4);
        saver1.setSavingsBalance(2000);
        calculateMonthlyInterest(saver1.getSavingsBalance(), SavingsAccount.getInterestRate());
        saver2.setSavingsBalance(3000);
        calculateMonthlyInterest(saver2.getSavingsBalance(), SavingsAccount.getInterestRate());

        SavingsAccount.modifyInterestRate(5);
        saver1.setSavingsBalance(2000);
        calculateMonthlyInterest(saver1.getSavingsBalance(), SavingsAccount.getInterestRate());
        saver2.setSavingsBalance(3000);
        calculateMonthlyInterest(saver2.getSavingsBalance(), SavingsAccount.getInterestRate());
    }

}

