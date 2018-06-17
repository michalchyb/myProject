package pl.coderslab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/index2")
    public String home2() {
        return "index2";
    }
    @GetMapping("/index1")
    public String home1() {
        return "index";
    }

    @GetMapping("/about")
    public String about1() {
        return "about";
    }
//    @GetMapping("/about")
//    public String about1() {
//        return "about";
//    }

    @GetMapping("/404")
    public String error404() {
        return "404";
    }
    @GetMapping("/405")
    public String error405() {
        return "405";
    }
    @GetMapping("/500")
    public String error500() {
        return "500";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
