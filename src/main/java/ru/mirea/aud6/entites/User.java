package ru.mirea.aud6.entites;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@jakarta.persistence.Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    private int id;
    private  String email;
    private String firstName;
    private String lastName;
    private String job;

}
