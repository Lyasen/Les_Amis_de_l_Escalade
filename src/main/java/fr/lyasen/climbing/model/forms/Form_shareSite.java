package fr.lyasen.climbing.model.forms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="share_sites")
public class Form_shareSite {
    @id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private GeoLocation location;
    private int altitude, height;
    private enum climb_type {
        BLOCKS, CLIFFS, MOUNTAIN, HIGHMOUNTAIN
    }
    private enum orientation {
        ALL, NORTH, SOUTH, EAST, WEST
    }
    private int numberOfLanes;
    private enum siteLevel {
        ROOKIE, AMATEUR, EXPERIENCED, EXPERT
    }
    private String restrictions, information;
    private byte[] image;
    private boolean isOfficial;

    public Form_shareSite(String name, int altitude, int height, int numberOfLanes, String restrictions, String information, byte[] image, boolean isOfficial) {
        this.name = name;
        location = new GeoLocation(latitude, longitude);
        this.altitude = altitude;
        this.height = height;
        this.numberOfLanes = numberOfLanes;
        this.restrictions = restrictions;
        this.information = information;
        this.image = image;
        this.isOfficial = isOfficial;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GeoLocation getLocation() {
        return location;
    }

    public void setLocation(GeoLocation location) {
        this.location = location;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumberOfLanes() {
        return numberOfLanes;
    }

    public void setNumberOfLanes(int numberOfLanes) {
        this.numberOfLanes = numberOfLanes;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public boolean isOfficial() {
        return isOfficial;
    }

    public void setOfficial(boolean official) {
        isOfficial = official;
    }
}
