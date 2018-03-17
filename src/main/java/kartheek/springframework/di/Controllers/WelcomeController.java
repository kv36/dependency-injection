package kartheek.springframework.di.Controllers;

import kartheek.springframework.di.Services.WelcomeService;

//@Controller
//@ComponentScan("define package here ")
public class WelcomeController {

    private WelcomeService welcomeService;
    private WelcomeService welcomeTelugu;
    private WelcomeService welcomeHindi;
    private WelcomeService welcomeTamil;

//    @Autowired
    public void setWelcomeService(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

//    @Autowired
//    @Qualifier("welcomeServiceTelugu")
    public void setWelcomeTelugu(WelcomeService welcomeTelugu) {
        this.welcomeTelugu = welcomeTelugu;
    }

//    @Autowired
//    @Qualifier("welcomeServiceHindi")
    public void setWelcomeHindi(WelcomeService welcomeHindi) {
        this.welcomeHindi = welcomeHindi;
    }

//    @Autowired
//    @Qualifier("tamil")
    public void setWelcomeTamil(WelcomeService welcomeTamil) {
        this.welcomeTamil = welcomeTamil;
    }

    public String welcomeWithSmile() {
       String  welcomeMessage =  welcomeService.wishWithWelcomeMessage();

      //  System.out.println(welcomeService.wishWithWelcomeMessage());
        System.out.println(welcomeHindi.wishWithWelcomeMessage());
        System.out.println(welcomeTamil.wishWithWelcomeMessage());
        System.out.println(welcomeTelugu.wishWithWelcomeMessage());

        return welcomeMessage;
    }
}
