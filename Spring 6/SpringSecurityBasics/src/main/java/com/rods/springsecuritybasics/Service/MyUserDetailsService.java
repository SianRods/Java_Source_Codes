package com.rods.springsecuritybasics.Service;


import com.rods.springsecuritybasics.model.User;
import com.rods.springsecuritybasics.model.UserPrincipal;
import com.rods.springsecuritybasics.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);

        if (user == null) {
            System.out.println("User is not in the database :(");
            throw new UsernameNotFoundException("User 404");
        }

        return new UserPrincipal(user);
    }
}
