package com.projectv1.project_v1.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.projectv1.project_v1.model.entities.User;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.repository.query.Param;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @EntityGraph(value = "user.company", type = EntityGraphType.FETCH)
    List<User> findAll();

    @EntityGraph(value = "user.company", type = EntityGraphType.FETCH)
    Optional<User> findById(Long id);

    @Query("select user from User where user.name = :name and user.password = :password")
    User findByNameAndPassword(@Param("name") String name, @Param("password") String password);
}
