package pl.coderslab.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.City;
import pl.coderslab.entity.Run;
import pl.coderslab.entity.User;
import pl.coderslab.repository.CityRepository;
import pl.coderslab.repository.RunRepository;
import pl.coderslab.repository.UserRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;
    private RunRepository runRepository;

    public UserController(UserRepository userRepository, RunRepository runRepository) {
        this.userRepository = userRepository;
        this.runRepository = runRepository;
    }

    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "user";
    }

    @PostMapping("/add")
    public String addUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "user";
        } else {
            this.userRepository.save(user);
            return "redirect:/run/add";
        }

    }

    @GetMapping("/all")
    public String list(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "usersList";
    }

    @ModelAttribute("users")
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }


    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id) {
        userRepository.delete(id);
        return "redirect:/user/all";
    }

    @ModelAttribute("runs")
    public List<Run> getRuns() {
        return this.runRepository.findAll();
    }

    @GetMapping("/update/{id}")
    public String showUpdate(Model model, @PathVariable long id) {
        model.addAttribute("user", userRepository.findOne(id));
        return "userUpdate";
    }

    @PostMapping("/update")
    public String performUpdate(@ModelAttribute @Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "userUpdate";
        }
        userRepository.save(user);
        return "redirect:/user/all";
    }
}
