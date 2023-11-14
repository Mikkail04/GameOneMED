// // Bro this item class got me fucked up, I just sat her debugging for a min, im bout to knock fr
// public class Item  {
//     private String itemName;
//     private int itemPower;

//     /**
//      * Creates an item with a name and item power
//      * @param itemPower An int representing the power of the item (Heal or Attack)
//      * @param itemName A string representing the item name
//     */
//     public Item(int itemPower, String itemName){
//         this.itemName = itemName;
//         this.itemPower = itemPower;
//     }

//     /**
//      * Returns the name of the item
//      * @return A string representing the item name.
//      */
//     public String getItemName() {
//         return itemName;
//     }

//     /**
//      * Returns the power of the item (Heal Power or Attack Power)
//      * @return An int representing the item power.
//      */
//     public int getItemPower(){
//         return itemPower;
//     }
// }


// TIME TO REVAMP ALL THE INVENTORY WOHOOOOOO


public interface Item {
    void use(); // Common method that everything that implements this needs to use
    String getName(); // ^^
}