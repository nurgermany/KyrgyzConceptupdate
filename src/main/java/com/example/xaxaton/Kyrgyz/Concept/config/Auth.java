package com.example.xaxaton.Kyrgyz.Concept.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class Auth {

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("user")
//                .password("user")
//                .roles("USER")
//                .and()
//                .withUser("admin")
//                .password("admin")
//                .roles("ADMIN");
//    }
//    @Bean
//    protected PasswordEncoder getPasswordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/").hasRole("ADMIN");
//                .antMatchers("/api/developers/*").hasRole("ADMIN");
//        http.authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/KyrgyzConcept/*").permitAll()
//                .antMatchers(HttpMethod.POST, "/KyrgyzConcept/*").hasRole("ADMIN")
//                .antMatchers(HttpMethod.DELETE, "/KyrgyzConcept/*").hasRole("ADMIN")
//                .antMatchers(HttpMethod.PUT, "/KyrgyzConcept/*").hasRole("ADMIN")
//
//                .and().formLogin();
//        http
//                .authorizeRequests()
//                .antMatchers("/goToKyrgyzConceptPage").permitAll()
//                .antMatchers("/getKyrgyzConcept").permitAll()
//                .antMatchers("/", "/showNewEmployeeForm", "/getKyrgyzConcept", "/saveUpdatedEmployee", "/saveEmployee1", "/saveEmployee", "/showFormForUpdate/{id}", "/deleteEmployee/{id}", "/page/{pageNo}", "/search").hasAnyRole("USER", "ADMIN")
//                .antMatchers("/").hasRole("ADMIN");
//    }
}
