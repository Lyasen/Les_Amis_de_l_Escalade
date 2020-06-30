package fr.lyasen.climbing.model.forms;

import org.springframework.boot.autoconfigure.mail.MailProperties;

public class form_subscription {
    private String lastName, firstName, pseudo, password;
    private MailProperties mail;

    public form_subscription(String lastName, String firstName, String pseudo, MailProperties mail, String password) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.pseudo = pseudo;
        this.mail = mail;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MailProperties getMail() {
        return mail;
    }

    public void setMail(MailProperties mail) {
        this.mail = mail;
    }
}
