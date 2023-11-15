package com.cybersoft.demospingboot.repository;

import com.cybersoft.demospingboot.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity,Integer> {
    public List<UsersEntity> findByEmailAndPassword(String email, String pass);
}
