package fr.lyasen.climbing.dao;

import fr.lyasen.climbing.model.forms.Form_subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

/**
 * Access data on form
 */
@Repository
public interface SubscriptionDao extends JpaRepository<Form_subscription, Integer> {}
