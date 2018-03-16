package kartheek.springframework.di.Services;

public class WelcomeHindi implements WelcomeService{

    @Override
    public String wishWithWelcomeMessage() {
        System.out.println("namasthey aayiye");
        return "namasthey aayiye";
    }
}
