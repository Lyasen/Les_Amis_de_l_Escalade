package fr.lyasen.climbing.model.forms;

public enum ClimbType {
    BLOCKS ("Blocs") , CLIFFS ("Falaises"), MOUNTAIN ("Montagne"), HIGHMOUNTAIN ("Haute-Montagne");
    private final String label;
    //  Constructor
    ClimbType(String label) {
        this.label = label;
    }
    public String getLabel() {
        return label;
    }
}