package com.dylan.notes.service;

import com.dylan.notes.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public void addUser(User user);

    public Optional<User> getUserById(Long id);

    public List<User> getAllUsers();

    public void deleteUserById(Long id);

    public User updateUser(Long id, User user);
}
