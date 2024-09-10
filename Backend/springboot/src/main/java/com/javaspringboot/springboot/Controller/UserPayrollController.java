

package com.javaspringboot.springboot.Controller ;



import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.http.ResponseEntity ;
import org.springframework.web.bind.annotation.GetMapping ;
import org.springframework.web.bind.annotation.PostMapping ;
import org.springframework.web.bind.annotation.RequestBody ;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RestController ;

import com.javaspringboot.springboot.DTO.PayrollRequestDTO ;
import com.javaspringboot.springboot.DTO.UserPayrollDTO ;
import com.javaspringboot.springboot.Service.PayrollService ;
import com.javaspringboot.springboot.Service.UserPayrollService ;
import lombok.RequiredArgsConstructor ;

import java.util.List ;


@RestController
@RequestMapping( "/api/v1" )
@RequiredArgsConstructor
public class UserPayrollController {

    @Autowired
    private UserPayrollService userPayrollService ;

    @Autowired
    private PayrollService payrollService ;


    //Get
    @GetMapping( "/userPayrolls" )
    public List<UserPayrollDTO> getUserPayrolls() {

        return userPayrollService.getUserPayrolls() ;
    }


    //Post
    @PostMapping( "/payroll" )
    public ResponseEntity<String> createPayroll(
        @RequestBody
        PayrollRequestDTO payrollRequestDTO ) {

        try {
            payrollService.createPayroll( payrollRequestDTO ) ; 
            return ResponseEntity.ok( "Payroll entry created successfully" ) ;
        }
        catch ( Exception e ) {
            e.printStackTrace() ; // Print stack trace for
                                  // debugging
            return ResponseEntity.status( 500 ).body( "Error creating payroll entry: " + e.getMessage() ) ;
        }
    }


}
