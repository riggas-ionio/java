/**
Adapted from wiley.com/go/bjlo2code, chapter 8, sec. 10.
*/

public class BankAccount {
    private double balance;

    /**
    Constructs a bank account with a zero balance.
    */
    public BankAccount() {
        this.balance =  0.0;
    }

    /**
    Constructs a bank account with a given balance.
    @param initialBalance the initial balance
    */
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initail balance must be >=0.");
            return;
        }
        this.balance =  initialBalance;
    }

    /**
    Deposits money into this account.
    @param amount the amount to deposit
    */
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.format("Deposit amount (%.2f) must be >=0.%n", amount);
            return;
        }
        this.balance =  this.balance + amount;
    }

    /**
    Makes a withdrawal from this account, or charges a penalty if
    sufficient funds are not available.
    @param amount the amount of the withdrawal
    */
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.format("Withdraw amount (%.2f) must be less than balance (%.2f)%n", amount, this.balance);
            return;
        }
        this.balance =  balance - amount;
    }

    /**
    Gets the current balance of this account.
    @return the current balance
    */
    public double getBalance() {
        return balance;
    }
}
