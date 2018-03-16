package kartheek.springframework.di.Services;

public class WelcomeFactory {

    public WelcomeService createWelcomeService(String language){

        WelcomeService welcomeService = null;

        switch (language) {
            case "en":
                welcomeService = new WelcomeEnglish();
                break;
            case "tel":
                welcomeService = new WelcomeTelugu();
                break;
            case "tam":
                welcomeService = new WelcomeTamil();
                break;
            case "hin":
                welcomeService = new WelcomeHindi();
                break;

                default: new WelcomeEnglish();
        }

        return welcomeService;
    }
}
