package com.javaspringboot.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository ;
import org.springframework.stereotype.Repository ;
import com.javaspringboot.springboot.Model.EmployeePositionModel ;

@Repository
public interface EmployeePositionRepository extends JpaRepository<EmployeePositionModel, Integer> {

    
} 