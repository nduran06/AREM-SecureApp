package edu.escuelaing.arem.secure.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import edu.escuelaing.arem.secure.configuration.filters.JWTAuthorizationFilter;

@EnableWebSecurity
@Configuration
public class SecureClientConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests().antMatchers("/login.html", "/css/**", "/fonts/**", "/images/**", "/js/**", "/vendor/**",
						 "/client/user").permitAll().anyRequest().authenticated().and().
				logout().permitAll().logoutSuccessUrl("/logout");
		
	}
	
	@Bean
    public DataSource dataSource(){
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("org.postgresql.Driver");
       dataSource.setUrl("jdbc:postgresql://database-1.cumj0ruf9sed.us-east-1.rds.amazonaws.com:5432/");
       dataSource.setUsername("postgres");
       dataSource.setPassword("password");
       return dataSource;
    }
	
}
