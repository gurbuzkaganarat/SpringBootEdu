package com.gka.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Builder
@Log4j2

@Entity
@Table(name="employees")
public class EmployeeEntity extends BaseEntity implements Serializable {

    @Column(name="first_name")
    private String employeeName;
    @Column(name="last_name")
    private String employeeLastname;
    @Column(name="email_name")
    private String emailId;

    public EmployeeEntity(String employeeName, String employeeLastname, String emailId) {
        this.employeeName = employeeName;
        this.employeeLastname = employeeLastname;
        this.emailId = emailId;
    }
}
