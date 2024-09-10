package com.javaspringboot.springboot.Model;


import jakarta.persistence.Column ;
import jakarta.persistence.Entity ;
import jakarta.persistence.GeneratedValue ;
import jakarta.persistence.GenerationType ;
import jakarta.persistence.Id ;
import jakarta.persistence.Table ;
import lombok.Getter ;
import lombok.NoArgsConstructor ;
import lombok.Setter ;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table( name = "company_department" )
public class CompanyDepartmentModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )

    @Column( name = "department_id" )
    private Integer id;

    @Column( name = "department_name" )
    private String departmentName;

    @Column( name = "department_description" )
    private String departmentDescription;



    public CompanyDepartmentModel(Integer id, String departmentName, String departmentDescription) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentDescription = departmentDescription;
   
    }

}
