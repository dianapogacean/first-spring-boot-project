package ro.itschool.firstspringbootproject.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public PaymentProcessor creditPaymentProcessor() {
        return new CreditCardPaymentProcessor();
    }

    @Bean
    public PaymentProcessor cashPaymentProcessor() {
        return new CashPaymentProcessor();
    }

    @Bean
    public PaymentService creditPaymentService(PaymentProcessor creditPaymentProcessor) {
        return new PaymentService(creditPaymentProcessor);
    }

    @Bean
    public PaymentService cashPaymentService(PaymentProcessor cashPaymentProcessor) {
        return new PaymentService(cashPaymentProcessor);
    }

}
