package git_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	int x =100;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
