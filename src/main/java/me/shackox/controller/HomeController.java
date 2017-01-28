package me.shackox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by SHACKOX on 13/01/17.
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView view1() {
        return new ModelAndView("index");
    }
}
