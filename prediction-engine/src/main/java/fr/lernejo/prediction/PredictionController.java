package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PredictionController {
    private final TemperatureService service = new TemperatureService();

    @GetMapping("/api/temperature")
    public PredictionTemperature getTemperatures(@RequestParam String country) {
        List<PredictionTemperature.Temperature> temperatures = new ArrayList<>();

        final double temperature1 = service.getTemperature(country);
        final double temperature2 = service.getTemperature(country);
        final LocalDate aujourdhui = LocalDate.now();
        final LocalDate hier = aujourdhui.minusDays(1);
        temperatures.add(new PredictionTemperature.Temperature(aujourdhui, temperature1));
        temperatures.add(new PredictionTemperature.Temperature(hier, temperature2));
        return new PredictionTemperature(country, temperatures);
    }
}
