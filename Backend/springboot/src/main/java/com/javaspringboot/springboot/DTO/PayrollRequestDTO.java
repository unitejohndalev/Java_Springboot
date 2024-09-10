package com.javaspringboot.springboot.DTO;


import java.sql.Date ;

import lombok.Getter ;
import lombok.Setter ;


@Getter
@Setter
public class PayrollRequestDTO {

    private Integer employeeId ;

    private Integer salaryId ;

    private Date payPeriod ;
}
