package fr.lyasen.climbing.model.forms;

import javax.persistence.*;

@Entity
@Table(name = "share_site")
public class Form_shareSite {
    @Id
    @Column(name = "site_id", nullable = false, columnDefinition = "INT UNSIGNED AUTO_INCREMENT")
    private int siteId;
    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(32)")
    private String name;
    @Column(name = "location", nullable = false, columnDefinition = "VARCHAR(32)")
    private String location;
    @Column(name = "altitude", nullable = false, columnDefinition = "INT UNSIGNED")
    private Integer altitude;
    @Column(name = "height", nullable = false, columnDefinition = "INT UNSIGNED")
    private Integer height;

    private enum ClimbType {
        BLOCKS , CLIFFS, MOUNTAIN, HIGHMOUNTAIN
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "climb_type")
    private ClimbType climbType;

    private enum Orientation {
        ALL, NORTH, SOUTH, EAST, WEST
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "orientation")
    private Orientation orientation;

    @Column(name = "lanes_min", nullable = false, columnDefinition = "INT UNSIGNED")
    private Integer lanesMin;
    @Column(name = "lanes_max", nullable = false, columnDefinition = "INT UNSIGNED")
    private Integer lanesMax;

    private enum SiteLevel {
        ROOKIE, AMATEUR, EXPERIENCED, EXPERT
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "site_level")
    private SiteLevel siteLevel;

    @Column(name = "restrictions", nullable = true, columnDefinition = "TEXT")
    private String restrictions;
    @Column(name = "information", nullable = false, columnDefinition = "TEXT")
    private String information;
    @Column(name = "is_official", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean isOfficial;

    public Form_shareSite() {}

    public Form_shareSite(int siteId,
                          String name,
                          String location,
                          int altitude,
                          int height,
                          ClimbType climbType,
                          Orientation orientation,
                          int lanesMin,
                          int lanesMax,
                          SiteLevel siteLevel,
                          String restrictions,
                          String information,
                          boolean isOfficial) {
        this.siteId = siteId;
        this.name = name;
        this.location = location;
        this.altitude = altitude;
        this.height = height;
        this.climbType = climbType;
        this.orientation = orientation;
        this.lanesMin = lanesMin;
        this.lanesMax = lanesMax;
        this.siteLevel = siteLevel;
        this.restrictions = restrictions;
        this.information = information;
        this.isOfficial = isOfficial;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public ClimbType getClimbType() {
        return climbType;
    }

    public void setClimbType(ClimbType climbType) {
        this.climbType = climbType;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public Integer getLanesMin() {
        return lanesMin;
    }

    public void setLanesMin(Integer lanesMin) {
        this.lanesMin = lanesMin;
    }

    public Integer getLanesMax() {
        return lanesMax;
    }

    public void setLanesMax(Integer lanesMax) {
        this.lanesMax = lanesMax;
    }

    public SiteLevel getSiteLevel() {
        return siteLevel;
    }

    public void setSiteLevel(SiteLevel siteLevel) {
        this.siteLevel = siteLevel;
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

    public boolean isOfficial() {
        return isOfficial;
    }

    public void setOfficial(boolean official) {
        isOfficial = official;
    }
}
