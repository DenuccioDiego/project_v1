package com.projectv1.project_v1.dao;

import org.springframework.stereotype.Repository;

import com.projectv1.project_v1.model.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
