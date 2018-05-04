/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.service;

import com.acn.manu.dao.DaoAllDepartments;
import com.acn.manu.dto.DtoDepartment;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author manuela.mondelli
 */
public class AllDepartmentsService {
    
    private DaoAllDepartments daoDept;
    private List<DtoDepartment> listDept;

    public List<DtoDepartment> allDept(EntityManager em) {
        daoDept = new DaoAllDepartments();
        listDept = daoDept.printAllDept(em);
        return listDept;
       }
    
}
