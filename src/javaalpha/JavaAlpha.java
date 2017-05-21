package javaalpha;

import java.util.Date;
import java.text.*;
/**
 *
 * @author avos
 */

public class JavaAlpha {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("Y-m-d");
        System.out.println(sdf.format(date));
    }
    
}
