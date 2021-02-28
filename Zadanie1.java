
package zadanie.pkg1;


public class Zadanie1 {
   
    public static void main(String[] args) 
    
    {
        Kwadrat a = new Kwadrat();
        
        int wynik_1 = a.pole(10);
   
        System.out.println(wynik_1);
        
        int wynik_2 = a.obwód(10);
        
        System.out.println(wynik_2);
        
    }

}
    

 class Kwadrat {
    int pole;
            
    int bok;
       
    int pole (int a)
    {
   
    return a * a; 
    
    
    }
   int obwód (int a)
    {
   
    return a * a * a * a ; 
    
    
    }
            
    }

 
