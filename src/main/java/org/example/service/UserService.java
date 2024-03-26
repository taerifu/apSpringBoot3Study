package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.domain.User;
import org.example.dto.AddUserRequest;
import org.example.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public Long save(AddUserRequest dto){
        return userRepository.save(
                User.builder()
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword())).build()
        ).getId();
    }


}
