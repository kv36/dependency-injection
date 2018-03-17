package kartheek.springframework.di;

import kartheek.springframework.di.Services.WelcomeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/welcome-config.xml", "classpath*:/english-config.xml"})
public class EnglishIntegrationTest {

    @Autowired
    private WelcomeService welcomeService;

    @Test
    public void getWelcomeMessage() {
       String message = welcomeService.wishWithWelcomeMessage();
       assertEquals("welcome to spring world", message);
    }
}
