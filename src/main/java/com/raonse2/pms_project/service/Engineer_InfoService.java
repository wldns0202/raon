package com.raonse2.pms_project.service;

import com.raonse2.pms_project.dto.engineer_info.Engineer_InfoResponseDto;
import com.raonse2.pms_project.dto.engineer_info.Engineer_InfoSaveRequestDto;
import com.raonse2.pms_project.dto.engineer_info.Engineer_InfoUpdateRequestDto;
import com.raonse2.pms_project.model.Engineer_Info;
import com.raonse2.pms_project.repository.Engineer_InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class Engineer_InfoService {
    private final Engineer_InfoRepository engineer_InfoRepository;


    @Transactional(readOnly = true)
    public Engineer_InfoResponseDto findByEmpno(int empno) {
        Engineer_Info entity = engineer_InfoRepository.findByEmpno(empno).orElseThrow(()-> new IllegalArgumentException("해당 사용자는 존재하지 않습니다.. empno= "+empno));

        return new Engineer_InfoResponseDto(entity);
    }

    @Transactional
    public void delete(int empno){
        Engineer_Info entity = engineer_InfoRepository.findByEmpno(empno).orElseThrow(()-> new IllegalArgumentException("해당 사용자는 존재하지 않습니다.. empno= "+empno));
        engineer_InfoRepository.delete(entity);
    }

    @Transactional
    public void save(Engineer_InfoSaveRequestDto requestDto){
        engineer_InfoRepository.save(requestDto.toEntity());
    }

    @Transactional
    public void update(int empno, Engineer_InfoUpdateRequestDto requestDto){
        Engineer_Info engineer_info = engineer_InfoRepository.findByEmpno(empno).orElseThrow(()-> new IllegalArgumentException("해당 사용자는 존재하지 않습니다.. empno= "+empno));
        engineer_info.update(requestDto.getEmp_name(), requestDto.getMail_address(), requestDto.getUpdate_emp_no());
    }

}
