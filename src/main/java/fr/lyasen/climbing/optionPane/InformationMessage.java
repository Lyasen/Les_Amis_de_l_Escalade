package fr.lyasen.climbing.optionPane;

import javax.swing.*;

public class InformationMessage {
    protected JOptionPane validateSubscription() {
        JOptionPane validate = new JOptionPane();
        JOptionPane.showMessageDialog(null, "Votre inscription est validée", "Validation inscription", JOptionPane.INFORMATION_MESSAGE);
        return validate;
    }
}
