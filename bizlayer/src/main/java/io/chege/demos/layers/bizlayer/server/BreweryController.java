package io.chege.demos.layers.bizlayer.server;

import io.chege.demos.layers.bizlayer.ReviewedBrewery;
import io.chege.demos.layers.bizlayer.service.BreweryService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/breweries")
public class BreweryController {
    private final BreweryService service;

    public BreweryController(BreweryService service) {
        this.service = service;
    }

    @GetMapping
    Set<ReviewedBrewery> get() {
        return service.findBreweries();
    }

    @GetMapping("/{id}")
    Optional<ReviewedBrewery> get(@PathVariable("id") String id) {
        return service.findBrewery(id);
    }

}
