/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.dto;

/**
 *
 * @author manuela.mondelli
 */
public class DtoDepartment {

    private String department_name;
    private String city;
    private String state_province;
    private String country_name;
    private String region_name;

    public DtoDepartment() {

    }

    public DtoDepartment(String department_name, String city, String state_province, String country_name, String region_name) {
        this.department_name = department_name;
        this.city = city;
        this.state_province = state_province;
        this.country_name = country_name;
        this.region_name = region_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

}
