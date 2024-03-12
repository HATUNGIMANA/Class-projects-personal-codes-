public class PrintMultipleTimes {
    public static void main(String[] args) {
        nPrint("God is good", 5);
    }

    public static String nPrint(String message, int n){
        for (int i = 0; i < n; i++ ){
            System.out.println(message);
        }
        return message;
    }
    
}
