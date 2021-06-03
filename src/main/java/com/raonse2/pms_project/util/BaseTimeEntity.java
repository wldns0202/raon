package com.raonse2.pms_project.util;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
    @CreatedDate // 엔티티가 생성되어 저장될때 시간이 자동저장
    private LocalDateTime createDate;

    @LastModifiedDate // 조회한 엔티티의 값을 변경할때 시간이 자동저장
    private LocalDateTime modifiedDate;

}
