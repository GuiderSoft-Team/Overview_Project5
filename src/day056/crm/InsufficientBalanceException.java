package day056.crm;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException() {
        super("Insufficient balance for the requested transaction.");
    }

}
