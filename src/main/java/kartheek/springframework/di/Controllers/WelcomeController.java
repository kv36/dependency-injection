package kartheek.springframework.di.Controllers;

import kartheek.springframework.di.Services.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
//@ComponentScan("define package here ")
public class WelcomeController {

    private WelcomeService welcomeService;

    @Autowired
    public void setWelcomeService(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    public String welcomeWithSmile() {
       return welcomeService.wishWithWelcomeMessage();
    }
}
