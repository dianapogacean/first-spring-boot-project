package ro.itschool.firstspringbootproject.ioc;

public class WithoutIoc {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new CreditCardPaymentProcessor();
        PaymentService paymentService = new PaymentService(paymentProcessor);

        paymentService.makePayment(20.0);
        paymentService.makePayment(10.0);
    }
}
