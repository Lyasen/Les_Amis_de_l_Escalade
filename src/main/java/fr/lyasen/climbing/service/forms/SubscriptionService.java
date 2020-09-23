package fr.lyasen.climbing.service.forms;

import fr.lyasen.climbing.model.forms.Form_subscription;

public interface SubscriptionService {
    Form_subscription findByUsernameOrEmail (String pseudoOrEmail);
}
