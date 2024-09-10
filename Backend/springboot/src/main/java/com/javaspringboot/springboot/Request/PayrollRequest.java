package com.javaspringboot.springboot.Request;


import lombok.AllArgsConstructor ;
import lombok.Data ;
import lombok.NoArgsConstructor ;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayrollRequest {

    private Integer userId ; // ID of the employee

    private Integer salaryId ; // ID of the salary

    private String payPeriod ; // Pay period, e.g.,
                               // "2024-09-15"
}
