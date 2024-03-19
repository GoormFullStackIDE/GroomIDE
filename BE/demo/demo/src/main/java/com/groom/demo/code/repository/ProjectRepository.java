package com.groom.demo.code.repository;

import com.groom.demo.code.entity.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    void deleteByContainerID(String containerId);
    List<Project> findByMembers_User(String username);
}
