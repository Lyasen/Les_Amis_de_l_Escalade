package fr.lyasen.climbing.dao;

import fr.lyasen.climbing.model.forms.Form_subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Access data on form
 */
@Repository
public interface SubscriptionDao extends JpaRepository<Form_subscription, Integer> {}
