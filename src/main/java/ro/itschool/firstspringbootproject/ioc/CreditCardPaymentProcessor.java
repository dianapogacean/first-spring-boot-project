package ro.itschool.firstspringbootproject.ioc;

public class CreditCardPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with credit card, amount: " + amount);
    }
}
