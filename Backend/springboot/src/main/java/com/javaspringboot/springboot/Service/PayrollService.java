package com.javaspringboot.springboot.Service;


import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.stereotype.Service ;
import com.javaspringboot.springboot.DTO.PayrollRequestDTO ;
import com.javaspringboot.springboot.Repository.PayrollRepositoryJDBC ;


@Service
public class PayrollService {

    @Autowired
    private PayrollRepositoryJDBC payrollRepositoryJDBC;

    // POST service for creating payroll using DTO
    public void createPayroll(PayrollRequestDTO payrollRequestDTO) {
        // Extract data from the DTO and pass it to the repository method
        payrollRepositoryJDBC.addPayroll(
            payrollRequestDTO.getEmployeeId(),
            payrollRequestDTO.getSalaryId(),
            payrollRequestDTO.getPayPeriod()
        );
    }

}
