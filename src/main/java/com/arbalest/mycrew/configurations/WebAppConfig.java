//package com.arbalest.mycrew.configurations;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.thymeleaf.spring4.SpringTemplateEngine;
//import org.thymeleaf.spring4.view.ThymeleafViewResolver;
//import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
//
///**
// * Created by francis on 10/18/17.
// */
//
//@Configuration
//public class WebAppConfig extends WebMvcConfigurerAdapter {
//
//    @Bean(name ="templateResolver")
//    public ServletContextTemplateResolver getTemplateResolver() {
//        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
//        templateResolver.setPrefix("/WEB-INF/html/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setTemplateMode("HTML5");
//        templateResolver.setOrder(0);
//        return templateResolver;
//    }
//    @Bean(name ="templateEngine")
//    public SpringTemplateEngine getTemplateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(getTemplateResolver());
//        return templateEngine;
//    }
//    @Bean(name="viewResolver")
//    public ThymeleafViewResolver getViewResolver(){
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(getTemplateEngine());
//        return viewResolver;
//    }
//
//
//    }
