package io.pankaj.UserServiceHM.service;

import io.pankaj.UserServiceHM.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserServiceImpl {

    public User saveUser(User user);

    public List<User> getAllUsers();
    public Optional<User> getUser(Long userId);

    public void deleteUser(Long id);

    public User updateUser(User user);
}
