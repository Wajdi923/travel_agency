package fr.lernejo.travelsite;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {
    private final PredictionEngineClient predictionEngineClient;

    public TemperatureService(PredictionEngineClient predictionEngineClient) {
        this.predictionEngineClient = predictionEngineClient;
    }

}
