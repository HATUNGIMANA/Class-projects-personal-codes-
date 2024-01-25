import java.util.Date;
import java.text.SimpleDateFormat;;
public class TimeDateRsch {
    public static void main(String[] args){

        // printing date in default format
        Date currentDaate = new Date();
        System.out.println(currentDaate);

        // modifying date in our preferred format
        SimpleDateFormat form = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss a z");
        String theDate = form.format(currentDaate);

        System.out.println("Formated date: " + theDate);
    }
    
}
