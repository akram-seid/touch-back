package com.example.touchback;

import com.example.touchback.model.Role;
import com.example.touchback.model.User;
import com.example.touchback.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TouchBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(TouchBackApplication.class, args);
    }

   /* @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role("ROLE_USER"));
            userService.saveRole(new Role("ROLE_MANAGER"));
            userService.saveRole(new Role("ROLE_ADMIN"));
            userService.saveRole(new Role("ROLE_SUPER_ADMIN"));

            userService.saveUser(new User("Akram Seid", "akiseid", "1234", new ArrayList<>(), true, false));
            userService.saveUser(new User("Will Smith", "will", "1234", new ArrayList<>(), true, false));
            userService.saveUser(new User("Jim Carry", "jim", "1234", new ArrayList<>(), true, false));
            userService.saveUser(new User("Arnold Schwarzenegger", "arnold", "1234", new ArrayList<>(), true, false));

            userService.addRoleToUser("akiseid", "ROLE_USER");
            userService.addRoleToUser("will", "ROLE_MANAGER");
            userService.addRoleToUser("jim", "ROLE_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_USER");
        };
    }*/
}
