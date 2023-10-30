package com.dylan.notes.service;

import com.dylan.notes.model.User;
import com.dylan.notes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private  UserRepository userRepository;



    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(Long id, User user) {
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent()){
            User userToUpdate = optionalUser.get();
            userToUpdate.setUsername(user.getUsername());
            userToUpdate.setPassword(user.getPassword());
            return userRepository.save(userToUpdate);
        }
        return null;
    }
}
