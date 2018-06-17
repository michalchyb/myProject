package pl.coderslab.web;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.entity.City;
import pl.coderslab.entity.RunImport;
import pl.coderslab.repository.CityRepository;
import pl.coderslab.repository.StravaRepository;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/strava")
public class StravaController {

    private StravaRepository stravaRepository;

    public StravaController(StravaRepository stravaRepository) {
        this.stravaRepository = stravaRepository;
    }

    @GetMapping("/import")
    public String stravaImport(Model model) {
        Document doc;
        try {
            doc = Jsoup.connect("https://www.endomondo.com/users/13505618/workouts/latest").get();

            Elements tests = doc.select("div.workoutStat");
            System.out.println(tests);



        } catch (IOException e) {
            e.printStackTrace();
        }
        return "strava";
    }
}

