/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.laba2;

/**
 *
 * @author Root
 */

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Work {
  
    public void Run(){
        try {
            ObjectMapper mapper = new ObjectMapper();     
            
            User user = new User(); 
            user.setName("Іванов");
            user.setLogin("ivanov");
            user.setPassw("12345");
            user.setIsActive(true);
            List roles = new ArrayList(); 
            roles.add("admin");
            roles.add("moderator");
            user.setRoles(roles); 
            
            String jsonInString = mapper.writeValueAsString(user); 
            System.out.println(jsonInString); 
            
            mapper.writeValue(new File("user.json"), user);
            
            
            User parseUser = mapper.readValue(jsonInString, User.class); r
            System.out.printf("user %s, login %s, pass %s, isActive %s, ", parseUser.getName(),parseUser.getLogin(), parseUser.getPassw(), parseUser.isActive);
            Iterator it = parseUser.getRoles().iterator(); 
            System.out.print(" roles: ");
            while (it.hasNext()){ 
                String role = (String) it.next(); 
                
                System.out.printf("%s ",role);
            }
            System.out.println();
            
            
            
            parseUser = mapper.readValue(new File("user.json"),User.class);
            
            System.out.printf("user %s, login %s, pass %s, isActive %s, ", parseUser.getName(),parseUser.getLogin(), parseUser.getPassw(), parseUser.isActive);
            it = parseUser.getRoles().iterator(); 
            System.out.print(" roles: ");
            while (it.hasNext()){ 
                String role = (String) it.next(); 
                
                System.out.printf("%s ",role);
            }
            System.out.println();
            
            
            
        } catch (JsonProcessingException ex) {
            Logger.getLogger(Work.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Work.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
    }
    
}
