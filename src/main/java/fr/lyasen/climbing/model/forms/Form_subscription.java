package fr.lyasen.climbing.model.forms;

import fr.lyasen.climbing.todo.Todo;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "subscription")
public class Form_subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false, columnDefinition = "INT UNSIGNED")
    private int userId;

    @Length(min = 2, max = 50)
    @Pattern(regexp = "^([a-zA-Z]+[\\s'.]?)+\\S$")
    @Column(name = "last_name", nullable = false, columnDefinition = "VARCHAR(50)")
    private String lastName;

    @Length(min = 2, max = 50)
    @Pattern(regexp = "^([a-zA-Z]+[\\s'.]?)+\\S$")
    @Column(name = "first_name", nullable = false, columnDefinition = "VARCHAR(50)")
    private String firstName;

    @Length(min = 3, max = 50)
    @Column(name = "pseudo", nullable = false, unique = true, columnDefinition = "VARCHAR(32)")
    private String pseudo;

    @Email
    @Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")
    @Column(name = "email", nullable = false, columnDefinition = "VARCHAR(255)")
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "climber_level")
    private ClimberLevel climberLevel;

    @Pattern(regexp = "(.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
    @Column(name = "password", nullable = false, columnDefinition = "VARCHAR(255)")
    private String password;

    @Todo(
            commentary = "Etablir une méthode de comparaison avec le mot de passe créé afin d'établir que l'utilisateur souhaitant s'inscrire " +
                    "inscrive bien le mot de passe qu'il a en tête"
    )
    private String confirmPassword;

    public Form_subscription(String lastName, String firstName, String pseudo, String email,
                             ClimberLevel climberLevel, String password, String confirmPassword) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.pseudo = pseudo;
        this.email = email;
        this.climberLevel = climberLevel;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public Form_subscription() {}

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClimberLevel getClimberLevel() {
        return climberLevel;
    }

    public void setClimberLevel(ClimberLevel climberLevel) {
        this.climberLevel = climberLevel;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
