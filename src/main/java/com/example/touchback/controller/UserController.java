package com.example.touchback.controller;

import com.example.touchback.model.Participant;
import com.example.touchback.model.Role;
import com.example.touchback.model.User;
import com.example.touchback.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class UserController {
    private final UserService userService;

    @PostMapping("/user/register")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }
    @PostMapping("/role/saveRole")
    public ResponseEntity<Role> saveRole(@RequestBody Role role){
        return new ResponseEntity<>(userService.saveRole(role), HttpStatus.CREATED);
    }
    @PostMapping("/role/addRole")
    public ResponseEntity<String> addRole(@RequestParam String username,@RequestParam String roleName){
        userService.addRoleToUser(username, roleName);
        return  ResponseEntity.ok("Role Successfully Added");
    }

    @GetMapping("/user/getUser")
    public ResponseEntity<User> getUser(@RequestParam String username){
        return new ResponseEntity<>(userService.getUser(username), HttpStatus.OK);
    }
    @GetMapping("/user/getUsers")
    public ResponseEntity<List<User>> getUsers(){
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }
    @PostMapping("/user/saveApplication")
    public ResponseEntity<String> saveApplication(@RequestBody Participant participant){
        userService.saveApplication(participant);
        return new ResponseEntity<>("Application Submitted Successfully!", HttpStatus.CREATED);
    }
}
