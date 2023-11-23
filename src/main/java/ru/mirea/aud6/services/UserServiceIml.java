package ru.mirea.aud6.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirea.aud6.entites.User;
import ru.mirea.aud6.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceIml implements UserService{
    private final UserRepository userRepository;
    @Override
    public User getUser(int id) {
        return  userRepository.findById(id).orElse(null);
    }
}
