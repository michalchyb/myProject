package pl.coderslab.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.City;
import pl.coderslab.entity.Region;
import pl.coderslab.repository.RegionRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/region")
public class RegionController {
    private RegionRepository regionRepository;

    public RegionController(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @GetMapping("/add")
    public String addRegion(Model model) {
        model.addAttribute("region", new Region());
        return "region";
    }

    @PostMapping("/add")
    public String addRegion(@Valid Region region, BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        } else {
            this.regionRepository.save(region);
            return "redirect:/run/add";
        }

    }

    @GetMapping("/all")
    public String list(Model model) {
        return "regionsList";
    }


    @ModelAttribute("regions")
    public List<Region> getRegions() {
        return this.regionRepository.findAll();
    }

    @GetMapping("/delete/{id}")
    public String deleteRegion(@PathVariable long id) {
        regionRepository.delete(id);
        return "redirect:/region/all";
    }

}