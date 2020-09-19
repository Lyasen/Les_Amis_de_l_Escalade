package fr.lyasen.climbing.model.forms;

public enum ClimberLevel {
    NONPRACTICING ("Non pratiquant"), ROOKIE ("Débutant"), AMATEUR ("Amateur"), EXPERIENCED ("Confirmé"), EXPERT ("Expert");
    private final String label;
    //  Constructor
    ClimberLevel(String label) {this.label = label;}
    public String getLabel() {return label;}
}
