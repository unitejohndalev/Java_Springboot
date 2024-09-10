

package com.javaspringboot.springboot.Model ;


import java.util.Collection ;
import java.util.List ;

import org.springframework.security.core.GrantedAuthority ;
import org.springframework.security.core.authority.SimpleGrantedAuthority ;
import org.springframework.security.core.userdetails.UserDetails ;

import com.javaspringboot.springboot.Enum.Role ;

import jakarta.persistence.Column ;
import jakarta.persistence.Entity ;
import jakarta.persistence.EnumType ;
import jakarta.persistence.Enumerated ;
import jakarta.persistence.GeneratedValue ;
import jakarta.persistence.GenerationType ;
import jakarta.persistence.Id ;
import jakarta.persistence.JoinColumn ;
import jakarta.persistence.ManyToOne ;
import jakarta.persistence.Table ;
import lombok.Builder ;
import lombok.Data ;
import lombok.Getter ;
import lombok.NoArgsConstructor ;
import lombok.Setter ;


@Data
@Builder
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table( name = "employees" )
public class UserModel implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column( name = "employee_id" )
    private Integer id ;

    @Column( name = "username" )
    private String username ;

    @Column( name = "first_name" )
    private String firstname ;

    @Column( name = "last_name" )
    private String lastname ;

    @Column( name = "email" )
    private String email ;

    @Column( name = "password" )
    private String password ;

    @Enumerated( EnumType.STRING )
    private Role role ;

    
    @ManyToOne
    @JoinColumn( name = "department_id", nullable = true
    )
    private CompanyDepartmentModel companydepartment ;

    @ManyToOne
    @JoinColumn( name = "position_id", nullable = true )
    private EmployeePositionModel employeeposition ;

    public UserModel( Integer id, String username, String
    firstname, String lastname, String email, String
    password, Role role, CompanyDepartmentModel
    companydepartment, EmployeePositionModel
    employeeposition ) {

    this.id = id ;
    this.username = username ;
    this.firstname = firstname ;
    this.lastname = lastname ;
    this.email = email ;
    this.password = password ;
    this.role = role ;
    this.companydepartment = companydepartment ;
    this.employeeposition = employeeposition ;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return List.of( new SimpleGrantedAuthority( role.name() ) ) ;
    }


    @Override
    public String getUsername() {

        return username ;
    }


    @Override
    public boolean isAccountNonExpired() {

        return true ;
    }


    @Override
    public boolean isAccountNonLocked() {

        return true ;
    }


    @Override
    public boolean isCredentialsNonExpired() {

        return true ;
    }


    @Override
    public boolean isEnabled() {

        return true ;
    }

    
}
