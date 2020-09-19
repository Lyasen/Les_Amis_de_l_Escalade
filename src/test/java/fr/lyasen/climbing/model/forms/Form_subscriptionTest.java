package fr.lyasen.climbing.model.forms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Form_subscriptionTest {
    @Test
    public void testSetUserId() {
        Form_subscription form_subscription = new Form_subscription();
        form_subscription.setUserId(123);
        assertEquals(123, form_subscription.getUserId());
    }

    @Test
    public void testSetLastName() {
        Form_subscription form_subscription = new Form_subscription();
        form_subscription.setLastName("Doe");
        assertEquals("Doe", form_subscription.getLastName());
    }

    @Test
    public void testSetFirstName() {
        Form_subscription form_subscription = new Form_subscription();
        form_subscription.setFirstName("Jane");
        assertEquals("Jane", form_subscription.getFirstName());
    }

    @Test
    public void testSetPseudo() {
        Form_subscription form_subscription = new Form_subscription();
        form_subscription.setPseudo("pseudo");
        assertEquals("pseudo", form_subscription.getPseudo());
    }

    @Test
    public void testSetEmail() {
        Form_subscription form_subscription = new Form_subscription();
        form_subscription.setEmail("email");
        assertEquals("email", form_subscription.getEmail());
    }

    @Test
    public void testSetClimberLevel() {
        Form_subscription form_subscription = new Form_subscription();
        form_subscription.setClimberLevel(ClimberLevel.NONPRACTICING);
        assertEquals(ClimberLevel.NONPRACTICING, form_subscription.getClimberLevel());
    }

    @Test
    public void testSetPassword() {
        Form_subscription form_subscription = new Form_subscription();
        form_subscription.setPassword("iloveyou");
        assertEquals("iloveyou", form_subscription.getPassword());
    }

    @Test
    public void testSetConfirmPassword() {
        Form_subscription form_subscription = new Form_subscription();
        form_subscription.setConfirmPassword("iloveyou");
        assertEquals("iloveyou", form_subscription.getConfirmPassword());
    }
}

