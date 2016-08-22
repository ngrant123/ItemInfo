
package iteminfo;
/**
 *The code uses the ItemInfoNode class to insert ItemInfoNode
 *objects into a linked list and complete other methods
 *the head,tail,sum, and head2 are available
 *
 *@author Nathan Grant
 *
 *email:nathan.grant@stonybrook.edu
 *Stony Brook Id:109816757
 *
 */


public class ItemList extends ItemInfoNode{
    

    public ItemInfoNode head;
    public ItemInfoNode head2;
    public ItemInfoNode tail;
    public double sum=0;
    
    /**
     *Default constructor for SongRecod
     *
     */
    
    
    public ItemList(){
        
    }
    
    /**
     *Inserts a song to the linkedlist
     *
     *@param:
     *contains the name, tag number, original location, current location, and the price
     *
     *precondition:
     *Each of the parameters has to correspond to its data type. For 
     *example you cant have a string for the price
     *
     *postcondition:
     *The information has been converted to an ItemInfoNode and it has been added
     *to the linked list
     */
    public void insertInfo(String name,String rfidTagNumber,String OriginalL, String currentL,double price){
        
        ItemInfo item1= new ItemInfo(name,rfidTagNumber,OriginalL,currentL,price);
        boolean choice=false;
        
        
        ItemInfoNode new2=new ItemInfoNode();
        new2.setInfo(item1);
        
        //item1=item1.getName();
        
        
        ItemInfoNode cursor= head;
        ItemInfoNode cursor3=head;
        
        if(head==null){
            
         
         new2.setNext(head);
         new2.setPrev(null);
         head=new2;
         
        }
        else if(cursor.getNext()==null){ 
                
                new2.setNext(null);
                
                new2.setPrev(cursor);
                cursor.setNext(new2);
                cursor=new2;
                
            }
        else{
            
            //  String new1=new2.getTagN();
          
            
            while((new2.object.getTagN()).compareTo(cursor.object.getTagN())>0 && cursor!=null && cursor.getNext()!=null){
                
                if((new2.object.getTagN()).compareTo(cursor.object.getTagN())==0){
                    break;
                }
                
                 if(cursor==null){
                     choice=true;
                     break;
                     
                 }
                
                cursor=cursor.getNext();
                
            }
            if(choice==true){
                new2.setNext(cursor.getNext());
               new2.setPrev(cursor);
               cursor.setNext(new2);
               cursor=new2;
              
                
            }
            
            else  if((new2.object.getTagN()).compareTo(cursor.object.getTagN())>0 && cursor.getNext()==null){
                
                new2.setNext(null);
                new2.setPrev(cursor);
                cursor.setNext(new2);
                cursor=new2;
                //cursor=new2;
                
                
            }
            
            else {
                 new2.setNext(cursor);
                 
                 while(cursor3.getNext()!=cursor){
                     
                     cursor3=cursor3.getNext();
                     
                 }
           
            cursor3.setNext(new2);
            cursor=new2;
          //  cursor=new2;
            
             }
        }
        
    }
    /**
     *Inserts a song to the linkedlist by using head2
     *This creates a seperate linkedlist with songs that have been checked out
     *  
     *@param capacity:
     *contains the name, tag number, original location, current location, and the price
     *
     *precondition:
     *Each of the parameters has to correspond to its data type. For 
     *example you cant have a string for the price
     *
     *postcondition:
     *The information has been converted to an ItemInfoNode and it has been added
     *to the linked list that have been checked out 
     *
     */
    
