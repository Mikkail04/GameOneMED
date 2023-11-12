public class Character {
    // Attributes for the Character
    private int health;
    private int attackPower;
    private String name;

    public Character(int health, int attackPower,String name){
        this.health = health;
        this.attackPower = attackPower;
        this.name = name;
    }

    public void takeDamage(int damage){
        health -= damage;
        if(health <= 0){
            health  = 0; // We want to make sure that our any enemy does not go under 0 health cause that wouldn't make sense LOL
            System.out.println("Game over\nGet gud");
        }
        else{
            System.out.println(name + " has taken " + damage + " damage\n" + "[REMAINING HP ---- " + health + "]");
        }
        
    }
    public void attack(Character target){
        System.out.println(name + " atacks " + target.getName() + ", dealing " + attackPower + " attack\n");
        target.takeDamage(attackPower);
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
