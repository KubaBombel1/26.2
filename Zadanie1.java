
package zadanie.pkg1.pkg5;
import java.util.Scanner;

public class Zadanie15 {

   public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
                System.out.println("Wpisz swoje dane");
        
        
               square square= new square(scan.nextInt());
        
        
  System.out.println("Wynik twojego obwodu to " +square.circuit());
        
        
                System.out.println("Wynik twojego pola to " +square.field());
                
    }
   
}

 class square
         
{
    public double F;
    

    public square(double L)  
            
    {
        
        F = L;
        
    }


    public double field ()
            
    {
        
        return F*F;
        
    }
    
     public double circuit ()   
             
    {
        
        return F * 4;
        
    }

}
