package com.javaspringboot.springboot.Service;


import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.stereotype.Service ;

import com.javaspringboot.springboot.DTO.UserPayrollDTO ;
import com.javaspringboot.springboot.Repository.UserPayrollRepository ;

import java.util.List ;


@Service
public class UserPayrollService {

    @Autowired
    private UserPayrollRepository userPayrollRepository ;

    //get service
    public List<UserPayrollDTO> getUserPayrolls() {

        return userPayrollRepository.findUserPayrolls() ;
    }
    
}
