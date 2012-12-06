public class Area
{
     final static double PI = 3.14159;
     public static void main(String args[])
     {
          
          
          
          /*
          final double PI = 3.14159;
          
          double circleArea = 0;
          double circleRadius = 4;
          
          double squareArea = 0;
          double squareSide = 2;
          
          double rectangleArea = 0;
          double rectangleSide1 = 8;
          double rectangleSide2 = 6;
          
          // Calculate the area of a circle
          
          circleArea = PI * circleRadius * circleRadius;
          
          
          circleRadius = 3;
          
          circleArea = PI * circleRadius * circleRadius;
          System.out.println("Circle area: " + circleArea);
          circleArea = 0;
          
          circleArea = areaOfCircle(circleRadius);
          System.out.println("Circle area: " + circleArea);
          // Calculate the area of a square
          
          squareArea = squareSide * squareSide;
          System.out.println("Square area: " + squareArea);
          
          squareArea = 0;
          
          squareArea = areaOfSquare(squareSide);
          System.out.println("Square area: " + squareArea);
          
          // Calculate the area of a rectangle
          
          // rectangleArea = ....?
          printArea("Circle area: ", circleArea);
          System.out.println("Circle area: " + circleArea);
          System.out.println("Square area: " + squareArea);
          System.out.println("Rectangle area: " + rectangleArea);
          
          */
     }
     
     // Methods
     
     static double areaOfCircle(double radiusOfCircle)
     {
          double circleArea = 0;
          
          circleArea = PI * radiusOfCircle * radiusOfCircle;
          
          return circleArea;
     }
     
     static double areaOfSquare(double sideOfSquare)
     {
          double squareArea = 0;
          
          squareArea = sideOfSquare * sideOfSquare;
          
          return squareArea;
     }
     
     static void printArea(double anyArea, String areaString)
     {
          // System.out.println("Circle area: " + circleArea);
          System.out.println(areaString + anyArea);
     }
}