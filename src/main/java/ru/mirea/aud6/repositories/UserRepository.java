package ru.mirea.aud6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.aud6.entites.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
