package pl.dietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
class HomeController {

    @RequestMapping("/")
    String index(Model model) {
        model.addAttribute("greetings", "Hello World!");
        return "index";
    }

    @RequestMapping("properties")
    @ResponseBody
    java.util.Properties properties() {
        return System.getProperties();
    }
}
