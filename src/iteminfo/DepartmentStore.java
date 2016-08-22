
package iteminfo;
import java.util.Scanner;


public class DepartmentStore extends ItemList{
    

    public static void main(String[]args){
        
        
        Scanner input= new Scanner(System.in);
        boolean choice=false;
        
      
        
        ItemList new1= new ItemList();
        
         System.out.println("Welcome!");
         
    
         while(choice!=true){
           
            
        System.out.println("C - Clean Store");
        System.out.println("I - Insertan item into the list");
        System.out.println("M - Move an item in the store");
        System.out.println("O - Checkout");
        System.out.println("P - Print all items in store");
       // System.out.println("R - Print by RFID tag number");
        System.out.println("U - Update inventory system");
        System.out.println("Q - Exit the program");
        
        System.out.println("Please select an option");
        String input1= input.next();
                  



        switch(input1){
            case "I":
                System.out.println("Enter the name:(enter the first word then press enter and enter the second one");
                String name1=input.next();
                String name2=input.next();
                
                String name=name1+" "+name2;
               // System.out.println("\n");
                new1.setN(name);
              
                System.out.println("Enter the RFID:(enter the name without spaces)");
                String rfid=input.next();
                
                new1.setTagN(rfid);
                
                System.out.println("Enter the original position:");
                String originalL=input.next();
                
                new1.setOriginalL(originalL);
                
                new1.setCurrentL(originalL);
                
                System.out.println("Enter the price:");
               
                double price=input.nextDouble();
                
                //new1.setP(price);
                

       new1.insertInfo(name1,rfid,originalL,originalL,price);
                System.out.println("\n");
                break;
                
            case "P":
                new1.printAll();
                System.out.println("\n");
                break;
                        
                
            case "M":
                System.out.println("Enter the RFID");
                String rfid2= input.next();
                
                
                System.out.println("Enter the original Location");
                String originalL2= input.next();
                
                System.out.println("Enter the new location ");
                String newL= input.next();
                
                new1.moveItem(rfid2, newL, originalL2);
                System.out.println("\n");
                break;
            
            case "O":
                
                System.out.println("Enter the cart number");
                String cart1=input.next();
                
                new1.checkout(cart1);
                System.out.println("\n");
                break;
           
            case "L":
                System.out.println("Enter the location");
                String location=input.next();
                
                new1.printByLocation(location);
                System.out.println("\n");
                break;
                
                
            case "C":
               
                new1.cleanStore();
                System.out.println("\n");
                
                break;
                
            case "U":
                new1.removeAllPurchased();
                System.out.println("\n");
                break;
             /*
            case"R":
                System.out.println("Give the ");
                     */
                
            case "Q":
                choice=true;
                break;
            }   
        }
    }
}


  
