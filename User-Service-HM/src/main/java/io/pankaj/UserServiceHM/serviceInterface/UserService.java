package io.pankaj.UserServiceHM.serviceInterface;

import io.pankaj.UserServiceHM.entity.User;
import io.pankaj.UserServiceHM.repository.UserRepository;
import io.pankaj.UserServiceHM.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceImpl {

    @Autowired private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        Optional<User> dbUser = userRepository.findById(user.getUid());
        if(dbUser.isPresent()) userRepository.save(user);
        return null;
    }
}
