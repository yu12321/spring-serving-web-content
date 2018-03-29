package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@Autowired
	private ProductService productService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="doumo", required=false, defaultValue="World") String doumo, Model model) {

    	System.out.println("start");

    	productService.gagaga();

        model.addAttribute("doumo", doumo);

        System.out.println("end");

        return "greeting";
    }
}