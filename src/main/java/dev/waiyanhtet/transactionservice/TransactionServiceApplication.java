package dev.waiyanhtet.transactionservice;

import dev.waiyanhtet.transactionservice.config.GreetPropertiesConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@SpringBootApplication
@RequiredArgsConstructor
public class TransactionServiceApplication {

    private final GreetPropertiesConfig greetPropertiesConfig;


    public static void main(String[] args) {
        SpringApplication.run(TransactionServiceApplication.class, args);
    }

    @GetMapping("/greet")
    public String greet() {
        if(greetPropertiesConfig.isGreetServiceEnabled()) {
            return greetPropertiesConfig.getGreet();
        }
        return "Hello with default value";
    }

}
