package com.example.springbootsecurity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import static org.hibernate.loader.Loader.SELECT;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM  User u  WHERE u.email=?1" )
    User findByEmail(String email);

}
