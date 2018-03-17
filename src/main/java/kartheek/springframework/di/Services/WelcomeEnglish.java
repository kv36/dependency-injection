package kartheek.springframework.di.Services;

//@Component
//@Primary
//@Profile("english")
//@Profile({"default", "english"})
public class WelcomeEnglish implements WelcomeService {

    @Override
    public String wishWithWelcomeMessage() {
     //   System.out.println("welcome to spring world");
        return "welcome to spring world";
    }
}
