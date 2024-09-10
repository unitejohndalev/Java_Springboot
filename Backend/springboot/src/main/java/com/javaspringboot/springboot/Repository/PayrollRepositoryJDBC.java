package com.javaspringboot.springboot.Repository;


import java.sql.Date ;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.jdbc.core.JdbcTemplate ;
import org.springframework.stereotype.Repository ;



@Repository
public class PayrollRepositoryJDBC {

    @Autowired
    private JdbcTemplate jdbcTemplate ;

    public void addPayroll(
        Integer employeeId,
        Integer salaryId,
        Date payPeriod ) {

        String sql = "INSERT INTO employees_payroll (employee_id, salary_id, pay_period) VALUES (?, ?, ?)" ;
        jdbcTemplate.update( sql, employeeId, salaryId, payPeriod) ;
    }
}
