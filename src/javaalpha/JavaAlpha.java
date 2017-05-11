package javaalpha;

/**
 *
 * @author avos
 */

class FreshJuice{
    enum FreshJuiceSize {Small, Medium, Large}
    FreshJuiceSize size;
}

public class JavaAlpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.Medium;
        System.out.println("Size : " + juice.size);
    }
    
}
