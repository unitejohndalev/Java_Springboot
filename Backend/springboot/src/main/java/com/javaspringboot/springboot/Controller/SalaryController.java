package com.javaspringboot.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.http.ResponseEntity ;
import org.springframework.web.bind.annotation.PostMapping ;
import org.springframework.web.bind.annotation.RequestBody ;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RestController ;

import com.javaspringboot.springboot.Model.SalaryModel ;
import com.javaspringboot.springboot.Service.SalaryService ;

@RestController
@RequestMapping( "/api/v1" )
public class SalaryController {
    @Autowired
    private SalaryService service ;

    @PostMapping( "/salary" )
    public ResponseEntity<SalaryModel> createSalary(
        @RequestBody
        SalaryModel salary ) {

        SalaryModel createdSalary = service.createSalary( salary ) ;
        return ResponseEntity.ok( createdSalary ) ;
    }
}
