package pl.coderslab.web;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.entity.City;
import pl.coderslab.entity.Region;
import pl.coderslab.entity.Run;
import pl.coderslab.entity.RunImport;
import pl.coderslab.repository.CityRepository;
import pl.coderslab.repository.RunImportRepository;

import java.io.IOException;
import java.util.List;

@Controller
public class ImportData {
    private CityRepository cityRepository;
    private RunImportRepository runImportRepository;

    public ImportData(CityRepository cityRepository, RunImportRepository runImportRepository) {
        this.cityRepository = cityRepository;
        this.runImportRepository = runImportRepository;
    }

    @GetMapping("/runImport")
    public String runImport(Model model) {

        Document doc;
        try {
            runImportRepository.deleteAll();
            doc = Jsoup.connect("https://kalendarzbiegowy.pl/event,normal,month,10-06-2018,,,,0,,,,pomorskie,,,,,,,,,").get();
            Elements runs = doc.select("span[itemprop = summary]");
            Elements location = doc.select("span[itemprop = location]");
            Elements data = doc.select("td[itemprop = startdate]");
//            for (Element d : data) {
//                //System.out.println(d);
//                String substring = d.toString().substring(35);
//                String substringResult = substring.toString().substring(0, 10);
//                //System.out.println(substringResult);
//            }
//            for (Element run : runs) {
//                String replace1 = run.toString().replaceAll("<span itemprop=\"summary\">", "");
//                String resultRun = replace1.toString().replaceAll("</span>", "");
//                //System.out.println(resultRun);
//            }
//            for (Element l : location) {
//                String replace1 = l.toString().replaceAll("<span itemprop=\"location\">", "");
//                String result = replace1.toString().replaceAll(" <br> <small></small> <small class=\"extraSmall\">pomorskie</small> </span>", "");
//                // System.out.println(result);
//            }


            for (int i = 0; i < runs.size(); i++) {
            // debug test for 2 iterations only
            //for (int i = 0; i < 3; i++) {
                String replace1 = runs.get(i).toString().replaceAll("<span itemprop=\"summary\">", "");
                String resultRun = replace1.toString().replaceAll("</span>", "");

                String replace2 = location.get(i).toString().replaceAll("<span itemprop=\"location\">", "");
                String result = replace2.toString().replaceAll(" <br> <small></small> <small class=\"extraSmall\">pomorskie</small> </span>", "");

                String substring = data.get(i).toString().substring(35);
                String substringResult = substring.toString().substring(0, 10);

                RunImport runImport = new RunImport();
                runImport.setName(resultRun);
                runImport.setRunDate(substringResult);

                City c = cityRepository.findByName(result);
                if (c == null) {
                    City c1 = new City();
                    c1.setName(result);

                    cityRepository.save(c1);
                    runImport.setCity(c1);
                } else {
                    runImport.setCity(c);
                }
                runImportRepository.save(runImport);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "importDatafromWebsite";
    }
    @GetMapping("/runsInGivenCity/{id}")
    public String runsInGivenCity(Model model, @PathVariable long id) {
        //List<Run> runs = runRepository.findByCityId(id);
        List<RunImport> runs = runImportRepository.findByCityId(id);
        System.out.println(runs.size());
        model.addAttribute("runsInCty",runs);
        return "runListWhereGivenCity";
    }
}
