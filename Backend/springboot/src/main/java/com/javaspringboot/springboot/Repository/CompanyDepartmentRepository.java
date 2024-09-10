package com.javaspringboot.springboot.Repository;



import com.javaspringboot.springboot.Model.CompanyDepartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDepartmentRepository extends JpaRepository<CompanyDepartmentModel, Integer> {
}

