package mr.demonid.spring.hw4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("mr.demonid.spring.hw4.config")
public class SpringHw4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringHw4Application.class, args);
    }

}
