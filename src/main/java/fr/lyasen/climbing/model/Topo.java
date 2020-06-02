package fr.lyasen.climbing.model;

import java.time.LocalDate;

public class Topo {
    private boolean inFrance;
    private boolean official;
    private String title;
    private String description;
    private String location;
    private String country;
    private LocalDate publishDate;

    public boolean isInFrance() {
        return inFrance;
    }

    public void setInFrance(boolean inFrance) {
        this.inFrance = inFrance;
    }

    public boolean isOfficial() {
        return official;
    }

    public void setOfficial(boolean official) {
        this.official = official;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
}
