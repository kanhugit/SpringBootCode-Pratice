package in.ashokit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgController {

    @GetMapping("/welcome")
    @ResponseBody
    public String wellcomeMsg() {
        return "Welcome to Interceptor.."; // Fixed spelling mistake
    }

    @GetMapping("/greet")
    @ResponseBody
    public String greetMsg() {
        return "Good Evening...!";
    }
}
