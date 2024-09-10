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


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table( name = "employee_position" )
public class EmployeePositionModel implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id")
    private Integer id;

    @Column( name = "position" )
    private String position;
    private String description;

    public EmployeePositionModel(Integer id, String position, String description) {
        this.id = id;
        this.position = position;
        this.description = description;
    }

}
