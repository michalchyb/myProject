package pl.coderslab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @Controller
    public class MyController {

        @RequestMapping("/")
        public void handleRequest() {
            throw new RuntimeException("test exception");
        }
    }
}
