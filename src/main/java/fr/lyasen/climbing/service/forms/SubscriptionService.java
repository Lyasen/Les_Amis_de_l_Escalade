package fr.lyasen.climbing.service.forms;

import fr.lyasen.climbing.dao.SubscriptionDao;
import fr.lyasen.climbing.model.forms.Form_subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *  Represent a record from Form_subscription
 */
@Service
public class SubscriptionService implements Validator {
    @Autowired
    protected SubscriptionDao subscriptionDao;

    @Autowired
    protected PasswordEncoder passwordEncoder;

    public SubscriptionService() {}

    public Form_subscription save(Form_subscription formData) {
        Form_subscription formModel = populateFormData (formData);
        return subscriptionDao.save(formModel);
    }

    private Form_subscription populateFormData(Form_subscription formData) {
        Form_subscription form = new Form_subscription();
        form.setLastName(form.getLastName());
        form.setFirstName(form.getFirstName());
        form.setPseudo(form.getPseudo());
        form.setEmail(form.getEmail());
        form.setClimberLevel(form.getClimberLevel());
        form.setPassword(passwordEncoder.encode(formData.getPassword()));
        form.setConfirmPassword(form.getConfirmPassword());
        return form;
    }

    /**
     * Different error messages if user made mistake(s) in the subscription's form
     * @param aClass : compare what is written in the form and the format available
     * @return Form_subscription : if all is right
     */
    @Override
    public boolean supports(Class<?> aClass) {
        return Form_subscription.class.equals(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //  Objects validated by the validator
        ValidationUtils.rejectIfEmptyOrWhitespace(
                errors, "lastName", "Format error", "Votre nom doit comporter au minimum 2 caractères");
        ValidationUtils.rejectIfEmptyOrWhitespace(
                errors, "firstName", "Format error", "Votre prénom doit comporter au minimum 2 caractères");
        ValidationUtils.rejectIfEmptyOrWhitespace(
                errors, "pseudo", "Format error", "Votre pseudo doit comporter au minimum 3 caractères");
        ValidationUtils.rejectIfEmptyOrWhitespace(
                errors,"email", "Format error","Votre email n'est pas valide");
        ValidationUtils.rejectIfEmpty(
                errors, "password", "Empty field", "Votre mot de passe doit comprendre au moins 8 caractères");
        ValidationUtils.rejectIfEmpty(
                errors, "confirmPassword", "Empty field", "Vous devez confirmer votre mot de passe");

        Form_subscription form = (Form_subscription) target;

        if (form.getLastName().isEmpty())
            errors.rejectValue("lastName", "lastName.notEmpty");
        else if (form.getLastName().matches("^([a-zA-Z]+[\\s'.]?)+\\S$"))
            errors.rejectValue("lastName", "lastName.validFormat");
        else if (form.getLastName().length() < 2 && form.getLastName().length() > 50)
            errors.rejectValue("lastName", "lastName.length");


        if (form.getFirstName().isEmpty())
            errors.rejectValue("firstName", "firstName.notEmpty");
        else if (form.getFirstName().matches("^([a-zA-Z]+[\\s'.]?)+\\S$"))
            errors.rejectValue("firstName", "firstName.validFormat");
        else if (form.getFirstName().length() < 2 && form.getLastName().length() > 50)
            errors.rejectValue("firstName", "firstName.length");

        if (form.getPseudo().isEmpty())
            errors.rejectValue("pseudo", "pseudo.notEmpty");
        else if (form.getPseudo().length() < 2 && form.getLastName().length() > 50)
            errors.rejectValue("pseudo", "pseudo.length");

        if (form.getEmail().isEmpty())
            errors.rejectValue("email", "email.notEmpty");
        else if (form.getEmail().matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?"))
            errors.rejectValue("email", "email.validFormat");

        if (form.getPassword().isEmpty())
            errors.rejectValue("password", "password.notEmpty");

        if (!form.getConfirmPassword().equals(form.getPassword()))
            errors.rejectValue("confirmPassword", "confirmPassword.notConfirm");

    }
}
