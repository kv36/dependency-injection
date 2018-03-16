package kartheek.springframework.di.Config;

import kartheek.springframework.di.Services.WelcomeFactory;
import kartheek.springframework.di.Services.WelcomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public WelcomeFactory welcomeFactory() {
        return new WelcomeFactory();
    }

//    @Bean
//   // @Primary
//    @Profile({"default","english"})
//    public WelcomeService WelcomeEnglish() {
//        return new WelcomeEnglish();
//    }
//
//    @Bean
//    @Profile("telugu")
//    public WelcomeService WelcomeTelugu() {
//        return new WelcomeTelugu();
//    }

    @Bean
    @Profile("english")
    public WelcomeService welcomeServiceEnglish(WelcomeFactory welcomeFactory) {
        return welcomeFactory.createWelcomeService("en");
    }

    @Bean
    @Profile("tamil")
    public WelcomeService welcomeServiceTelugu(WelcomeFactory welcomeFactory) {
        return welcomeFactory.createWelcomeService("tam");
    }


}
