package io.chege.demos.layers.bizlayer;

import org.springframework.data.annotation.Id;

public class Review {
    @Id
    private int id;
    private String comment;
    private int breweryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getBreweryId() {
        return breweryId;
    }

    public void setBreweryId(int breweryId) {
        this.breweryId = breweryId;
    }
}
