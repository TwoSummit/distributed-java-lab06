/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twosummit.class06lab.controller;

import com.twosummit.class06lab.model.CircleAreaCalculator;
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
@WebServlet(name = "AreaCalculatorController", urlPatterns = {"/Area_Calculator"})
public class AreaCalculatorController extends HttpServlet {
    
    public static final String CALCULATE_RECTANGLE_AREA = "rectangle";
    public static final String CALCULATE_CIRCLE_AREA = "circle";
    
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
        
        String calculationType = getCalculationType(request);
        String error = "";
        String displayErrorLocation = "";
        String areaOfRectangle;
        String areaOfCircle;
        try {
            
            if( calculationType.equals( CALCULATE_RECTANGLE_AREA ) ){
                // set location + error message
                displayErrorLocation = "areaOfRectangleError";
                error = "Could not calculate side of rectangle";
                
                // retrieve form input from view
                String lengthEntered = request.getParameter("length") != null ? request.getParameter("length") : "";
                String widthEntered = request.getParameter("width") != null ? request.getParameter("width") : "";

                // process the input by delegating to the model object
                RectangleAreaCalculator rac = new RectangleAreaCalculator(lengthEntered, widthEntered);
                areaOfRectangle = rac.getArea();
                
                // store proccessed message in request object for transfer to view
                request.setAttribute("areaOfRectangle", areaOfRectangle);
            } else if( calculationType.equals( CALCULATE_CIRCLE_AREA )){
                // set location + error message
                displayErrorLocation = "areaOfCircleError";
                error = "Could not calculate side of circle";
                
                // retrieve form input from view
                String radiusEntered = request.getParameter("radius") != null ? request.getParameter("radius") : "";

                // process the input by delegating to the model object
                CircleAreaCalculator cac = new CircleAreaCalculator(radiusEntered);
                areaOfCircle = cac.getArea();
                
                // store proccessed message in request object for transfer to view
                request.setAttribute("areaOfCircle", areaOfCircle);
            } else {
                // set location + error message
                displayErrorLocation = "genericError";
                error = "Unsupported calculation type.";
            }

            
        } 
        catch( Exception e ) {
            request.setAttribute(displayErrorLocation, error);
        }
        
        // To send any data to the VIEW you must use this to forward the
        // request object, which contains the data, to the destination. The
        // destination can be a JSP or another Controller, but cannot be an html page.
        RequestDispatcher view = request.getRequestDispatcher("/lab03.jsp");
        view.forward(request, response);
        
        
    }
    
    private String getCalculationType(HttpServletRequest request){
        String calcType = "";
        if( request.getParameter("rectangleArea") != null ){
            calcType = CALCULATE_RECTANGLE_AREA;
        } else if ( request.getParameter("circleArea") != null ){
            calcType = CALCULATE_CIRCLE_AREA;
            
        }
        
        return calcType;
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
