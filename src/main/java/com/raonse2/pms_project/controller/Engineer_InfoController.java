package com.raonse2.pms_project.controller;

import com.raonse2.pms_project.dto.engineer_info.Engineer_InfoResponseDto;
import com.raonse2.pms_project.dto.engineer_info.Engineer_InfoSaveRequestDto;
import com.raonse2.pms_project.dto.engineer_info.Engineer_InfoUpdateRequestDto;
import com.raonse2.pms_project.service.Engineer_InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1.0/engineer-info")
public class Engineer_InfoController {

    @Autowired
    Engineer_InfoService engineer_infoService;
    /*
     *** REST API URL설계 RULES
     1. 마지막에 / 를 포함하지 않는다.
     2. _ 대신 - 를 사용한다.
     3. 소문자를 사용한다.
     4. 행위는 url에 포함하지 않는다. ex) delete, update 등등..
     */

    /**
     * @param empno
     * 엔지니어 정보를 사원코드로 조회한다.
     * @return Engineer_infoResponseDto
     * @author gdkim
     */
    @GetMapping("/1/{empno}")
    public Engineer_InfoResponseDto findByEmpno (@PathVariable("empno") int empno){
        return engineer_infoService.findByEmpno(empno);
    }

    /**
     * @param empno
     * 엔지니어 정보를 사원코드로 삭제한다.
     * @author gdkim
     */
    @DeleteMapping("/2/{empno}")
    public void delete(@PathVariable("empno") int empno){
        engineer_infoService.delete(empno);
    }

    /**
     * 엔지니어 정보를 저장한다.
     * @param requestDto
     * @author gdkim
     */
    @PostMapping("/3/engineer-info")
    public void save(@RequestBody Engineer_InfoSaveRequestDto requestDto){
        engineer_infoService.save(requestDto);
    }

    /**
     * 엔지니어 정보를 수정한다.
     * @param empno
     * @param requestDto
     * @author gdkim
     */

    @PutMapping("/4/{empno}")
    public void update(@PathVariable int empno, @RequestBody Engineer_InfoUpdateRequestDto requestDto){
        engineer_infoService.update(empno, requestDto);
    }


}
