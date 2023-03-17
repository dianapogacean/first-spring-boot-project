package ro.itschool.firstspringbootproject;

import org.springframework.stereotype.Service;

@Service
//managed by the spring container - instantiere, lifecycle , delete etc
public class TextFormatterService {

    public String capitalize(String text) {
        return text.toUpperCase();
    }
}
