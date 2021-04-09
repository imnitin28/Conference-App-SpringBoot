import com.knoldus.service.SpeakerService;
import com.knoldus.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        /***
         * This is loading Spring and it's loading the configuration into ApplicationContext
         */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
