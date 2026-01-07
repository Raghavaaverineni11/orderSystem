package com.projects.orderSystem.Service;


import com.projects.orderSystem.Entity.Users;
import com.projects.orderSystem.Repository.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    private final UsersRepository usersRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UsersRepository usersRepository, PasswordEncoder passwordEncoder) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Users createUser(Users users) {
        String username = users.getUsername() == null ? null : users.getUsername().trim();

        if (username == null || username.isBlank()
                || users.getPassword() == null || users.getPassword().isBlank()) {
            throw new IllegalArgumentException("username and password are required");
        }

        if (usersRepository.existsByUsername(username)) {
            throw new IllegalArgumentException("username already exists");
        }

        // IMPORTANT: store encoded password
        users.setUsername(username);
        users.setPassword(passwordEncoder.encode(users.getPassword()));

        // Default role if missing
        if (users.getRole() == null || users.getRole().isBlank()) {
            users.setRole("ROLE_USER");
        } else if (!users.getRole().startsWith("ROLE_")) {
            users.setRole("ROLE_" + users.getRole().trim().toUpperCase());
        }

        return usersRepository.save(users);
    }

}
