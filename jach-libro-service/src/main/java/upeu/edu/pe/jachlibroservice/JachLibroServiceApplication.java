package upeu.edu.pe.jachlibroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JachLibroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JachLibroServiceApplication.class, args);
	}

}
