package ro.itschool.firstspringbootproject.ioc;

public class CashPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Making cash payment of amount: " + amount);
    }
}
