package pips.com.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PipsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipsApplication.class, args);
	}
}
