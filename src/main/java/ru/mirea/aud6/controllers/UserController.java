package ru.mirea.aud6.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.mirea.aud6.entites.User;
import ru.mirea.aud6.services.UserService;

import java.util.Map;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        User user = userService.getUser(id);

        if(user == null) {
            return "User is not exists";
        } else {
            return user.toString();
        }
    }
    @PostMapping
    public User getUserByJson(@RequestBody Map<String, Integer> json) {
        return userService.getUser(json.get("id"));
    }
    @GetMapping("/")
    public String getUser_V2(@RequestParam("id") int id) {
        User user = userService.getUser(id);

        if(user == null) {
            return "User is not exists";
        } else {
            return user.toString();
        }
    }

}
