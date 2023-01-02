package com.example.touchback.service;

import com.example.touchback.model.Participant;
import com.example.touchback.model.Role;
import com.example.touchback.model.User;
import com.example.touchback.repository.ParticipantRepository;
import com.example.touchback.repository.RoleRepository;
import com.example.touchback.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final ParticipantRepository participantRepository;



    public User saveUser(User user){
        log.info("saving user {} with username {}",user.getFullName(),user.getUsername());
        Optional<User> optionalUser = userRepository.findByUsername(user.getUsername());
        if (optionalUser.isPresent()){
            throw new RuntimeException("User already Exists");
        }
        return userRepository.save(user);
    }
    public Role saveRole(Role role){
        Optional<Role> optionalRole = roleRepository.findByName(role.getName());
        if (optionalRole.isPresent()){
            throw new RuntimeException("Role already Exists");
        }
        return roleRepository.save(role);
    }
    public void addRoleToUser(String username,String roleName){

        Optional<User> user = userRepository.findByUsername(username);
        Optional<Role> role = roleRepository.findByName(roleName);
        if (user.isPresent() && role.isPresent()){
            user.get().getRoles().add(role.get());
        }else{
            if(user.isEmpty()){
                throw new RuntimeException("User not found with that username!");
            }
            else {
                throw new RuntimeException("Role not found!");
            }
        }
    }

    public User getUser(String username){
        Optional<User> optionalUser = userRepository.findByUsername(username);
        if (optionalUser.isPresent()){
            return optionalUser.get();
        }
        throw new RuntimeException("User not found");
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void saveApplication(Participant participant) {
        Optional<User> optionalUser = userRepository.findByUsername(participant.getUser().getUsername());
        if (optionalUser.isPresent()){
            if(!optionalUser.get().isApplied()){
                participantRepository.save(participant);
            }
            throw new RuntimeException("Application already Submitted!");
        }
        throw new RuntimeException("User not found");
    }
}
