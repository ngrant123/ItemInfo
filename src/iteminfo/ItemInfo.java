
package iteminfo;

/**
 *The code creates an ItemInfo that initializes the object
 *the name,tag number, original location, current location, and price are available
 *@author Nathan Grant
 *
 *email: nathan.grant@stonybrook.edu
 *Stony Brook Id:109816757
 * 
 */
public class ItemInfo{
    
    public String name;
    public String rfidTagNumber;
    public String OriginalL;//original location
    public String CurrentL;//song in seconds
    public double price;
    
    
    /**
     *Default constructor for ItemInfo
     */
    public ItemInfo(){
        
    }
    
    /**
     *Initializes the name,tag,original location, current location, current location, price
     *
     *
     *Precondition:
     *Array has to be instantiated
     *
     *@param capacity:
     *none
     */
    public ItemInfo(String name,String rfidTagNumber,String OriginalL,String CurrentL,double price){
        
        this.name=name;
        this.rfidTagNumber=rfidTagNumber;
        this.CurrentL=CurrentL;
        this.OriginalL=OriginalL;
        this.price=price;
        
        
    }
     
    /**
     *Initializes the name
     *
     *
     *Precondition:
     *Array has to be instantiated
     *
     *@param capacity:
     *none
     */
    public ItemInfo(String name){
        
        this.name=name;
    }
    
     /**
      *Initializes the name,tag,original location, current location,  price
      * 
      *Precondition:
      *Array has to be instantiated
      *
      *@param capacity:
      *none
      */
     public ItemInfo(String name,String rfidTagNumber,String OriginalL,double price){
        
        this.name=name;
        this.rfidTagNumber=rfidTagNumber;
        this.OriginalL=OriginalL;
        this.price=price;
        
        
    }
     /**
      *Method that allows the user to get the name of the 
      *ItemInfo object from the program
      *
      */
    
    public String getName(){
        return this.name;
    }
    
     /**
      *Method that allows the user to get the tag number of the 
      *ItemInfo object from the program
      *
      */
    
    public String getTagN(){
        return this.rfidTagNumber;
    }
    
    /**
     *Method that allows the user to get the original location of the 
     *ItemInfo object from the program
     *
     */
    public String getOriginalT(){
        return this.OriginalL;
    }
    /**
     *Method that allows the user to get the current location of the 
     *ItemInfo object from the program
     *
     */
    public String getCurrentT(){
        return this.CurrentL;
    }
    /**
     *Method that allows the user to get the price of the 
     *ItemInfo object from the program
     *
     */
    
    public double getP(){
        return this.price;
    }
    
    /**
     *Sets the price of the ItemInfo object
     *
     *@param:Price 
     * price of the ItemInfo object that the user wants to set it to 
     */
    public void setP(double price){
        this.price=price;
    }
    
    /**
     *Sets the name of the ItemInfo object
     *
     *@param: Name
     *The name of the ItemInfo object that the user 
     *wants to set it to 
     *
     */
    
    public void setN(String name){
        this.name=name; 
    }
    
    
    /**
     *Sets the tag id of the ItemInfo object
     *
     *@param:rfidTagNumber
     *The tag number of the ItemInfo object that the user 
     *wants to set it to
     *
     */
    public void setTagN(String rfidTagNumber){
        this.rfidTagNumber=rfidTagNumber;
    }
   /**
    *Sets the original location of the ItemInfo object
    *
    *@param:
    *The original location of the ItemInfo object that the user 
    *wants to set it to
    *
    */
    public void setOriginalL(String OriginalL){
        this.OriginalL=OriginalL;
    }
    /**
     *Sets the current location of the ItemInfo object
     *
     *@param:
     *The current location of the ItemInfo object that the user 
     *wants to set it to
     *
     */
    
    public void setCurrentL(String CurrentL){
        this.CurrentL=CurrentL;
    } 
}
