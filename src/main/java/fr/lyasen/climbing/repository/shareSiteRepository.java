package fr.lyasen.climbing.repository;

import fr.lyasen.climbing.model.forms.Form_shareSite;
import org.springframework.data.repository.CrudRepository;

public interface shareSiteRepository extends CrudRepository<Form_shareSite, Integer> {
    Form_shareSite findByName(String name);
}
