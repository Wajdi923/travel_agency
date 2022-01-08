package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class ApiController {
    private final TemperatureService temperatureService;
    private final Set<Inscription> inscriptions = new HashSet<>();

    public ApiController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @PostMapping("/api/inscription")
    public void inscrire(@RequestBody Inscription inscription) {
        inscriptions.add(inscription);
    }

    @GetMapping("/api/travels")
    public List<Travel> getTravels(@RequestParam("userName") String userName) {
        return List.of(new Travel("France", 33.0), new Travel("Turquie", 42.2));
    }
}
