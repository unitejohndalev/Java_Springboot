package com.javaspringboot.springboot.Repository;


import org.springframework.data.jpa.repository.JpaRepository ;
import org.springframework.stereotype.Repository ;

import com.javaspringboot.springboot.Model.PayrollModel ;



@Repository
public interface PayrollRepository extends JpaRepository<PayrollModel, Integer> {
}

