public class Item  {

    // Bro this item class got me fucked up, I just sat her debugging for a min, im bout to knock fr
    // weaponAtk probs won't be used until we create weapon items
    // Also reminder , we should make a HashMap to keep track of how many potions we got, we can even mix it up and add buffs , etc
    private String itemName;
    private int power;

    /* Here we are creating two seperate constructors
    which when called upon can create an item object, pst btw I had to change up the order of the parameters cause java
    was being annoying and thought the constructor was duplicated
    Just don't forget to switch the parameters around when creating a healing potion object
    */ 

    public Item(int power, String itemName){
        this.itemName = itemName;
        this.power = power;
    }

    public String getItemName() {
        return itemName;
    }
}
