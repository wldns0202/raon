package com.raonse2.pms_project.repository;

import com.raonse2.pms_project.model.Project_viewTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface Project_viewRepository extends JpaRepository<Project_viewTable, String> {
    List<Project_viewTable> findAll();
}

