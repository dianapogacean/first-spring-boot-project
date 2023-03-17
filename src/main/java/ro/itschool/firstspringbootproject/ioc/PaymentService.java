package ro.itschool.firstspringbootproject.ioc;

public class PaymentService {

    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {
        this.paymentProcessor.processPayment(amount);
    }
}
