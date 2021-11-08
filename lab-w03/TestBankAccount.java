

public class TestBankAccount{
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.deposit(100);
        System.out.format("Current balance is %.2f%n", b.getBalance());
        b.withdraw(10);
        System.out.format("Current balance is %.2f%n", b.getBalance());
        b.withdraw(100);
        System.out.format("Current balance is %.2f%n", b.getBalance());
        b.deposit(-10);
        System.out.format("Current balance is %.2f%n", b.getBalance());
    }
}
