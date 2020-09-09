package fr.lyasen.climbing.service.forms;

import fr.lyasen.climbing.dao.ConnectionDao;
import fr.lyasen.climbing.model.forms.Form_connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Establish a connection with a subscribe member
 */
@Service
public class ConnectionService {
    @Autowired
    ConnectionDao connectionDao;

    public ConnectionService() {}
}
