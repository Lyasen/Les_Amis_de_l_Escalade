package fr.lyasen.climbing.model.forms;

public enum SiteLevel {
    ROOKIE ("Débutant (du 3a au 5c)"), AMATEUR ("Amateur (du 6a au 6c)"), EXPERIENCED ("Confirmé (du 7a au 7c)"), EXPERT ("Expert (à partir du 8a)");
    private final String label;
    SiteLevel(String label) {
        this.label = label;
    }
    public String getLabel() {
        return label;
    }
}