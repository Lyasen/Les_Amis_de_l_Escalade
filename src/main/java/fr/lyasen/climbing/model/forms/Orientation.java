package fr.lyasen.climbing.model.forms;

public enum Orientation {
    NORTH ("Nord"), SOUTH ("Sud"), EAST ("Est"), WEST ("Ouest");
    private final String label;
    Orientation(String label) {
        this.label = label;
    }
    public String getLabel() {
        return label;
    }
}