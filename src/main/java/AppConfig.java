import com.knoldus.model.Speaker;
import com.knoldus.repository.HibernateSpeakerRepositoryImpl;
import com.knoldus.repository.SpeakerRepository;
import com.knoldus.service.SpeakerService;
import com.knoldus.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * start of the application context
 * this is where we start configuring the context of our application.
 * All configuration start at this point and trickles throughout applications here.
 */
@Configuration
/**
 * @Configuration is class level annotation. | this signifies that this file to be used for configuration purpose.
 * @Bean is method level annotation. | Beans are by default singleton | we need only on instance of it
 */
public class AppConfig {
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository()); // SpeakerRepository is created as Bean | here it is using setter injection
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
