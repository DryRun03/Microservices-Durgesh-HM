package io.pankaj.UserServiceHM.repository;

import io.pankaj.UserServiceHM.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
