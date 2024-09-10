package com.javaspringboot.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.stereotype.Service ;

import com.javaspringboot.springboot.Model.EmployeePositionModel ;
import com.javaspringboot.springboot.Repository.EmployeePositionRepository ;

@Service
public class EmployeePositionService {

    @Autowired
    private EmployeePositionRepository repository ;

    public EmployeePositionModel createSalary(
        EmployeePositionModel salary ) {

        return repository.save( salary ) ;
    }
    
}
