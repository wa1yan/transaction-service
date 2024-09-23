package dev.waiyanhtet.transactionservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "app")
@RefreshScope
public class GreetPropertiesConfig {

    private String greet;
    private boolean greetServiceEnabled;

}
