package com.javaspringboot.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.http.ResponseEntity ;
import org.springframework.web.bind.annotation.PostMapping ;
import org.springframework.web.bind.annotation.RequestBody ;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RestController ;

import com.javaspringboot.springboot.Model.EmployeePositionModel ;
import com.javaspringboot.springboot.Service.EmployeePositionService ;

@RestController
@RequestMapping( "/api/v1" )
public class CompanyPositionController {
    
    @Autowired
    private EmployeePositionService service ;

    @PostMapping( "/position" )
    public ResponseEntity<EmployeePositionModel> createSalary(
        @RequestBody
        EmployeePositionModel salary ) {

        EmployeePositionModel createdSalary = service.createSalary( salary ) ;
        return ResponseEntity.ok( createdSalary ) ;
    }
}
