package com.loginuser.loginuser;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan(basePackages = "com.loginuser.loginuser")
public class LoginuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginuserApplication.class, args);
	}
	

}
