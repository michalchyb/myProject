package pl.coderslab.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.City;
import pl.coderslab.entity.Run;
import pl.coderslab.repository.CityRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/city")
public class CityController {

    private CityRepository cityRepository;

    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }


    @GetMapping("/add")
    public String addCity(Model model) {
        model.addAttribute("city", new City());
        return "city";
    }

    @PostMapping("/add")
    public String addCity(@Valid City city, BindingResult result) {
        if (result.hasErrors()) {
            return "city";
        } else {
            this.cityRepository.save(city);
            return "redirect:/run/add";
        }
    }

    @GetMapping("/delete/{id}")

    public String deleteCity(@PathVariable long id) {
        cityRepository.delete(id);
        //return "redirect:/city/all";
        return "redirect:/city/all";
    }

    @GetMapping("/all")
    public String list(Model model) {
        return "cityList";
    }

    @ModelAttribute("cities")
    public List<City> getCities() {
        return this.cityRepository.findAll();
    }

    @GetMapping("/update/{id}")
    public String updateCity(Model model, @PathVariable long id) {
        model.addAttribute("city", cityRepository.findOne(id));
        return "cityUpdate";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute @Valid City city, BindingResult result) {
        if (result.hasErrors()) {
            return "cityUpdate";
        }
        this.cityRepository.save(city);
        return "redirect:/city/all";
    }

    @GetMapping("/cityAndRuns")
    public String listAndRuns(Model model) {
        return "cityListForwardinRuns";
    }
}
