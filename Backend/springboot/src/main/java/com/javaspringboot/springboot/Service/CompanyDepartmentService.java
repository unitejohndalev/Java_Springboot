package com.javaspringboot.springboot.Service;

import com.javaspringboot.springboot.Model.CompanyDepartmentModel ;
import com.javaspringboot.springboot.Repository.CompanyDepartmentRepository ;
import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.stereotype.Service ;


@Service
public class CompanyDepartmentService {

    @Autowired
    private CompanyDepartmentRepository repository ;

    public CompanyDepartmentModel createDepartment(
        CompanyDepartmentModel department ) {

        return repository.save( department ) ;
    }
}
