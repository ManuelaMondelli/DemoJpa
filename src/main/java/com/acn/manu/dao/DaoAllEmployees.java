/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.dao;

import com.acn.manu.dto.DtoPersonal;
import com.acn.manu.model.Employees;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author manuela.mondelli
 */
public class DaoAllEmployees {

    private List<Employees> listemployees;
    private List<DtoPersonal> listPersonal;

//    public List<DtoPersonal> printAll(String name, String surname, String department, String city, String state, String country, String region, EntityManager em) {
    public List<DtoPersonal> printAll(EntityManager em) {

        listPersonal = new ArrayList<>();

        listemployees = em.createNamedQuery("Employees.findAll", Employees.class).getResultList();
        for (Employees listemployee : listemployees) {
            DtoPersonal dtop = new DtoPersonal();

//            if(name.equals("check")){
            dtop.setFirst_name(listemployee.getFirstName());
//            }

//            if(surname.equals("check")){
            dtop.setLast_name(listemployee.getLastName());
//            }

//            if(department.equals("check")){
            if (null != listemployee.getDepartmentId()) {
                if (null != listemployee.getDepartmentId().getDepartmentName()) {
                    dtop.setDepartment_name(listemployee.getDepartmentId().getDepartmentName());
                }
            
//            }
//            if(city.equals("check")){
                if (null != listemployee.getDepartmentId().getLocationId()) {
                    if (null != listemployee.getDepartmentId().getLocationId().getCity()) {
                        dtop.setCity(listemployee.getDepartmentId().getLocationId().getCity());
                    }
                }
//            }

//            if(state.equals("check")){
                if (null != listemployee.getDepartmentId().getLocationId()) {
                    if (null != listemployee.getDepartmentId().getLocationId().getStateProvince()) {
                        dtop.setState_province(listemployee.getDepartmentId().getLocationId().getStateProvince());
                    }
                }
//            }

//            if(country.equals("check")){
                if (null != listemployee.getDepartmentId().getLocationId().getCountryId()) {
                    if (null != listemployee.getDepartmentId().getLocationId().getCountryId().getCountryName()) {
                        dtop.setCountry_name(listemployee.getDepartmentId().getLocationId().getCountryId().getCountryName());
                    }
                }
//            }

//            if(region.equals("check")){
                if (null != listemployee.getDepartmentId().getLocationId().getCountryId().getRegionId()) {
                    if (null != listemployee.getDepartmentId().getLocationId().getCountryId().getRegionId().getRegionName()) {
                        dtop.setRegion_name(listemployee.getDepartmentId().getLocationId().getCountryId().getRegionId().getRegionName());
                   
                }
            }
                }
                
            listPersonal.add(dtop);
        }
        return listPersonal;
    }

}
