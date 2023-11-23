package ru.mirea.aud6.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirea.aud6.entites.User;


public interface UserService {
    User getUser(int id);
}
