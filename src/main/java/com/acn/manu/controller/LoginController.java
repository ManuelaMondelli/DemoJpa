/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.controller;

import com.acn.manu.dto.DtoLogin;
import com.acn.manu.service.LoginService;
import java.io.IOException;
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
@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet {
    DtoLogin dto;
    LoginService service;
    boolean result;

    @PersistenceContext(unitName = "DemoJpa")
    private EntityManager em;
    
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
        //caricamento nelle variabili di username e password inseriti da input
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
        //Setting DTO field
        dto = new DtoLogin();
        dto.setUsername(name);
        dto.setPassword(pass);
        //controllo nullità lato server
        if ((name != null) && (pass != null)) {
            service = new LoginService();
            //chiamata al metodo del service
            result = service.login(dto, em);
            //se i campi non sono nulli ci sarà il reindirizzamento alla pagina welcome
            //in caso contrario si tornerà alla index per reinserire username e password
            if (result == true) {
                RequestDispatcher rd = request.getRequestDispatcher("jsp/welcome.jsp");
                rd.forward(request, response);
            } else {
                System.out.println("Username o password non validi");
                RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
                rd.include(request, response);
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
