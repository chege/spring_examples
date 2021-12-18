package io.chege.demos.layers.bizlayer;

import java.util.Set;

public class ReviewedBrewery {
    private final String name;
    private final Set<Review> reviews;

    public ReviewedBrewery(String name, Set<Review> reviews) {
        this.name = name;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public Set<Review> getReviews() {
        return reviews;
    }
}
