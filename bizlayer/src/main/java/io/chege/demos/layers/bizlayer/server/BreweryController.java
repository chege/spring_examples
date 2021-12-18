package io.chege.demos.layers.bizlayer.server;

import io.chege.demos.layers.bizlayer.ReviewedBrewery;
import io.chege.demos.layers.bizlayer.service.BreweryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
