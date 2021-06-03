package com.raonse2.pms_project.service;

import com.raonse2.pms_project.model.Project_viewTable;
import com.raonse2.pms_project.repository.Project_viewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class Project_viewService {
    private final Project_viewRepository project_viewRepository;


    @Transactional(readOnly = true)
    public List<Project_viewTable> findByAll() {

        List<Project_viewTable> list = project_viewRepository.findAll();

        return list;
    }

}
