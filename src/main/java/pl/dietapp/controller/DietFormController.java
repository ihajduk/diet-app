package pl.dietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by iwha on 8/16/2016.
 */
@Controller
class DietFormController {

    @RequestMapping("/diet")
    public String diet(){
        return "dietForm";
    }
}
