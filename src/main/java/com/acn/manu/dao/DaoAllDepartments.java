/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.dao;

import com.acn.manu.dto.DtoDepartment;
import com.acn.manu.model.Departments;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author manuela.mondelli
 */
public class DaoAllDepartments {

    private List<DtoDepartment> listDept;
    private List<Departments> listDepartment;
    private DtoDepartment dtoDept;

    public List<DtoDepartment> printAllDept(EntityManager em) {
        listDept = new ArrayList<>();

        listDepartment = em.createNamedQuery("Departments.findAll", Departments.class).getResultList();
        for (Departments departments : listDepartment) {
            dtoDept = new DtoDepartment();
            dtoDept.setDepartment_name(departments.getDepartmentName());
            dtoDept.setCity(departments.getLocationId().getCity());
            dtoDept.setState_province(departments.getLocationId().getStateProvince());
            dtoDept.setCountry_name(departments.getLocationId().getCountryId().getCountryName());
            dtoDept.setRegion_name(departments.getLocationId().getCountryId().getRegionId().getRegionName());
            listDept.add(dtoDept);
        }

        for (DtoDepartment dept : listDept) {
            System.out.println("Department Name: " + dept.getDepartment_name());
            System.out.println("City: " + dept.getCity());
            System.out.println("State Province: " + dept.getState_province());
            System.out.println("Country Name: " + dept.getCountry_name());
            System.out.println("Region Name: " + dept.getRegion_name());

        }
       

        return listDept;
    }

}
