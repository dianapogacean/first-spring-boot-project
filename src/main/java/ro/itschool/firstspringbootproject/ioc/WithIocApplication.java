package ro.itschool.firstspringbootproject.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WithIocApplication implements CommandLineRunner {


    //dependency injection - field injection
    @Autowired
    @Qualifier("creditPaymentService")
    private PaymentService service;

    @Autowired
    private PaymentService cashPaymentService;

    @Override
    public void run(String... args) throws Exception {

        service.makePayment(10.0);
        service.makePayment(15.0);

        cashPaymentService.makePayment(99);
        cashPaymentService.makePayment(2222);
    }
}
