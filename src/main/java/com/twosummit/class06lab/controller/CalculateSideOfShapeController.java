/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twosummit.class06lab.controller;

import com.twosummit.class06lab.model.TriangleSideCalculator;
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
@WebServlet(name = "CalculateSideOfShape", urlPatterns = {"/Side_Of_Shape"})
public class CalculateSideOfShapeController extends HttpServlet {
    private final String SIDE_A = "sideA";
    private final String SIDE_B = "sideB";
    private final String CALCULATE_TRIANGLE_THIRD_SIDE = "calculateTriangleThirdSide";
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
        
        String calculatedSide;
        String error = null;
        String location = null;
        String calculationType = getCalculationType(request);
    
        try {
            if( calculationType.equals(CALCULATE_TRIANGLE_THIRD_SIDE) ){
                // set location + error message
                location = "triangleThirdSideError";
                error = "Could not calculate third side of triangle";

                // retrieve form input from view
                String sideAValue = request.getParameter( SIDE_A ) != null ? request.getParameter( SIDE_A ) : "";
                String sideBValue = request.getParameter( SIDE_B ) != null ? request.getParameter( SIDE_B ) : "";

                // process the input by delegating to the model object
                TriangleSideCalculator tsc = new TriangleSideCalculator(sideAValue, sideBValue);
                calculatedSide = tsc.getLastSide();

                // store proccessed message in request object for transfer to view
                request.setAttribute("sideOfTriangle", calculatedSide);
            }
        } 
        catch( Exception e ) {
            if( error == null ){
                error = "Error with triangle calculation.";
            }
            if( location == null ){
                location = "genericError";
            }
            request.setAttribute(location, error);
        }
        
        // To send any data to the VIEW you must use this to forward the
        // request object, which contains the data, to the destination. The
        // destination can be a JSP or another Controller, but cannot be an html page.
        RequestDispatcher view = request.getRequestDispatcher("/lab03.jsp");
        view.forward(request, response);
        
    }
    
    
    private String getCalculationType(HttpServletRequest request){
        String calcType = "";
        if( request.getParameter("calculateTriangleThirdSide") != null ){
            calcType = CALCULATE_TRIANGLE_THIRD_SIDE;
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
