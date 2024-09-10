

package com.javaspringboot.springboot ;


import org.springframework.boot.SpringApplication ;
import org.springframework.boot.autoconfigure.SpringBootApplication ;
import org.springframework.transaction.annotation.EnableTransactionManagement ;
import org.springframework.web.bind.annotation.GetMapping ;
import org.springframework.web.bind.annotation.RestController ;


@SpringBootApplication
@EnableTransactionManagement
@RestController
public class SpringbootApplication {

	@GetMapping( "/api/v1/auth/hello" ) 
		public String displayHello() {
			return "Hello from Spring Boot" ;
		}
	
	public static void main(
		String[] args ) {

		SpringApplication.run( SpringbootApplication.class, args ) ;
	}

}
