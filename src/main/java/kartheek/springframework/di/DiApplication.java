package kartheek.springframework.di;

import kartheek.springframework.di.Controllers.WelcomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/spring-config.xml")
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

		WelcomeController welcomeController = (WelcomeController) ctx.getBean("welcomeController");
		welcomeController.welcomeWithSmile();
	}
}
