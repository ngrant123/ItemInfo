
package iteminfo;
/**
 *The code uses ItemInfo class to stores the object into
 *an ItemInfoNode object
 *the object, previous ItemInfoNode, and next ItemInfoNode are available
 *
 *@author Nathan Grant
 *
 *email: nathan.grant@stonybrook.edu
 *Stony Brook Id:109816757
 *
 */

public class ItemInfoNode extends ItemInfo{
    
    public ItemInfo object;
    public ItemInfoNode prev;
    public ItemInfoNode next;
    
    /**
     *Default constructor for ItemInfoNode
     */
    public ItemInfoNode(){
        
    }
    
     
    /**
     *
     *Initializes the new object
     *
     *@param:ItemInfo
     */
    public ItemInfoNode(ItemInfo new1){
        
        this.object=new1;
        
    }
    
    /**
     *Initializes the new object, previous node, previous node
     */
    
    public ItemInfoNode(ItemInfoNode prev,ItemInfo object,ItemInfoNode next){
        
        this.prev=prev;
        this.object=object;
        this.next=next;
    
    }
    
    /**
     *Sets the object to the ItemInfo object
     *
     *@param:ItemInfo
     *The ItemInfo that the user wants to set that ItemInfoNode object to
     *
     */
    public void setInfo(ItemInfo info){
        this.object=info;
    }
   
    /**
     *Sets the ItemInfoNode to next
     *
     *@param:
     *The ItemInfoNode that the user wants to set the next to
     *
     */
    
    public void setNext(ItemInfoNode node){
        this.next=node;
    }
    /**
     *Sets the ItemInfoNode to previous
     *  
     *@param:ItemInfo
     *The ItemInfoNode that the user wants to set the previous to
     *
     */
    
    public void setPrev(ItemInfoNode node){
        this.prev=node;
    }
    
    /**
     *Method that allows the user to get the next ItemInfoNode
     */
    public ItemInfoNode getNext(){
        return next;
    }
    /**
     *Method that allows the user to get the previous ItemInfoNode
     */
    public ItemInfoNode getPrev(){
        return prev;
    }
   
}
