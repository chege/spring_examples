package io.chege.demos.layers.bizlayer.service;

import io.chege.demos.layers.bizlayer.Review;
import io.chege.demos.layers.bizlayer.ReviewRepository;
import io.chege.demos.layers.bizlayer.ReviewedBrewery;
import io.chege.demos.layers.bizlayer.client.Brewery;
import io.chege.demos.layers.bizlayer.client.OpenBreweryDb;
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
            final List<Brewery> breweries = Objects.requireNonNullElseGet(response.getBody(), Collections::emptyList);
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

    public Optional<ReviewedBrewery> findBrewery(String id) {
        final ResponseEntity<Brewery> response = openBreweryDb.get(id);
        if (response.getStatusCode().is2xxSuccessful()) {
            final Brewery brewery = response.getBody();
            if (null != brewery) {
                Set<Review> reviews = reviewRepo.findReviewsByBreweryId(brewery.id);
                return Optional.of(
                        new ReviewedBrewery(brewery.name, reviews)
                );
            } else {
                return Optional.empty();
            }
        } else {
            return Optional.empty();
        }

    }
}
