import java.util.ArrayList;


public class Character {
    // Attributes for the Character
    protected int health;
    protected int attackPower;
    protected String name;
    protected double critChance; 
    protected double critMultiplier;
    private ArrayList<Item> inventory;

    public Character(int health, int attackPower,String name){
        this.health = health;
        this.attackPower = attackPower;
        this.name = name;
        this.inventory = new ArrayList<>(); // Da invetory for da Player
    }
    // how the character and monster objects lose health
    public void takeDamage(double damage){
        health -= damage;
        if(health <= 0){
            health  = 0; // We want to make sure that our any enemy does not go under 0 health cause that wouldn't make sense LOL
            System.out.println("Game over hero!");
        }
        else{
            System.out.println(name + " has taken " + damage + " damage\n" + "[REMAINING HP ---- " + health + "]");
        }
        
    }
    
    // Each attack the player does has a chance to land a critical Attack doubling their damage output
    public void critAttack(Character target){
        critMultiplier = 2;
        System.out.println(getName() + " atacks " + target.getName() + " with a crit, dealing " + getAttackPower() * critMultiplier + " attack\n");
        target.takeDamage(getAttackPower() * critMultiplier);
    }
    // Normal attack
    public void attack(Character target){
        critChance = Math.random() * 100; // critChance needs to be generated here 
        if (critChance >= 25){
            critAttack(target);
        }
        else{
        System.out.println(name + " atacks " + target.getName() + ", dealing " + attackPower + " attack\n");
        target.takeDamage(attackPower);
        }
    }

       // Tells the user that they added an item into their inventory
    public void addToInventory(Item item){
        inventory.add(item);
        System.out.println(item.getItemName() + " has been added to your inventory" );
    }

    // Displays the players Inventory
    public void showInventory(){
        System.out.println(name + "'s INVENTORY:");
        for(Item item : inventory){
            System.out.println("- " + item.getItemName());
        }
    }
    
    // Setter Methods
    public void setName(String name){
        this.name = name;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }
    // Getter Methods
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getAttackPower(){
        return attackPower;
    }
}
