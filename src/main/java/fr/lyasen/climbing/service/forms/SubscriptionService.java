package fr.lyasen.climbing.service.forms;

import fr.lyasen.climbing.dao.SubscriptionDao;
import fr.lyasen.climbing.model.forms.Form_subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *  Represent a record from Form_subscription
 */
@Service
public class SubscriptionService {

    @Autowired
    protected SubscriptionDao subscriptionDao;

    @Autowired
    protected PasswordEncoder passwordEncoder;

    public SubscriptionService() {}

    public Form_subscription save(Form_subscription formData) {
        formData.setPassword(passwordEncoder.encode(formData.getPassword()));
        formData.setConfirmPassword(formData.getConfirmPassword());
        return subscriptionDao.save(formData);
    }
}