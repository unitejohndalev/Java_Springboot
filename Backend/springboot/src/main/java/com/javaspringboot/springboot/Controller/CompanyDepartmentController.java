package com.javaspringboot.springboot.Controller;


import com.javaspringboot.springboot.Model.CompanyDepartmentModel;
import com.javaspringboot.springboot.Service.CompanyDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CompanyDepartmentController {

    @Autowired
    private CompanyDepartmentService service;

    @PostMapping( "/department" )
    public ResponseEntity<CompanyDepartmentModel> createDepartment(@RequestBody CompanyDepartmentModel department) {
        CompanyDepartmentModel createdDepartment = service.createDepartment(department);
        return ResponseEntity.ok(createdDepartment);
    }
}

