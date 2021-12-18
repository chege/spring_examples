package io.chege.demos.layers.bizlayer.service;

import io.chege.demos.layers.bizlayer.Review;
import io.chege.demos.layers.bizlayer.ReviewRepository;
import io.chege.demos.layers.bizlayer.ReviewedBrewery;
import io.chege.demos.layers.bizlayer.client.OpenBreweryDb;
import io.chege.demos.layers.bizlayer.client.Brewery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BreweryService {
    private final OpenBreweryDb openBreweryDb;
    private final ReviewRepository reviewRepo;

    public BreweryService(OpenBreweryDb openBreweryDb, ReviewRepository reviewRepo) {
        this.openBreweryDb = openBreweryDb;
        this.reviewRepo = reviewRepo;
    }

    public Set<ReviewedBrewery> findBreweries() {
        final ResponseEntity<List<Brewery>> response = openBreweryDb.allBreweries();

        if (response.getStatusCode().is2xxSuccessful()) {
            final List<Brewery> breweries = response.getBody();
            final Set<ReviewedBrewery> result = new HashSet<>();

            for (Brewery brewery : breweries) {
                final Set<Review> reviews = reviewRepo.findReviewsByBreweryId(brewery.id);
                result.add(new ReviewedBrewery(brewery.name, reviews));
            }

            return result;
        } else {
            return Collections.emptySet();
        }
    }
}
