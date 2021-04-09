import com.knoldus.service.SpeakerService;
import com.knoldus.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {
        //wire up SpeakerService
        SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
