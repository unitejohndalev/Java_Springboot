package com.javaspringboot.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.javaspringboot.springboot.Model.UserModel;

import java.util.Optional;

@Repository
public interface JwtUserRepository extends JpaRepository<UserModel, Integer> {

    Optional<UserModel> findByUsername(String username);


}
