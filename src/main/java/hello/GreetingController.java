package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="doumo", required=false, defaultValue="World") String doumo, Model model) {
        model.addAttribute("doumo", doumo);
        return "greeting";
    }

}