/**
 * Write a description of class Island here.
 * Calculating the mesasurment of the Island 
 * @author (Dahwal Charles)
 * @version (1/30/2020)
 */
import java.util.Scanner;
public class Island
{
  public static void main(String args[])
  {
     Scanner scnr = new Scanner(System.in);
       int plantsForCircle;
       int plantsForMiddle;
        final int CUBIC_FEET_PER_SQUARE_YARD= 27;
        float X, Y, spacing, soilDepth;
        float middleArea, sidewalkArea, sidewalkWidth, Soilarea, plantAreas, soilMiddle;
        float overallLength;
        float overallWidth;
        float totalSoil;
        int totalPlantArea;
   
    System.out.println("Please enter X value here");
        X = scnr.nextInt();
    
    System.out.println("Please enter Y value here");
        Y = scnr.nextInt();
            
    System.out.println("Please enter Plant spacing Value here");
        spacing =(float) scnr.nextDouble();
    
    System.out.println("Please enter Depth of garden soil here");
        soilDepth =(float) scnr.nextDouble();
    
        double lgCircleRadius = X / 2;
        double smCircleRadius = Y / 2;    
        double lgCircleArea = Math.PI * (lgCircleRadius  * lgCircleRadius);
        double smCircleArea = Math.PI * Math.pow(smCircleRadius, 2);
    
    
    sidewalkWidth = (X - Y) / 2; // sidewalkWidth calculation
    
    overallLength = (X * 2); //Overall Length
    
    overallWidth = (X); 
    
    sidewalkArea = (float)(lgCircleArea - smCircleArea) * 2; 
    
    plantAreas =(int) smCircleArea / (spacing * spacing);
    
    middleArea = (int)(Math.pow ( X, 2 ) / Math.pow(spacing,2) ) - (int) (lgCircleArea / (spacing * spacing)) -1; 
    
    totalPlantArea = (int)(plantAreas * 2) + (int) middleArea;
    
    double SoilArea = ( smCircleArea * soilDepth ) / (double) CUBIC_FEET_PER_SQUARE_YARD;
        double SoilMiddle = (smCircleArea * Math.PI * spacing ) / (double) CUBIC_FEET_PER_SQUARE_YARD; // needs correct calculations
    
    totalSoil = (float) (SoilArea) * 2 + (float) (SoilMiddle);
    
    System.out.println("Specifications");
        System.out.println("Traffic island overall length: " + overallLength + " feet" ) ;
            System.out.println("Traffic island overall width: " + overallWidth + " feet") ;
               System.out.println("Sidewalk area: " + sidewalkArea + " feet"); 
                    System.out.println("Sidewalk width: " + sidewalkWidth + " feet") ;
    
    
    System.out.println("Garden materials needed: ");
        System.out.println("Plants for each circle garden: " + plantAreas);
            System.out.println("Plants for the middle garden: " + middleArea); 
                System.out.println("Total plants for garden: " + totalPlantArea);
                    System.out.println("Soil for each circle garden: " + SoilArea + " cubic yards"); 
                        System.out.println("Soil for the middle garden: " + SoilMiddle + " cubic yards"); 
                            System.out.println("Total soil for the garden: " + totalSoil +" cubic yards");
                        
                       
  }                     
}
