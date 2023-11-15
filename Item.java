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

/**
 * The Item interface defines common methods that any class implementing it must provide.
 */
public interface Item {
    /**
     * This method represents the action of using the item.
     * Implementing classes should define the specific behavior of item usage.
     */
    void use(Character character);

    /**
     * This method returns the name of the item.
     *
     * @return The name of the item.
     */
    String getName();
}

/**
 * BuffPotion is a class that implements the Item interface.
 * It represents a potion that buffs the attack power of something.
 */
class BuffPotion implements Item {

    private int buffAtk; // Amount of attack power buffed by this potion
    private String name; // Name of the potion

    /**
     * Constructor for BuffPotion.
     *
     * @param name    The name of the potion.
     * @param buffAtk The amount of attack power buffed by the potion.
     */
    public BuffPotion(String name, int buffAtk) {
        this.name = name;
        this.buffAtk = buffAtk;
    }

    /**
     * Overrides the use method from the Item interface.
     * Prints a message indicating the name and the amount of attack power buffed.
     */
    @Override
    public void use(Character character) {
        System.out.println(name + " buffs attack by " + buffAtk + " points");
        // Logic to be added to allow user to use item
        character.buffPlayerAttack(buffAtk);
    }

    /**
     * Overrides the getName method from the Item interface.
     *
     * @return The name of the potion.
     */
    @Override
    public String getName() {
        return name;
    }
}

/**
 * HealPotion is a class that implements the Item interface.
 * It represents a potion that heals health points.
 */
class HealPotion implements Item {

    private int healPower; // Amount of health points healed by this potion
    private String name; // Name of the potion

    /**
     * Constructor for HealPotion.
     *
     * @param name      The name of the potion.
     * @param healPower The amount of health points healed by the potion.
     */
    public HealPotion(String name, int healPower) {
        this.name = name;
        this.healPower = healPower;
    }

    /**
     * Overrides the use method from the Item interface.
     * Prints a message indicating the name and the amount of health points recovered.
     */
    @Override
    public void use(Character character) {
        System.out.println(name + " used. " + healPower + " health points recovered ");
        character.heal(healPower);
    }

    /**
     * Overrides the getName method from the Item interface.
     *
     * @return The name of the potion.
     */
    @Override
    public String getName() {
        return name;
    }
}

/**
 * The Weapon class implements the Item interface and represents a weapon.
 */
class Weapon implements Item {

    private int attackPower;
    private String name;

    /**
     * Constructor for Weapon.
     *
     * @param name        The name of the weapon.
     * @param attackPower The attack power of the weapon.
     */
    public Weapon(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    /**
     * Overrides the use method from the Item interface.
     * Prints a message indicating the name and the amount of attack power of the weapon.
     */
    @Override
    public void use(Character character) {
        System.out.println(name + " is wielded. Attack power: " + attackPower);
    }

    /**
     * Overrides the getName method from the Item interface.
     *
     * @return The name of the weapon.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Returns the attack power of the weapon.
     *
     * @return The attack power of the weapon.
     */
    public int getAttackPower() {
        return attackPower;
    }
}

/**
 * The Armor class implements the Item interface and represents a piece of armor.
 */
class Armor implements Item {

    private int defense;
    private String name;

    /**
     * Constructor for Armor.
     *
     * @param name    The name of the armor.
     * @param defense The defense value of the armor.
     */
    public Armor(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    /**
     * Overrides the use method from the Item interface.
     * Prints a message indicating the name and the defense value of the armor.
     */
    @Override
    public void use(Character character) {
        System.out.println(name + " is equipped. Defense: " + defense);
    }

    /**
     * Overrides the getName method from the Item interface.
     *
     * @return The name of the armor.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Returns the defense value of the armor.
     *
     * @return The defense value of the armor.
     */
    public int getDefense() {
        return defense;
    }
}

