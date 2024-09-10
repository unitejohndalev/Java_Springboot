

package com.javaspringboot.springboot.Model ;


import java.io.Serializable ;
import java.sql.Date ;

import jakarta.persistence.Column ;
import jakarta.persistence.Entity ;
import jakarta.persistence.GeneratedValue ;
import jakarta.persistence.GenerationType ;
import jakarta.persistence.Id ;
import jakarta.persistence.JoinColumn ;
import jakarta.persistence.ManyToOne ;
import jakarta.persistence.Table ;
import lombok.Getter ;
import lombok.NoArgsConstructor ;
import lombok.Setter ;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table( name = "employees_payroll" )
public class PayrollModel implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )

    @Column( name = "payroll_id" )
    private Integer id ;

    @ManyToOne
    @JoinColumn( name = "employee_id", nullable = false )
    private UserModel userId ; 

    @ManyToOne
    @JoinColumn( name = "salary_id", nullable = false )
    private SalaryModel salaryId ;


    @Column( name = "pay_period" )
    private Date payPeriod ;

   
    public PayrollModel(Integer id, UserModel userId, SalaryModel salaryId, Date payPeriod) {
        this.id = id;
        this.userId = userId;
        this.salaryId = salaryId;
        this.payPeriod = payPeriod;
    }
}
