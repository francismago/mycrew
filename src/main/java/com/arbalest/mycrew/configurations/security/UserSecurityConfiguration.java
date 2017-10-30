//package com.arbalest.mycrew.configurations.security;
//
//import com.arbalest.mycrew.enums.UserType;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
///**
// * Created by francis on 10/17/17.
// */
//@Configuration
//@EnableWebSecurity
//public class UserSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private LoginAuthenticationProvider loginAuthenticationProvider;
//
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        System.out.println("configure(AuthenticationManagerBuilder auth)");
//            auth.authenticationProvider(loginAuthenticationProvider);
//
//
////            auth
////                .jdbcAuthentication()
////                .usersByUsernameQuery()
////                .authoritiesByUsernameQuery(rolesQuery)
////                .dataSource(dataSource)
////                .passwordEncoder(bCryptPasswordEncoder);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        System.out.println("configure(HttpSecurity)");
//        //common pages and no need authentication
//        http.authorizeRequests().antMatchers("/**","/register/**").permitAll();
//
//
//        //need authentication
////        http.authorizeRequests()
////                .antMatchers("/club/**").hasRole(UserType.CLUB.toString())
////                .and()
////                .formLogin()
////                    .loginPage("/login")
////                    .failureUrl("/login?error=true")
////                .and()
////                .logout()
////                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
////                    .logoutSuccessUrl("/")
////                .and().exceptionHandling()
////                    .accessDeniedPage("/access-denied");
////
////                ;
//
////        http.authorizeRequests()
//////                .antMatchers("/").permitAll()
////                .antMatchers("/login").permitAll()
////                .antMatchers("/registration").permitAll()
////                .antMatchers("/admin/**").hasAuthority("ADMIN").anyRequest()
////                .authenticated()
////                .and().csrf().disable().formLogin()
////                .loginPage("/login").failureUrl("/login?error=true")
////                .defaultSuccessUrl("/admin/home")
////                .usernameParameter("username")
////                .passwordParameter("password")
////                .and()
////                .logout()
////                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
////                    .logoutSuccessUrl("/").and().exceptionHandling()
////                    .accessDeniedPage("/access-denied");
//    }
//
////    @Override
////    public void configure(WebSecurity web) throws Exception {
////       web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**" );
////
////    }
//}
