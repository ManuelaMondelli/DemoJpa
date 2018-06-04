
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.controller;

import com.acn.manu.dto.DtoPersonal;
import com.acn.manu.service.AllEmployeesService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manuela.mondelli
 */
@WebServlet("/allEmployees")
public class AllEmployeesController extends HttpServlet {

    @PersistenceContext(unitName = "DemoJpa")
    private EntityManager em;

    private AllEmployeesService employeesService;
    private List<DtoPersonal> listPersonal;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
 
        String name = request.getParameter("first_name");
        System.out.println("name " + name);
        
        String surname = request.getParameter("last_name");
        System.out.println("surname " + surname);
        
        String department = request.getParameter("department_name");
        System.out.println("department " + department);

        String city = request.getParameter("city");
        System.out.println("city " + city);

        String state = request.getParameter("state_province");
        System.out.println("state " + state);
        
        String country = request.getParameter("country_name");
        System.out.println("country " + country);

        String region = request.getParameter("region_name");
        System.out.println("region " + region);

        employeesService = new AllEmployeesService();
        listPersonal = employeesService.listAllEmployees(em);

        RequestDispatcher rd = request.getRequestDispatcher("jsp/listEmployees.jsp");   
        request.getSession().setAttribute("listPersonal", listPersonal);
        request.getSession().setAttribute("name", name);
        request.getSession().setAttribute("surname", surname);
        request.getSession().setAttribute("department", department);
        request.getSession().setAttribute("city", city);
        request.getSession().setAttribute("state", state);
        request.getSession().setAttribute("country", country);
        request.getSession().setAttribute("region", region);
        rd.forward(request, response);

        for (DtoPersonal dtoPersonal : listPersonal) {
            if(name == null){
                 System.out.println("");
            } else {
            System.out.println("First name: " + dtoPersonal.getFirst_name());
            }
            
            if(surname==null){
                 System.out.println("");
            } else {
            System.out.println("Last name: " + dtoPersonal.getLast_name());
            }
            
            if(department==null){
                System.out.println("");
            } else {
            System.out.println("Department_name: " + dtoPersonal.getDepartment_name());
            } 
            
            if(city==null){
                 System.out.println("");
            } else {
            System.out.println("City: " + dtoPersonal.getCity());
            }
            
            if(state==null){
                 System.out.println("");
            } else {
            System.out.println("State province: " + dtoPersonal.getState_province());
            }
            
            if(country==null){
                 System.out.println("");
            } else {
            System.out.println("Country name: " + dtoPersonal.getCountry_name());
            }
            
            if(region==null){
                 System.out.println("");
            } else {
            System.out.println("Region name: " + dtoPersonal.getRegion_name());
            }

        }
    }


// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}