package com.gka.dto;

//DTO: Data Transfer Object MiddleWare

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class EmployeeDto {

    private Long employeeId;
    private String employeeName;
    private String employeeSurname;
    private String emailId;
}
