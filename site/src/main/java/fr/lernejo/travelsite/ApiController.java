package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @PostMapping("/api/inscription")
    public void inscrire(@RequestBody Inscription inscription) {

    }

    @GetMapping("/api/travels")
    public List<Travel> getTravels(@RequestParam("userName") String userName) {
        return List.of(new Travel("France", 33.0), new Travel("Turquie", 42.2));
    }
}
