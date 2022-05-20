package day056.crm;

public interface Accountable {
    void deposit(double amount);
    double getBalance();
    void withdraw(double amount) throws InsufficientBalanceException;
}
