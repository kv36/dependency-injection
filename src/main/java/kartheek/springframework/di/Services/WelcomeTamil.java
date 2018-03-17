package kartheek.springframework.di.Services;

public class WelcomeTamil implements WelcomeService {

    @Override
    public String wishWithWelcomeMessage() {
   //     System.out.println("namaskaram appa, eppu irke");
        return "namsakaram appa, eppu irke";
    }
}
