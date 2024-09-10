package com.javaspringboot.springboot.Service;



import org.springframework.security.authentication.AuthenticationManager ;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken ;
import org.springframework.security.crypto.password.PasswordEncoder ;
import org.springframework.stereotype.Service ;

import com.javaspringboot.springboot.Request.AuthenticationResponse ;
import com.javaspringboot.springboot.Request.RegisterRequest ;
import com.javaspringboot.springboot.Enum.Role ;
import com.javaspringboot.springboot.Model.CompanyDepartmentModel ;
import com.javaspringboot.springboot.Model.EmployeePositionModel ;
import com.javaspringboot.springboot.Model.UserModel ;
import com.javaspringboot.springboot.Repository.CompanyDepartmentRepository ;
import com.javaspringboot.springboot.Repository.EmployeePositionRepository ;
import com.javaspringboot.springboot.Repository.JwtUserRepository ;
import com.javaspringboot.springboot.Request.AuthenticationRequest ;

import lombok.RequiredArgsConstructor ;


@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final JwtUserRepository repository ;

    private final PasswordEncoder passwordEncoder ;

    private final JwtService jwtService ;

    private final AuthenticationManager authenticationManager ;

    private final CompanyDepartmentRepository departmentRepository ; // Add
                                                                     // this

    private final EmployeePositionRepository positionRepository ; // Add
                                                                  // this

    public AuthenticationResponse register(
        RegisterRequest request ) {

                    // Fetch department and position by ID
        CompanyDepartmentModel department = departmentRepository.findById(request.getDepartmentId())
            .orElseThrow(() -> new RuntimeException("Department not found"));
        EmployeePositionModel position = positionRepository.findById(request.getPositionId())
            .orElseThrow(() -> new RuntimeException("Position not found"));


        var user = UserModel
            .builder()
            .username( request.getUsername() )
            .firstname( request.getFirstname() )
            .lastname( request.getLastname() )
            .email( request.getEmail() )
            .password( passwordEncoder.encode( request.getPassword() ) )
            .role( Role.USER )
            .companydepartment( department )
            .employeeposition( position )
            .build() ;
        repository.save( user ) ;
        var jwtToken = jwtService.generateToken( user ) ;
        return AuthenticationResponse
            .builder()
            .token( jwtToken )
            .build() ;

    }


    public AuthenticationResponse authenticate(
        AuthenticationRequest request ) {

        authenticationManager
            .authenticate(
                new UsernamePasswordAuthenticationToken(
                    request.getUsername(),
                    request.getPassword()

                ) ) ;
        var user = repository
            .findByUsername( request.getUsername() )
            .orElseThrow() ;
        var jwtToken = jwtService.generateToken( user ) ;
        return AuthenticationResponse.builder().token( jwtToken ).build() ;
    }


}
