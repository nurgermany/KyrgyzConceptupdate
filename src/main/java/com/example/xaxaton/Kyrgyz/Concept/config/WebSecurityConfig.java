package com.example.xaxaton.Kyrgyz.Concept.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;
@Configuration
@EnableWebSecurity

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{


//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("test1")
                .password("test1")
                .authorities("ROLE_USER")
                .and()
                .withUser("test")
                .password("test")
                .authorities("ROLE_ADMIN");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/api/Ticket").permitAll()
                .antMatchers("/KyrgyzConcept/all").hasAnyRole("USER","ADMIN")
                .antMatchers("/KyrgyzConcept/update").hasRole("ADMIN")
                .and()
                .httpBasic();
    }
    @Bean
    public UserDetailsService users(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }
}