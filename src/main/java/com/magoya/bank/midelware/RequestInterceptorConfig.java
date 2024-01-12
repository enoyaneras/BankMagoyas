package com.magoya.bank.midelware;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry; 
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer; 
  
@Configuration
public class RequestInterceptorConfig implements WebMvcConfigurer { 
     
      // Register an interceptor with the registry, Interceptor name : RequestInterceptor 
      @Override
    public void addInterceptors(InterceptorRegistry registry) { 
        registry.addInterceptor(new midelware()); 
    } 
    //* We can register any number of interceptors with our spring application context 
}