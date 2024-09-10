package com.javaspringboot.springboot.Model;

import java.io.Serializable ;

import jakarta.persistence.Column ;
import jakarta.persistence.Entity ;
import jakarta.persistence.GeneratedValue ;
import jakarta.persistence.GenerationType ;
import jakarta.persistence.Id ;
import jakarta.persistence.Table ;
import lombok.Getter ;
import lombok.NoArgsConstructor ;
import lombok.Setter ;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table( name = "position_salary" )
public class SalaryModel implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )

    @Column( name = "salary_id" )
    private Integer id ;

    private Float salary ;

}
