package com.javaspringboot.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository ;
import org.springframework.stereotype.Repository ;

import com.javaspringboot.springboot.Model.SalaryModel ;

@Repository
public interface SalaryRepository extends JpaRepository<SalaryModel, Integer> {

}
