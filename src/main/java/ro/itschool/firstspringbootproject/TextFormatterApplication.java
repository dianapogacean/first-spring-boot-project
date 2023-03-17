package ro.itschool.firstspringbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
public class TextFormatterApplication implements CommandLineRunner {

    @Autowired
    private TextFormatterService textFormatterService;

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give value: ");

        String capitalized = textFormatterService.capitalize(scanner.nextLine());

        System.out.println(capitalized);
    }
}
