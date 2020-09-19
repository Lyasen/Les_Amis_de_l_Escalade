package fr.lyasen.climbing.dao;

import fr.lyasen.climbing.model.forms.Form_topo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateTopoDao extends JpaRepository<Form_topo, Integer> {}
