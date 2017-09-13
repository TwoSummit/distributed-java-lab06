/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twosummit.class06lab.controller;

import com.twosummit.class06lab.model.RectangleAreaCalculator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cssco
 */
@WebServlet(name = "AreaCalculatorController", urlPatterns = {"/AreaCalculator"})
public class AreaCalculatorController extends HttpServlet {

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
        
        String area = "";
        try {
            // retrieve form input from view
            String lengthEntered = request.getParameter("length") != null ? request.getParameter("length") : "Not Available";
            String widthEntered = request.getParameter("width") != null ? request.getParameter("width") : "Not Available";
            
            // process the input by delegating to the model object
            //WelcomeService ws = new WelcomeService();
            RectangleAreaCalculator rac = new RectangleAreaCalculator(lengthEntered, widthEntered);
            //msg = ws.getMessage(nameEntered);
            area = rac.getArea();

            // store proccessed message in request object for transfer to view
            //request.setAttribute("welcomeMessage", msg);
            
        } catch( Exception e ) {
            //msg = e.getMessage();
            //request.setAttribute("msg", msg);
        }
        
        // To send any data to the VIEW you must use this to forward the
        // request object, which contains the data, to the destination. The
        // destination can be a JSP or another Controller, but cannot be an html page.
        RequestDispatcher view = request.getRequestDispatcher("/response.jsp");
        view.forward(request, response);
        
        
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
