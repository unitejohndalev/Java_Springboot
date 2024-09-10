package com.javaspringboot.springboot.Request;


import lombok.AllArgsConstructor ;
import lombok.Builder ;
import lombok.Data ;
import lombok.NoArgsConstructor ;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String username ;

    private String firstname ;

    private String lastname ;

    private String email ;

    private String password ;

    private Integer departmentId ; 

    private Integer positionId ;
}