/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac1;

/**
 *
 * @author NADISHA
 */
public class Prac1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
            System.out.println("");
         System.out.println("nadeesha");
          System.out.println("Management Information System");
              System.out.println("");
          
           for(int x=0;x<=4;x++)
           {
            System.out.println("Executing Loop"+x);
           }
              System.out.println("");
           int y=0;
           while (y<=4)
           {
              System.out.println("Executing Loop"+y);
              y++;
           }
           
                 int [] numbers = {10, 20, 30, 40, 50};
                 for(int b : numbers )
                 {
                    if( b == 30 )
                   {
                    break;
                   }
                  System.out.print( b );
                  System.out.print("\n");
                 }
          System.out.println("I’m  out of the Loop now");
          
             System.out.println("");
             
            int [] number = {10, 20, 30, 40, 50};
                 for(int c : number )
                 {
                    if( c== 30 )
                   {
                    continue;
                   }
                  System.out.print( c);
                  System.out.print("\n");
                 }
          System.out.println("I’m  out of the Loop now");
          
             System.out.println("");
          	char grade ='A';
                switch(grade)
                {
                    case 'A' :
                        System.out.println("Excellent!"); 
                        break;
                    case 'D' :
                        System.out.println("You passed");
                    case 'F' :
                        System.out.println("Better try again");
                        break;
                    default :
                        System.out.println("Invalid grade");
                }
	System.out.println("Your grade is " + grade);
           System.out.println("");
        
          	char grades ='A';
                switch(grades)
                {
                    case 'A' :
                        System.out.println("Excellent!"); 
                       // break;
                    case 'D' :
                        System.out.println("You passed");
                    case 'F' :
                        System.out.println("Better try again");
                        break;
                    default :
                        System.out.println("Invalid grade");
                }
	System.out.println("Your grade is " + grades);

             System.out.println("");
          
            
    }
    
   
   
}
