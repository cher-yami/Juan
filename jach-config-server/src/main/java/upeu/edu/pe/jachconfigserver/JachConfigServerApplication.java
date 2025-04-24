package upeu.edu.pe.jachconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class JachConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JachConfigServerApplication.class, args);
    }

}
