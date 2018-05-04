/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.service;

import com.acn.manu.dao.DaoLogin;
import com.acn.manu.dto.DtoLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

/**
 *
 * @author manuela.mondelli
 */
public class LoginService {
    
    private DaoLogin dao;

    public boolean login(DtoLogin dtoLogin, EntityManager em) {
            boolean result=false;
        try {
       
            dao = new DaoLogin();
            //chiamata al dao che eseguirà la query
            
            result = dao.verifyLogin(dtoLogin, em);
            
      
        } catch (SQLException ex) {
            Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
        }
            return result;
    }
    
}
