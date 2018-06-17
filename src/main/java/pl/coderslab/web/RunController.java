package pl.coderslab.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.City;
import pl.coderslab.entity.Run;
import pl.coderslab.entity.Run;
import pl.coderslab.entity.User;
import pl.coderslab.repository.*;
import pl.coderslab.repository.RunRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/run")
public class RunController {

    @Autowired
    private RunRepository runRepository;
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private UserRepository userRepository;


    @GetMapping("/add")
    public String addRun(Model model) {
        model.addAttribute("run", new Run());
        return "run";
    }

    @PostMapping("/add")
    public String addRun(@Valid Run run, BindingResult result,
                         @RequestParam String ahour,
                         @RequestParam String aminutes,
                         @RequestParam String aseconds
    ) {
        String newTime = ahour + ":" + aminutes + ":" + aseconds;

        run.setTime(newTime);
        System.out.println(ahour + aminutes + aseconds);
        if (result.hasErrors()) {
            return "error";
        } else {
            this.runRepository.save(run);
            return "added";
        }

    }


    @GetMapping("/delete/{id}")
    public String deleteRun(@PathVariable long id) {
        runRepository.delete(id);
        return "redirect:/run/all";
    }

    @ModelAttribute("runs")
    public List<Run> getRuns() {
        return this.runRepository.findAll();
    }

    @ModelAttribute("users")
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }


    @ModelAttribute("cities")
    public List<City> getCities() {
        return this.cityRepository.findAll();
    }

    @GetMapping("/all")
    public String list(Model model) {
        return "runList";
    }


    @GetMapping("/update/{id}")
    public String showUpdate(Model model, @PathVariable long id) {
        model.addAttribute("run", runRepository.findOne(id));
        return "runUpdate";
    }

    @PostMapping("/update")
    public String performUpdate(@ModelAttribute @Valid Run run, BindingResult result) {
        if (result.hasErrors()) {
            return "runUpdate";
        }
        runRepository.save(run);
        return "redirect:/run/all";
    }

    @GetMapping("/menu")
    public String runMenu() {
        return "runMenu";
    }
}
