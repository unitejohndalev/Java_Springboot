package com.javaspringboot.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.stereotype.Service ;

import com.javaspringboot.springboot.Model.SalaryModel ;
import com.javaspringboot.springboot.Repository.SalaryRepository ;

@Service
public class SalaryService {
    @Autowired
    private SalaryRepository repository ;

    public SalaryModel createSalary(
        SalaryModel salary ) {

        return repository.save( salary ) ;
    }
}
