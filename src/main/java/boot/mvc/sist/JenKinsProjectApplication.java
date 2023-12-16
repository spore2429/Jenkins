package boot.mvc.sist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("boot.*")
public class JenKinsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenKinsProjectApplication.class, args);
	}

}
