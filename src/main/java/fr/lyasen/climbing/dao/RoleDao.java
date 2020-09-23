package fr.lyasen.climbing.dao;

import fr.lyasen.climbing.model.forms.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Integer> {
}
