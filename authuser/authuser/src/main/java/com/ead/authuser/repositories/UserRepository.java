package com.ead.authuser.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ead.authuser.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

    void save(String usermodel);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

}
