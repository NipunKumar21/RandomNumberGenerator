import java.util.*;
public class generaterandom {
    public static void main(String args[])
    {
        // create instance of Random class
        Random rand = new Random();
  
        // Generate random integers in range 0 to 999
        int rand_int = rand.nextInt(1000);
  
        // Print random integers
        System.out.println("Random Integers: "+rand_int);
  
    }
}

