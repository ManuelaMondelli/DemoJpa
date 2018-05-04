/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.dao;

import com.acn.manu.dto.DtoLogin;
import com.acn.manu.model.Login;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author manuela.mondelli
 */
public class DaoLogin {

    private static boolean result;

    /**
     *
     * @param dtoLogin
     * @return
     * @throws SQLException
     */
    public boolean verifyLogin(DtoLogin dtoLogin, EntityManager em) throws SQLException {

        Query query = em.createNamedQuery("Login.findUser", Login.class)
                .setParameter("username", dtoLogin.getUsername())
                .setParameter("pwd", dtoLogin.getPassword());
        List<DtoLogin> dtoLog = (List<DtoLogin>) query.getResultList();

        if ((!dtoLogin.getPassword().isEmpty()) && ((!dtoLogin.getUsername().isEmpty()))) {
            result = true;
        }

        return result;
    }
}
