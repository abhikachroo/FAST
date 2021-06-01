package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks{

	
   @Before("@Web") 
   public void setUp(){ 
      System.out.println("Before Web Hooks"); 
   }
   @Before("@Mobile") 
   public void setUp1(){ 
      System.out.println("Before Mobile Hooks"); 
   }
   
   @After 
   public void tearDown(){ 
      System.out.print("After Hooks"); 
   } 
   
}