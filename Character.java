public class Character {
    // Attributes for the Character
    protected int health;
    protected int attackPower;
    protected String name;
    protected double critChance; 
    protected double critMultiplier;

    public Character(int health, int attackPower,String name){
        this.health = health;
        this.attackPower = attackPower;
        this.name = name;
    }

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

    public void critAttack(Character target){
        critChance = Math.random() * 100;
        critMultiplier = 2;
        System.out.println(getName() + " atacks " + target.getName() + " with a crit, dealing " + getAttackPower() * critMultiplier + " attack\n");
        target.takeDamage(getAttackPower() * critMultiplier);
    }

    public void attack(Character target){
        if (critChance >= 1){
            critAttack(target);
        }
        else{
        System.out.println(name + " atacks " + target.getName() + ", dealing " + attackPower + " attack\n");
        target.takeDamage(attackPower);
        }
    }

    public void setName(String name){
        this.name = name;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }

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
