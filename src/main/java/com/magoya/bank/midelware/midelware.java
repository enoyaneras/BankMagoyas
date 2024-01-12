package com.magoya.bank.midelware;


import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

import org.springframework.web.servlet.HandlerInterceptor;
import com.magoya.bank.Controller.AccountController;





@Component
public class midelware implements HandlerInterceptor  {
	
	
	 private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	
     @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception { 
  
    	 
          
            
            String valor =request.getRequestURI();
           
            String isDeposito=Buscar(valor);
            
             if(isDeposito.equals("deposit")) {
            	
            	String numero=FindInt(valor);
            	
            	double deposito = Double.parseDouble(numero);
            	
            	if (deposito>10000) {
    	        	logger.info("An amount greater than 10000 must be deposited");
    	        }
    	        
            	}
            
                return true; 
    }
     
     
     static String FindInt(String str) {
    	    // First we replace all the non-numeric characters with space
    	    str = str.replaceAll("[^\\d]", " ");

    	    // Remove all the trailing spaces
    	    str = str.trim();

    	    // Replace consecutive white spaces with one white space
    	    str = str.replaceAll(" +", ".");

    	    if (str.equals(""))
    	      return "-1";

    	    return str;
    	  }
     
     
     static String Buscar(String str) { 
     String cadenaDondeBuscar = str;
     String loQueQuieroBuscar = "deposit";
     String[] palabras = loQueQuieroBuscar.split("\\s+");
     for (String palabra : palabras) {
         if (cadenaDondeBuscar.contains(palabra)) {
            str="deposit";
         }
     }
     
     return str;
     }
     
     
}
     
    
