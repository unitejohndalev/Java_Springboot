package com.javaspringboot.springboot.Mapper;


import org.springframework.jdbc.core.RowMapper ;

import com.javaspringboot.springboot.DTO.UserPayrollDTO ;

import java.sql.ResultSet ;
import java.sql.SQLException ;


public class UserPayrollRowMapper implements RowMapper<UserPayrollDTO> {

    @Override
    public UserPayrollDTO mapRow(
        @SuppressWarnings( "null" )
            ResultSet rs,
        int rowNum ) throws SQLException {

        UserPayrollDTO userPayrollDTO = new UserPayrollDTO() ;
        userPayrollDTO.setEmployee_id( rs.getInt( "employee_id" ) ) ;
        userPayrollDTO.setFirst_name( rs.getString( "first_name" ) ) ;
        userPayrollDTO.setLast_name( rs.getString( "last_name" ) ) ;
        userPayrollDTO.setSalary( rs.getDouble( "salary" ) ) ; // Changed
                                                               // from
                                                               // getInt
                                                               // to
                                                               // getDouble
                                                               // for
                                                               // salary
        userPayrollDTO.setPay_period( rs.getDate( "pay_period" ) ) ;
        return userPayrollDTO ;
    }
}
