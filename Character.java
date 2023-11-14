import java.util.ArrayList;
import java.util.HashMap;


public class Character {
    // Attributes for the Character
    protected String name;
    protected double health;
    protected double attackPower;
    protected double critChance; 
    protected double critMultiplier;
    private ArrayList<Item> inventory;
    private HashMap<Item, Integer> amount;

    /**
     * Create a new character.
     * @param name String representing name of the character.
     * @param health double representing HP of the character
     * @param attackPower double reppresenting attack power of the character. This might change to scale with the equipped weapon.
     */
    public Character(String name, double health, double attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        //Crit chance should prob be made here ngl
        this.inventory = new ArrayList<>(); // Da invetory for da Player
        this.amount = new HashMap<>();
    }
    
    /**
     * Reduces the character's health
     * @param damage Double damage is subtracted from the character's health.
     */
    public void takeDamage(double damage){
        health -= damage;
        if(health <= 0){
            health  = 0; // HP no go under zero
            System.out.println("Game over hero!");
            System.exit(0);
        }
        else{
            System.out.println(name + " has taken " + damage + " damage\n" + "[REMAINING HP ---- " + health + "]");
        }
        
    }
    
    /**
     * Critical Attack. Big boi damge
     * @param target The poor monster who got shit on by RNG. Or the MC tbh.
     */
    public void critAttack(Character target){
        critMultiplier = 2;
        System.out.println(getName() + " lands a crit, dealing " + getAttackPower() * critMultiplier + " to " + target.getName() + ".\n");
        target.takeDamage(getAttackPower() * critMultiplier);
    }

    /**
     * Normal Attack. Not as big boi.
     * @param target Either the monster being fought, or the main character getting beat.
     */
    public void attack(Character target){
        critChance = Math.random() * 100; // Crit chance generated here. I type wanna move it to the constructor but thats work.
        //Rn theres a 75% chance to crit. Might wanna change it later.
        if (critChance >= 25){
            critAttack(target);
        }
        else {
            System.out.println(name + " atacks " + target.getName() + ", dealing " + attackPower + " damage\n");
            target.takeDamage(attackPower);
        }
    }

       /**
        * Adds an item to the inventory. Eric I dont know what this does you document it yourself.
        * @param item
        */
       public void addToInventory(Item item) {
        if (!amount.containsKey(item)) {        // Checks if the hashMap contains our item already
            amount.put(item, 1);           // If it does not then we add it to our list and map 
            inventory.add(item);
            System.out.println(item.getName() + " has been added to your inventory\n");
        } 
        else {
            int currentAmount = amount.get(item);           // if it does have it already , we only increment the value in the map
            amount.put(item, currentAmount + 1);            // We also don't add to our list so that we don't have any duplicates
        }
    }

    /**
     * Displays the MC's inventory.
     */
    public void showInventory(){
        System.out.println(name + "'s INVENTORY:\n");
        for(Item item : inventory){
            System.out.println((inventory.indexOf(item) + 1 ) + " - " + item.getName() + " [" + getAmount(item) + "]");
        }
    }

    //Setter methods below

    /**
     * Sets the character's name. Pretty sure we just gonna do this once anyways but whatever.
     * @param name  String representing the character's name.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the character's health.
     * @param health Double representing the character's health.
     */
    public void setHealth(double health){
        this.health = health;
    }

    /**
     * Sets the character's attack power. Might use this to update the character's attack to a weapon or something
     * Maybe have it be a bonus on top of their current atk power.
     * @param attackPower Double representing the character's current attack power.
     */
    public void setAttackPower(double attackPower){
        this.attackPower = attackPower;
    }

    // Getter Methods

    /**
     * Returns the name of the character.
     * @return String representing the name of the character.
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the health of the character.
     * @return Double representing the character's health
     */
    public double getHealth(){
        return health;
    }

    /**
     * Returns the attack power of the character.
     * @return Double representing the character's atk
     */
    public double getAttackPower(){
        return attackPower;
    }

    /**
     * Returns the amount of a certain item
     * @param item Item object being selected
     * @return int representing the amount of the selected item
     */
    public int getAmount(Item item){
        return amount.get(item);        // just gives us the current amount of whatever item we got in our inventory fr
    }
}
