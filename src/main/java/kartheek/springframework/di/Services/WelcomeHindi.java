package kartheek.springframework.di.Services;

//@Component
public class WelcomeHindi implements WelcomeService{

    @Override
    public String wishWithWelcomeMessage() {
       // System.out.println("namasthey aayiye");
        return "namasthey aayiye";
    }
}
