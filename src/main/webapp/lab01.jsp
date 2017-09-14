<%-- 
    Document   : lab01
    Created on : Sep 12, 2017, 8:09:46 PM
    Author     : cssco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 01</title>
        <link rel="stylesheet" href="css/foundation.min.css">
        <link rel="stylesheet" href="css/app.css">
    </head>
    <body>
        
        <div id="rectangleCalculatorWrapper" class="row">
            <div class="grid-container">
                
                <!-- Header -->
                <div class="large-12 cell">
                    <h1>Lab 01</h1>
                </div>
                
                <!-- Rectangle form contents wrapper -->
                <div class="grid-x grid-padding-x">
                    
                    <!-- rectangle form wrapper -->
                    <div class="small-8 cell">
                        <form name="rectangleAreaCalculator" 
                              id="rectangleAreaCalculator" 
                              method="post" 
                              action="AreaCalculator">

                            <div class="row">
                                <div class="small-12 columns">
                                    <label>Length
                                        <input type="text" placeholder="example: 5.0" name="length" />
                                    </label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="small-12 columns">
                                    <label>Width
                                        <input type="text" placeholder="example: 3.21" name="width" />
                                    </label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="small-12 columns">
                                    <button type="submit" name="submit" class="button">Calculate Area</button>
                                </div>
                            </div>

                        </form>
                    </div><!-- !rectangle form wrapper -->
                
                    <!-- Calculated answer wrapper -->
                    <div class="small-4 cell">
                        <div class="callout">
                            <p>Area of your rectangle: ${area}</p>
                            <div class="th">
                                <img src="https://bconline.broward.edu/shared/collegereadiness/math/u01_l10_calcarea/mat%204%2010.jpg">
                            </div>
                        </div>
                    </div><!-- Calculated answer wrapper -->
                </div><!-- !Rectangle form contents wrapper -->
                
            </div>
        </div><!-- #rectangleCalculatorWrapper -->

    
    </body>
</html>
