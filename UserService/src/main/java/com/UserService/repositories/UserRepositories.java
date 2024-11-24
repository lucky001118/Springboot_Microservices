package com.UserService.repositories;

import com.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User,String> {

    //custome implement methods
}
