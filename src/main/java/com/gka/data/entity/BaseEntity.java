package com.gka.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id yapısını otomatik artan hale getirir
    private Long id;

    @Column(name="created_by")
    @CreatedBy
    private String createdBy;

    @Column(name="created_date")
    @CreatedDate
    private Date createdDate;

    @Column(name="update_by")
    @LastModifiedBy
    private String updatedBy;

    @Column(name="update_date")
    @LastModifiedDate
    private Date update0Date;

    @Column(name="system_auto_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date date;
}
