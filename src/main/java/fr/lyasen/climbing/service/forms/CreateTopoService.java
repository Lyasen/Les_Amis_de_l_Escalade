package fr.lyasen.climbing.service.forms;

import fr.lyasen.climbing.dao.CreateTopoDao;
import fr.lyasen.climbing.model.forms.Form_topo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create a record from Form_topo
 */
@Service
public class CreateTopoService {
    @Autowired
    CreateTopoDao createTopoDao;

    public Form_topo save(Form_topo form) {
        return createTopoDao.save(form);
    }
}
