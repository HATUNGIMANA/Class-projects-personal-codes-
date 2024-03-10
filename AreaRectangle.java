import java.util.Scanner;

public class AreaRectangle {
    public static double area(double w, double l){
        double area = w*l;
        System.out.println("The area of a rectangle with the width of "+ w + " and the length of "+ l + " is " + area);
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the width and the length respectively");
        double a = input.nextDouble();
        double b = input.nextDouble();
        area(a, b); 
    }
    
}