     public void insertInfo2(String name,String rfidTagNumber,String OriginalL,String currentL,double price){
        
         
        ItemInfo item1= new ItemInfo(name,rfidTagNumber,OriginalL,currentL,price);
        boolean choice=false;
        
        
        ItemInfoNode new2=new ItemInfoNode();
        new2.setInfo(item1);
        
        //item1=item1.getName();
        
        
        ItemInfoNode cursor= head2;
        ItemInfoNode cursor3=head2;
        
        if(head2==null){
            
         
         new2.setNext(head2);
         new2.setPrev(null);
         head2=new2;
         
        }
        else if(cursor.getNext()==null){ 
                
                new2.setNext(null);
                
                new2.setPrev(cursor);
                cursor.setNext(new2);
                cursor=new2;
                
            }
        else{
            
            //  String new1=new2.getTagN();
          
            
            while((new2.object.getTagN()).compareTo(cursor.object.getTagN())>0 && cursor!=null && cursor.getNext()!=null){
                
                if((new2.object.getTagN()).compareTo(cursor.object.getTagN())==0){
                    break;
                }
                
                 if(cursor==null){
                     choice=true;
                     break;
                     
                 }
                
                cursor=cursor.getNext();
                
            }
            if(choice==true){
                new2.setNext(cursor.getNext());
               new2.setPrev(cursor);
               cursor.setNext(new2);
              
                
            }
            
            else  if((new2.object.getTagN()).compareTo(cursor.object.getTagN())>0 && cursor.getNext()==null){
                
                new2.setNext(null);
                new2.setPrev(cursor);
                cursor.setNext(new2);
                //cursor=new2;
                
                
            }
             /*
             if(cursor.getNext()==null && cursor.getNext().getNext()!=null && cursor==null){
                 
               new2.setNext(cursor.getNext().getNext());
               new2.setPrev(cursor);
               cursor.setNext(new2);
              
                 
                 
             }
             */
            else {
                 new2.setNext(cursor);
                 
                 while(cursor3.getNext()!=cursor){
                     
                     cursor3=cursor3.getNext();
                     
                 }
               
            cursor3.setNext(new2);
          //  cursor=new2;
            
             }
        }
    }
    /**
     *prints the number of objects in the linkedlist
     *
     *Precondition:
     *Linkedlist has to be instantiated
     *
     *@param: none
     */
    public void printAll(){
        
        ItemInfoNode cursor=head;
        
        System.out.println("Item Name      RRID      Original Location      Current Location      Price");
        System.out.println("---------     -------    ------------------     -----------------    -------");
      
        
        while(cursor!=null){
            
            System.out.println(cursor.object.getName()+"            "+cursor.object.getTagN()+"            "+cursor.object.getOriginalT()+  "                  "+cursor.object.getCurrentT()+"                   "+cursor.object.getP());
            
            cursor=cursor.getNext();
        }
        
    }
    /**
     *prints the number of objects in the linkedlist that have been checked out
     *
     *Precondition:
     *Linkedlist has to be instantiated
     *
     *@param:none
     */
    
    public void printAll2(){
        
       ItemInfoNode cursor=head2;
        
        System.out.println("Item Name      RRID      Original Location      Current Location      Price");
        System.out.println("---------     -------    ------------------     -----------------    -------");
      
        
        while(cursor!=null){
           
            System.out.println(cursor.object.getName()+"             "+cursor.object.getTagN()+"              "+cursor.object.getOriginalT()+  "              "+cursor.object.getCurrentT()+"              "+cursor.object.getP());
            
            cursor=cursor.getNext();
        }
    }
    
    /**
     *
     *prints the number of objects in the linkedlist that are in the same
     *location as the string specified
     *
     *@param:
     *contains the location of the object(s)
     *
     *precondition:
     *The String location has to match the location in the linkedlist
     *
     *postcondition:
     *If the current location matched the string it was printed in the output 
     *
     *Precondition:
     *Linkedlist has to be instantiated
     *
     *@param: Location
     */
    public void printByLocation(String location){
        
        ItemInfoNode cursor=head;
        
        System.out.println("Item Name      RRID      Original Location      Current Location      Price");
        System.out.println("---------     -------    ------------------     -----------------    -------");
        
        
        if(cursor.getNext()==null){
            
       System.out.println(cursor.object.getName()+"      "+cursor.object.getTagN()+"      "+cursor.object.getOriginalT()+"            "+cursor.object.getCurrentT()+"      "+cursor.object.getP());
        }
        
        while(cursor!=null){
            
            if(cursor.object.getCurrentT().compareTo(location)==0){
                System.out.println(cursor.object.getName()+"      "+cursor.object.getTagN()+"      "+cursor.object.getOriginalT()+"            "+cursor.object.getCurrentT()+"      "+cursor.object.getP());
                cursor=cursor.getNext();
            }
            else
               cursor=cursor.getNext();
            
        }
       
    }
    
