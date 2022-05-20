package day056.crm;

public class Main {
    public static void main(String[] args) {
        Contact contact1=new Contact("Adem Sesigüzel","a.sesiguzel@gmail.com","+905325231122");
        Customer customer1=new Customer("Saray Halı");
        customer1.setOwner(contact1);
        customer1.setAddress("Develi - Kayseri");
        customer1.setPhoneNumber("+90147896354");

        //Hata yönetimi
        customer1.deposit(1000);


        System.out.println(customer1);
        System.out.println("Balance : "+customer1.getBalance());

        try {
            customer1.withdraw(600);
        } catch (InsufficientBalanceException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Balance : "+customer1.getBalance());

        try {
            customer1.withdraw(500);
        } catch (InsufficientBalanceException e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Balance : "+customer1.getBalance());
        }


    }
}
