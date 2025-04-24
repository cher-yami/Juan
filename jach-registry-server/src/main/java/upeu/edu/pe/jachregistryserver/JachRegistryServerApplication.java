package upeu.edu.pe.jachregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JachRegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JachRegistryServerApplication.class, args);
    }

}
