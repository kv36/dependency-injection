package kartheek.springframework.di.Services;

//@Component
//@Primary
//@Profile("telugu")
public class WelcomeTelugu implements WelcomeService {
    @Override
    public String wishWithWelcomeMessage() {
        System.out.println("Namaskaram vicheyyandi");
        return "Namaskaram vicheyyandi";
    }
}
