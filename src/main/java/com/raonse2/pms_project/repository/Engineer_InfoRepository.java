package com.raonse2.pms_project.repository;

import com.raonse2.pms_project.model.Engineer_Info;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface Engineer_InfoRepository extends JpaRepository<Engineer_Info, Integer> {
    Optional<Engineer_Info> findByEmpno(int empno);
}

