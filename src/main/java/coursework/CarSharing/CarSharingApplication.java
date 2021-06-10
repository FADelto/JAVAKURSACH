package coursework.CarSharing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "coursework.CarSharing.*")
@ComponentScan(basePackages = "coursework.CarSharing.*")
@EnableTransactionManagement

public class CarSharingApplication {
	public static void main(String[] args) {
		SpringApplication.run(CarSharingApplication.class, args);
	}
}