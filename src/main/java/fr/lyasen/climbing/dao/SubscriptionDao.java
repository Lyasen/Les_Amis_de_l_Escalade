package fr.lyasen.climbing.dao;

import fr.lyasen.climbing.model.forms.Form_subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Access data on form
 */
@Repository
public interface SubscriptionDao extends JpaRepository<Form_subscription, Integer> {
    @Query("SELECT user FROM Form_subscription user WHERE user.pseudo=:pseudoOrEmail OR user.email=:pseudoOrEmail")
    Form_subscription findByUserNameOrEmail(String pseudoOrEmail);
}
