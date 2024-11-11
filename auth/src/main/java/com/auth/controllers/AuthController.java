package com.auth.controllers;

import com.auth.dtos.LoginRequest;
import com.auth.dtos.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        // Логика аутентификации через Keycloak (можно интегрироваться с API Keycloak)
        // Возвращаем токен или ответ с данными пользователя
        return null;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest registerRequest) {
        // Логика регистрации нового пользователя в Keycloak (создаем пользователя в Keycloak)
        return null;
    }
}

