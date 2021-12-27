package br.com.rafaelporreca.doacaobackend.servicies;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public String authenticated(){
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        return userName;
    }
}
