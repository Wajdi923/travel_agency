package fr.lernejo.prediction;

import java.time.LocalDate;
import java.util.List;

public record PredictionTemperature(String country, List<Temperature> temperatures) {

    record Temperature(LocalDate date, double temperature) {
    }
}
