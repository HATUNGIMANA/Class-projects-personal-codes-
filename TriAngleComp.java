import java.util.Scanner;
import java.lang.Math;

public class TriAngleComp {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point, x and y respectively");
        double coordX1 = enter.nextFloat();
        double coordY1 = enter.nextFloat();

        System.out.println("Enter the coordinates of the second point, x and y respectively");
        double coordX2 = enter.nextFloat();
        double coordY2 = enter.nextFloat();

        System.out.println("Enter the coordinates of the third point, x and y respectively");
        double coordX3 = enter.nextFloat();
        double coordY3 = enter.nextFloat();

        double a = java.lang.Math.sqrt((coordX2-coordX1)*(coordX2-coordX1)) + ((coordY2-coordY1)*(coordY2-coordY1)); // length of he first side
        double b = java.lang.Math.sqrt((coordX3-coordX2)*(coordX3-coordX2)) + ((coordY3-coordY2)*(coordY3-coordY2)); // length of the second side
        double c = java.lang.Math.sqrt((coordX1-coordX3)*(coordX1-coordX3)) + ((coordY1-coordY3)*(coordY1-coordY3));  // length of the third side

        // Calculate angles in radians using the Law of Cosines
        double angleA = Math.acos((b*b + c*c - a*a) / (2 * b * c));
        double angleB = Math.acos((c*c + a*a - b*b) / (2 * c * a));
        double angleC = Math.acos((a*a + b*b - c*c) / (2 * a * b));

        // Convert angles to degrees
        angleA = Math.toDegrees(angleA);
        angleB = Math.toDegrees(angleB);
        angleC = Math.toDegrees(angleC);

        double sum = angleA + angleB + angleC; // sum has to be equal to 180 !!

        // Print the angles
        System.out.println("Angle A: " + angleA);
        System.out.println("Angle B: " + angleB);
        System.out.println("Angle C: " + angleC);
        System.out.println(sum);

    }    
}


