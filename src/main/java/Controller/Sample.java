package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sample {

    @GetMapping("/message")
    public String getMessage(){
        return "Server is Up and Running";
    }
}
