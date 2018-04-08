package artifact.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@RequestMapping("/")
    public String home() {
        return "Hello Docker World 2";
    }

}
