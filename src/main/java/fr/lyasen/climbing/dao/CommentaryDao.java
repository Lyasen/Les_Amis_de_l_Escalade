package fr.lyasen.climbing.dao;

import fr.lyasen.climbing.model.forms.Form_commentary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Access data on form
 */
@Repository
public interface CommentaryDao extends JpaRepository<Form_commentary, Integer> {}
