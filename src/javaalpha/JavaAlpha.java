package javaalpha;

/**
 *
 * @author avos
 */


public class JavaAlpha {
    int puppyAge;
    
    public JavaAlpha (String name){
        System.out.println("The name is : " + name);
    }
    public void setAge(int age){
        puppyAge = age;
    }
    public int getAge(){
        System.out.println("My Puppy's age : " + puppyAge);
        return puppyAge;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaAlpha myPuppy = new JavaAlpha("gugy");
        myPuppy.setAge(7);
        myPuppy.getAge();
        System.out.println("Variable value : " + myPuppy.puppyAge);
    }
    
}
