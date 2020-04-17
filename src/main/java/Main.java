import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.staticFiles;

public class Main {
    public static void main(String[] args) {
        staticFiles.location("/spark/template/freemarker");

        Spark.get("/", (request, response) -> {
            ArrayList<CountryInfo> countriesInfo = new ArrayList<>();
            countriesInfo.add(new CountryInfo("Rep.Dom", 5, 0));
            countriesInfo.add(new CountryInfo("Rep.Dom", 95, 1));
            countriesInfo.add(new CountryInfo("Rep.Dom", 118, 2));
            countriesInfo.add(new CountryInfo("Rep.Dom", 83, 3));
            countriesInfo.add(new CountryInfo("Rep.Dom", 32, 4));
            Map<String, Object> atributos = new HashMap<>();
            atributos.put("infoCountries", countriesInfo);
            return renderFreemarker(atributos, "graph.ftl");
        });


    }
    public static String renderFreemarker(Map<String, Object> model, String templatePath) {
        return new FreeMarkerEngine().render(new ModelAndView(model, templatePath));
    }
}
