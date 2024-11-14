package com.auth.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    // private final UserRepository userRepository; // todo подумать, что тут. скорее всего ds-шники из db-модуля


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Логика загрузки пользователя из базы данных
        //return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return null;
    }
}

