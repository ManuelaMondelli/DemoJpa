/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.service;

import com.acn.manu.dao.DaoAllEmployees;
import com.acn.manu.dto.DtoPersonal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author manuela.mondelli
 */
public class AllEmployeesService {
    
    private DaoAllEmployees daoEmployees=new DaoAllEmployees();;
    private List<DtoPersonal> listPersonal;
    
    public List<DtoPersonal> listAllEmployees(EntityManager em){
//    public List<DtoPersonal> listAllEmployees(String name, String surname, String department, String city, String state, String country, String region, EntityManager em){
//        listPersonal=daoEmployees.printAll(name, surname, department, city, state, country, region, em);
        listPersonal=daoEmployees.printAll(em);
        return listPersonal;
    }
    
}
