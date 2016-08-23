# ItemInfo
ItemInfo simulation

This project makes a simulation of a department store's inventory using RFID as a key in a doubly-linked list and also to write a simulator that allows merchandise to be manipulated within the store. 

The ItemInfo class contains various information about a specific item that can or has been sold in a given department store. It also contains the product's name and price along with additional information about the items. The original location, current location and the tag number are available.

The ItemInfoNode class contains a reference to an ItemInfo object as well as to two other ItemInfoNode objects, referred to as prev and next. It is basically the implementation for a LinkeList.

The ItemList class allows the user to insert, remove, and move an ItemList in the linkedlist. Additionally there is a method that prints all of the Items and also prints them by a location.

The DepartementStore class contains a main method that provides a menu with options like inserting an item, moving an item, print all items, and many other options. 
