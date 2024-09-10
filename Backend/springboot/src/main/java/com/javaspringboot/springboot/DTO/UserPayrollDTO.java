
package com.javaspringboot.springboot.DTO ;


import java.util.Date ;

import lombok.Getter ;
import lombok.NoArgsConstructor ;
import lombok.Setter ;


@Getter
@Setter
@NoArgsConstructor
public class UserPayrollDTO {


    private Integer employee_id ;

    private String first_name ;

    private String last_name ;

    private Double salary ; // Changed from Integer
                            // salary_id to Double salary

    private Date pay_period ;

   


}
