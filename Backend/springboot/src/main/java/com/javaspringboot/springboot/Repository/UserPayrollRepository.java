package com.javaspringboot.springboot.Repository;


import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.jdbc.core.JdbcTemplate ;
import org.springframework.stereotype.Repository ;

import com.javaspringboot.springboot.DTO.UserPayrollDTO ;
import com.javaspringboot.springboot.Mapper.UserPayrollRowMapper ;

import java.util.List ;


@Repository
public class UserPayrollRepository  {

    @Autowired
    private JdbcTemplate jdbcTemplate ;

    public List<UserPayrollDTO> findUserPayrolls() {

        String sql = "SELECT e.employee_id AS employee_id, e.first_name AS first_name, e.last_name AS last_name, "
            +
            "s.salary AS salary, p.pay_period AS pay_period "
            +
            "FROM employees e "
            +
            "JOIN employees_payroll p ON e.employee_id = p.employee_id "
            +
            "JOIN position_salary s ON p.salary_id = s.salary_id" ;

        return jdbcTemplate.query( sql, new UserPayrollRowMapper() ) ;
    }
    
}
