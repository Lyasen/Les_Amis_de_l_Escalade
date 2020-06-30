package fr.lyasen.climbing.model;

public class Topo {
    private boolean inFrance;
    private boolean official;
    private String title;
    private String description;
    private String location;
    private String country;
    private String publishDate;
    private String author;

    public Topo(boolean inFrance, boolean official, String title, String description, String location, String country, String publishDate, String author) {
        this.inFrance = inFrance;
        this.official = official;
        this.title = title;
        this.description = description;
        this.location = location;
        this.country = country;
        this.publishDate = publishDate;
        this.author = author;
    }

    public boolean isInFrance() { return inFrance; }

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

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor(){return author;}

    public void setAuthor(String author) {this.author = author;}
}
