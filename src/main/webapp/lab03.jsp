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
        <title>Lab 03</title>
        <link rel="stylesheet" href="css/foundation.min.css">
        <link rel="stylesheet" href="css/app.css">
    </head>
    <body>
        <!-- Page Header -->
        <div id="rectangleCalculatorWrapper" class="row">
            <div class="grid-container">
                
                <!-- Header -->
                <div class="large-12 cell">
                    <h1>Lab 03</h1>
                </div><!-- !Header -->
                
            </div>
        </div><!-- !Page Header -->
        
        <!-- Rectangle Calculator Contents -->
        <div id="rectangleCalculatorWrapper" class="row">
            <div class="grid-container">
                
                <!-- Rectangle form contents wrapper -->
                <div class="grid-x grid-padding-x">
                    
                    <!-- rectangle form wrapper -->
                    <div class="small-8 cell">
                    
                        <h3>Area of Rectangle Calculator</h3>
                        <hr>
                    
                        <form name="rectangleAreaCalculator" 
                              id="rectangleAreaCalculator" 
                              method="post" 
                              action="Area_Calculator">

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
                                    <input type="hidden" name="rectangleArea" />
                                    <button type="submit" name="submit" class="button">Calculate Area</button>
                                </div>
                            </div>

                        </form>
                    </div><!-- !rectangle form wrapper -->
                
                    <!-- Calculated answer wrapper -->
                    <div class="small-4 cell">
                        <div class="callout">
                            <p>Area of your rectangle: ${areaOfRectangle}</p>
                            <img src="https://bconline.broward.edu/shared/collegereadiness/math/u01_l10_calcarea/mat%204%2010.jpg">
                            <p class="errorClr">${areaOfRectangleError}</p>
                        </div>
                    </div><!-- Calculated answer wrapper -->
                </div><!-- !Rectangle form contents wrapper -->
                
            </div>
        </div><!-- #rectangleCalculatorWrapper -->

        <hr>
        
        <!-- Circle Calculator Contents -->
        <div id="circleCalculatorWrapper" class="row">
            <div class="grid-container">
                
                <!-- Circle form contents wrapper -->
                <div class="grid-x grid-padding-x">
                    <!-- rectangle form wrapper -->
                    <div class="small-8 cell">
                        
                        <h3>Area of Circle Calculator</h3>
                        <hr>
                        
                        <form name="circleAreaCalculator" 
                              id="circleAreaCalculator" 
                              method="post" 
                              action="Area_Calculator">

                            <div class="row">
                                <div class="small-12 columns">
                                    <label>Radius
                                        <input type="text" placeholder="example: 7.12" name="radius" />
                                    </label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="small-12 columns">
                                    <input type="hidden" name="circleArea" />
                                    <button type="submit" name="submit" class="button">Calculate Area</button>
                                </div>
                            </div>

                        </form>
                    </div><!-- !rectangle form wrapper -->
                
                    <!-- Calculated answer wrapper -->
                    <div class="small-4 cell">
                        <div class="callout">
                            <p>Area of your circle: ${areaOfCircle}</p>
                            <img src="http://www.kidsmathgamesonline.com/images/pictures/math680/circlearea.jpg">
                            <p class="errorClr">${areaOfCircleError}</p>
                        </div>
                    </div><!-- Calculated answer wrapper -->
                </div><!-- Circle form contents wrapper -->
                
            </div>
        </div><!-- Circle Calculator Contents -->

        <hr>
        
        <!-- Third Side of Triangle Calculator Contents -->
        <div id="circleCalculatorWrapper" class="row">
            <div class="grid-container">
                
                <!-- Third Side of Triangle form contents wrapper -->
                <div class="grid-x grid-padding-x">
                    <!-- Third Side of Triangle form wrapper -->
                    <div class="small-8 cell">
                        
                        <h3>Third Side of Triangle Calculator</h3>
                        <hr>
                        
                        <form name="thirdSideOfTriangleCalculator" 
                              id="thirdSideOfTriangleCalculator" 
                              method="post" 
                              action="Side_Of_Shape">

                            <div class="row">
                                <div class="small-12 columns">
                                    <label>Known Side A:
                                        <input type="text" placeholder="example: 2" name="sideA" />
                                    </label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="small-12 columns">
                                    <label>Known Side B:
                                        <input type="text" placeholder="example: 2" name="sideB" />
                                    </label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="small-12 columns">
                                    <input type="hidden" name="triangleThirdSide" />
                                    <button type="submit" name="submit" class="button">Calculate Side</button>
                                </div>
                            </div>

                        </form>
                    </div><!-- Third Side of Triangle form wrapper -->
                
                    <!-- Calculated answer wrapper -->
                    <div class="small-4 cell">
                        <div class="callout">
                            <p>Third side of your triangle: ${sideOfTriangle}</p>
                            <img src="http://mathworld.wolfram.com/images/eps-gif/PythagoreanTheoremFigure_1000.gif">
                            <p class="errorClr">${thirdSideOfTriangleError}</p>
                        </div>
                    </div><!-- Calculated answer wrapper -->
                </div><!-- Circle form contents wrapper -->
                
            </div>
        </div><!-- Circle Calculator Contents -->
    
    </body>
</html>
