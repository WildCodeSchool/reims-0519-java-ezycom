package com.ezycom.projectEzycom.config;

import java.util.Collection;

import com.ezycom.projectEzycom.services.MyUserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/images/**", "/css/**")
                .permitAll()
                .antMatchers("/users/**")
                .authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/sales", true)
                .permitAll()
                .failureUrl("/loginError")
                .and()
            .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login")
                .permitAll();
            
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth)
    throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
         
    } 

    protected String determineTargetUrl(Authentication authentication) {
        boolean isManager = false;
        boolean isCommercial = false;
        boolean isAdmin = false;
        Collection<? extends GrantedAuthority> authorities
         = authentication.getAuthorities();
        for (GrantedAuthority grantedAuthority : authorities) {
            if (grantedAuthority.getAuthority().equals("Manager")) {
                isManager = true;
                break;
            } else if (grantedAuthority.getAuthority().equals("Commercial")) {
                isCommercial = true;
                break;
            }
            else if (grantedAuthority.getAuthority().equals("Admin")) {
                isAdmin = true;
                break;
            }
        }
 
        if (isManager) {
            return "/sales";
        } else if (isAdmin) {
            return "/sales";
        }
          else if (isCommercial) {
            return "/sales";
        } else {
            throw new IllegalStateException();
        }
    }
}
