package io.chege.demos.layers.bizlayer;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface ReviewRepository extends CrudRepository<Review, Long> {
    @Query("select r.* from Review r where r.brewery_id = :breweryId")
    Set<Review> findReviewsByBreweryId(String breweryId);
}
