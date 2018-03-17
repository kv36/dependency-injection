package kartheek.springframework.di.Config;

import kartheek.springframework.di.Services.WelcomeFactory;
import kartheek.springframework.di.Services.WelcomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@org.springframework.context.annotation.Configuration
public class Configuration {

//    @Bean
//    public WelcomeFactory welcomeFactory() {
//        return new WelcomeFactory();
//    }

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
    @Profile({"default", "english"})
    @Primary
    public WelcomeService welcomeServiceEnglish(WelcomeFactory welcomeFactory) {
        return welcomeFactory.createWelcomeService("en");
    }

    @Bean
    @Profile("telugu")
    @Primary
    public WelcomeService welcomeServiceTelugu(WelcomeFactory welcomeFactory) {
        return welcomeFactory.createWelcomeService("tel");
    }

//    @Bean("tamil")
//    public WelcomeService welcomeServiceTamil(WelcomeFactory welcomeFactory) {
//        return welcomeFactory.createWelcomeService("tam");
//    }

//    @Bean
//    public WelcomeService welcomeServiceHindi(WelcomeFactory welcomeFactory) {
//        return welcomeFactory.createWelcomeService("hin");
//    }

}
