package hurst_p2;

class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount() {
        annualInterestRate = 0;
        savingsBalance = 0;
    }

    public void setSavingsBalance(double value) {
        savingsBalance = value;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRate(double value) {
        annualInterestRate = value;
    }

    public static double getInterestRate() {
        return annualInterestRate;
    }

}




