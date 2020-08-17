package fr.lyasen.climbing.model.forms;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "list_topos")
public class Form_topo {
    @Id
    @Column(name = "topo_id", nullable = false, columnDefinition = "INT UNSIGNED AUTO_INCREMENT")
    private int topoId;
    @Column(name = "name_topo", nullable = false, columnDefinition = "VARCHAR(32)")
    private String topo;
    @Column(name = "location_topo", nullable = false, columnDefinition = "VARCHAR(32)")
    private String locationTopo;
    @Column(name = "description_topo", nullable = false, columnDefinition = "TINYTEXT")
    private String descriptionTopo;
    @Column(name = "author", nullable = false, columnDefinition = "VARCHAR(36)")
    private String author;
    @Column(name = "publication", nullable = false)
    @DateTimeFormat(pattern = "dd-MM-YYYY")
    private Date publication;
    @Column(name = "is_lend", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean isLend;

    public Form_topo(){}

    public Form_topo(int topoId, String topo, String locationTopo, String descriptionTopo, String author, Date publication, boolean isLend) {
        this.topoId = topoId;
        this.topo = topo;
        this.locationTopo = locationTopo;
        this.descriptionTopo = descriptionTopo;
        this.author = author;
        this.publication = publication;
        this.isLend = isLend;
    }

    public int getTopoId() {
        return topoId;
    }

    public void setTopoId(int topoId) {
        this.topoId = topoId;
    }

    public String getTopo() {
        return topo;
    }

    public void setTopo(String topo) {
        this.topo = topo;
    }

    public String getLocationTopo() {
        return locationTopo;
    }

    public void setLocationTopo(String locationTopo) {
        this.locationTopo = locationTopo;
    }

    public String getDescriptionTopo() {
        return descriptionTopo;
    }

    public void setDescriptionTopo(String descriptionTopo) {
        this.descriptionTopo = descriptionTopo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublication() {
        return publication;
    }

    public void setPublication(Date publication) {
        this.publication = publication;
    }

    public boolean isLend() {
        return isLend;
    }

    public void setLend(boolean lend) {
        isLend = lend;
    }
}
