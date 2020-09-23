package fr.lyasen.climbing.service.forms;

import fr.lyasen.climbing.model.forms.Form_subscription;
import fr.lyasen.climbing.model.forms.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("customUserDetailsService")
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private SubscriptionService subscriptions;


    @Override
    public UserDetails loadUserByUsername(String pseudo) throws UsernameNotFoundException {
        if (pseudo.trim().isEmpty()) {
            throw new UsernameNotFoundException("pseudo is empty");
        }

        Form_subscription formSubscription = subscriptions.findByUsernameOrEmail(pseudo);

        if (formSubscription == null) {
            throw new UsernameNotFoundException("L'utilisateur " + pseudo + " n'est pas répertorié");
        }
        return new org.springframework.security.core.userdetails.User(
                formSubscription.getPseudo(),
                formSubscription.getPassword(),
                getGrantedAuthorities(formSubscription));
    }

    private List<GrantedAuthority> getGrantedAuthorities(Form_subscription formSubscription) {
        List<GrantedAuthority> authorities = new ArrayList<>();
//        Role role = formSubscription.getRole(); // TODO : Define roles (String? Entity? Default Role for a new user?)
//        authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        return authorities;
    }
}
