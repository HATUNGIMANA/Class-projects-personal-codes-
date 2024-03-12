public class VoidMethodPractice {
    public static void main (String[] args){
        printGradeName(73);
    }

    public static void printGradeName(double n){
        if ((n > 70) && (n < 75)){
            System.out.println("The grade is B");
        }
    }
    
}
