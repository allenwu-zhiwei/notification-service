import com.nusiss.notification_service.config.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @RequestMapping(value = "/nofitfy", method = RequestMethod.GET)
    public ApiResponse nofitfy(){

        return ApiResponse.success();
    }
}
