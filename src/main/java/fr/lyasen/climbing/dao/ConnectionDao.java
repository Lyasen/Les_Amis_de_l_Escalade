package fr.lyasen.climbing.dao;

import fr.lyasen.climbing.model.forms.Form_shareSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Access data on form
 */
@Repository
public interface ConnectionDao extends JpaRepository<Form_shareSite, Integer> {}