//package com.sapient.loginservice;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@EnableWebSecurity
//@Configuration
//public class ApplicationSecurityConfiguration extends WebSecurityConfigurerAdapter{
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable()                    // 
//		.authorizeRequests()   //to tell how spring security would work
//		.antMatchers("/","/login","/login-service/*","/index","/css/*","/js/*").permitAll()  //allow all the site with /,/index and the css,js
//		.anyRequest().authenticated()  //apart from the others let all request require authentication 
//		.and()
//		.httpBasic(); //use http basic authentication window that pops up in chrome for login password
//		}
//
//	@Bean
//	@Override
//	//don't use this method as we should not use password as it is
//	public UserDetailsService userDetailsService() {
//		//here "UserDetails" is imported from security core
//		List<UserDetails> users = new ArrayList<UserDetails>(); 
//		users.add(User.withDefaultPasswordEncoder().username("sahil").password("sahil").roles("USER","ADMIN").build());
//		users.add(User.withDefaultPasswordEncoder().username("admin").password("admin1234").roles("USER").build());
//		return new InMemoryUserDetailsManager(users);
//		
//		
//	}
//
//
//}
