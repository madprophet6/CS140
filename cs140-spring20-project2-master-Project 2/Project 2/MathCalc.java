import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class MathCalc here.
 *
 * @author (Dahwal Charles)
 * @version (2/20/20)
 */
public class MathCalc
{
 public static void main(String args[]) 
 {
    Scanner scnr = new Scanner(System.in);
    double A,B,C,triArea, triCirc, triAng1, triAng2, triAng3;
    double x;
    double T = 0.5;
    System.out.println("Please enter the first side length of the triangle:");
    A=scnr.nextInt();
        System.out.println("Please enter the second side length of the triangle:");
        B = scnr.nextInt();
            System.out.println("Please enter the third side length of the third side of the triangle:");
            C = scnr.nextInt();
            
     //A = (1/4)na2 cot(π/n) = nr2 tan(π/n) 
     
    triArea = (A * B) * T; //Area of the triangle 
    triCirc = A + B + C; // Circumference of triangle
    System.out.println("Welcome to my awesome math helper program  ");
    System.out.println("------------------------------------------");
        System.out.println("The three side lengths of the triangle are " +  A +  B +  C );
            System.out.println("First Angle in degrees:  ");
                System.out.println("Second Angle in degrees:  ");
                    System.out.println("Third Angle in degrees:  ");
                        System.out.println("The area of the triangle:  " + triArea + " square units");
                            System.out.println("The circumference of the triangle:  " + triCirc);
                                System.out.println("--------------------------------");
    
    double penCirc, penArea, penSide, pen = 5;
    System.out.println("Pentagon (5 sided polygon) area and circumference");
    System.out.println("--------------------------------------------------");
        System.out.println("Enter the side length of the regular pentagon: ");
        penSide = scnr.nextInt();
        penCirc = penSide * pen; // input times the number of sides
        penArea = (pen * (penSide*penSide))/(4*Math.tan(Math.PI/pen));
            System.out.println("The side length of the regular pentagon: " + penSide );
                System.out.println("The circumference of the regular pentagon: " + penCirc);
                    System.out.println("The area of the regular pentagon (with side length 20.00): " + penArea + "square units");
                        System.out.println("----------------------------------------------------------");
                        
    double hexCirc, hexArea, hexSide , hex = 6, hexB,hexb,hexC;
    
    System.out.println("Hexagon (6 sided polygon) area and circumference");
        System.out.println("--------------------------------------------------");
            System.out.println("Enter the side length of the regular hexagon: ");
           hexSide =  scnr.nextInt();
            hexCirc = hexSide * hex; 
            hexB = hexSide / 2;
            hexb = Math.pow(hexB, 2);
            hexC = Math.pow(hexSide,2);
          double  hexsq = hexC - hexb; 
          double  hexA = Math.sqrt(hexsq);
        hexArea = T * hexA * hexCirc;
                System.out.println("The side length of the regular hexagon: " + hexSide);
                    System.out.println("The circumference of the regular hexagon: " + hexCirc);
                        System.out.println("The area of the regular hexagon (with side length 20.00): " + hexArea + " square units");
                            System.out.println("-------------------------------------------------------");
    
    double hepCirc, hepArea, hepSide, hep = 7;
    System.out.println("Heptagon (7 sided polygon) area and circumference");
        System.out.println("--------------------------------------------------");
            System.out.println("Enter the side length of the regular heptagon: ");
          hepSide = scnr.nextInt();
          hepCirc = hepSide * hep ; 
          hepArea = (hep * (hepSide*hepSide))/(4*Math.tan(Math.PI/hep));
                System.out.println("The side length of the regular Heptagon: " + hepSide);
                    System.out.println("The circumference of the regular Heptagon: " + hepCirc);
                        System.out.println("The area of the regular heptagon (with side length 20.00): " + hepArea + " square units");
                            System.out.println("-----------------------------------------------------------------");
                            
    double octCirc, octArea, octSide, oct = 8;
    System.out.println("Octagon (8 sided polygon) area and circumference");
        System.out.println("--------------------------------------------------");
            System.out.println("Enter the side length of the regular octagon: ");
          octSide = scnr.nextInt();
          octCirc = octSide * oct;
          octArea = 2 * Math.pow(octSide,2) * (1 + Math.sqrt(2));         //Area of Octagon : 2a^2(1+√2)
                System.out.println("The side length of the regular octagon: " + octSide);
                    System.out.println("The circumference of the regular octagon: " + octCirc);
                        System.out.println("The area of the regular octagon (with side length 20.00): " + octArea + " square units");
                            System.out.println("-----------------------------------------------------------------");
                            
    double nonCirc, nonArea, nonSide, non = 9;
    System.out.println("Nonagon (9 sided polygon) area and circumference");
        System.out.println("--------------------------------------------------");
            System.out.println("Enter the side length of the regular nonagon: ");
            nonSide =  scnr.nextInt();
            nonCirc = nonSide * non ;
            nonArea = (non * (nonSide*nonSide))/(4*Math.tan(Math.PI/non));
              System.out.println("The area of the polygon is: " );
                System.out.println("The side length of the regular nonagon: " + nonSide);
                    System.out.println("The circumference of the regular nonagon: " + nonCirc);
                        System.out.println("The area of the regular nonagon (with side length 20.00): " + nonArea + " square units");
                            System.out.println("-----------------------------------------------------------------");
                            
    double decCirc, decArea, decSide, dec = 10, decT = 2.5;
    System.out.println("Decagon (10 sided polygon) area and circumference");
        System.out.println("--------------------------------------------------");
            System.out.println("Enter the side length of the regular decagon:");
           decSide =  scnr.nextInt();
           decCirc = decSide * dec; 
           decArea = (dec * (decSide*decSide))/(4*Math.tan(Math.PI/dec));
                System.out.println("The side length of the regular decagon:" + decSide);
                    System.out.println("The circumference of the regular decagon:" + decCirc);
                        System.out.println("The area of the regular decagon (with side length 20.00): " + decArea + " square units");
                            System.out.println("-----------------------------------------------------------------");
                              
    }
}