    /**
     *Moves a specified item from a source location to a destination location
     * 
     *@param:
     *contains the rFidTagNumber, the source, and the destination
     *
     *precondition:
     *Each of the parameters has to correspond to its data type. For 
     *example you cant have a double for the destination
     *
     *postcondition:
     *The object with the rfidTagNumber's source location has been changed to 
     *a destination location which simply means that the current location has been
     *changed
     */
    public boolean moveItem(String rfidTagNumber,String source, String destination){
        
        ItemInfoNode cursor=head;
        boolean test=true;
        
        while(cursor!=null){
            
            if(cursor.object.getTagN().compareTo(rfidTagNumber)!=0){
                cursor=cursor.getNext();
                test=false;
            }
            else{
                test=true;
                break;
            }
        }
        
        if(test==false){
            return false;
        }
        
        else{
            remove(cursor);
            
          //  cursor.object.setCurrentL(destination);            
           insertInfo(cursor.object.getName(),rfidTagNumber,destination,source,cursor.getP());    
       return true;
        }
        
    }
    
    /**
     *Removes all objects with the current location as "out"
     *It calls the remove() method that removes a specific object
     *
     *@param: none
     *
     *precondition:
     *Linkelist has to be instantiated 
     *
     *postcondition:
     *The LinkedList that is returned does not have any object with the
     *current location as "out"
     */
    public void removeAllPurchased(){
        
        ItemInfoNode cursor=head;
        
        while(cursor!=null){
            
            if((cursor.object.getCurrentT()).compareTo("out")==0){
                remove(cursor);
                //cursor=cursor.getNext();
            }
            
            cursor=cursor.getNext();
        }
        
    }
    /**
     *Removes the specific object in the Linkedlist
     *If the object is contained in the Linkedlist the program promptly
     *removes it 
     *
     *@param:
     *contains the ItemInfoNode that has to be removed
     *
     *precondition:
     *Linkelist has to be instantiated 
     *
     *postcondition:
     *The LinkedList that is returned does contain the specified ItemInfoNode object
     */
    public void remove(ItemInfoNode new1){
        
        ItemInfoNode cursor=head;
        boolean choice=true;
        
        
        while(cursor!=null){
             if(cursor==new1){
            head=head.getNext();
                choice=false;
                break;
                
            }
            if(cursor.getNext()==new1){
                choice=true;
                break;
            }
            
            else
                cursor=cursor.getNext();
            
        }
        
        
        
        if(choice==true){
            
            ItemInfoNode cursor1=cursor;
          //  cursor= cursor.getNext();
       // ItemInfoNode cursor2=cursor.getNext();
        
         cursor.setNext(cursor.getNext().getNext());
         
         if(cursor!=null){
             
        // cursor2.setPrev(cursor1);
         
         }
         
       }         
    }
    /**
     *Goes through a cartNumber and if the current Location matches the cart Number
     *the method deletes the  object and adds one with the current location as "out".
     *It then adds another object to the linkedlist with head2 as the head.It then 
     *returns the sum
     *
     *@param:
     *contains the cartNumber
     *
     *precondition:
     *Each of the parameters has to correspond to its data type. For 
     *example you cant have a string for the price
     *
     *postcondition:
     *The ItemInfoNode that contains the cartNumber is deleted from the existing 
     *linkedlist and is added to a linkedlist that only contains checked out items
     */
    public double checkout(String cartNumber){
        
        ItemInfoNode cursor=head;
        
        
        while (cursor!=null){
            
            if(cursor.object.getCurrentT().compareTo(cartNumber)==0){
                remove(cursor);
                insertInfo(cursor.object.getName(),cursor.object.getTagN(),cursor.object.getOriginalT(),"out",cursor.object.getP());
                insertInfo2(cursor.object.getName(),cursor.object.getTagN(),cursor.object.getOriginalT(),cursor.object.getCurrentT(),cursor.object.getP());
                
                
                sum= sum+cursor.object.getP();
                cursor=cursor.getNext();
            }
            else
                cursor=cursor.getNext();
            
        }
        
        printAll2();
        
        return sum;
    }
    /**
     *
     *Goes through the linkedlist and if the current location does not equal
     *the original location then the method sets the current location the 
     *same as the current location
     *
     *@param:none
     *
     *precondition:
     *none
     *
     *postcondition:
     *The if the object's original location and current location are not the same
     *the method sets them equal to each other 
     */
    public void cleanStore(){
        
        ItemInfoNode cursor=head;
        
        while(cursor!=null){
            if(cursor.object.getOriginalT()!=cursor.object.getCurrentT()){
                cursor.object.setCurrentL(cursor.object.getOriginalT());
            }
            cursor=cursor.getNext();
        }
        
    }

    
}