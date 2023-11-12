public class Monster extends Character {
    // Sub - Class of Character
    public Monster(int health, int attackPower, String name){
        super(health, attackPower, name);
    }

    @Override
    public void attack(Character target){
        System.out.println(getName() + " atacks " + target.getName() + ", dealing " + getAttackPower() + " attack\n");
        target.takeDamage(getAttackPower());
    }

    public void weakAttack(Character target){
        System.out.println(getName() + " atacks " + target.getName() + ", dealing " + getAttackPower() / 2 + " attack\n");
        target.takeDamage(getAttackPower() / 2);
    }
    @Override
    public void takeDamage(double damage){
        health -= damage;
        if(health <= 0){
            health  = 0; // We want to make sure that our any enemy does not go under 0 health cause that wouldn't make sense LOL
            System.out.println("Victory! " + getName() + " has died!");
        }
        else{
            System.out.println(name + " has taken " + damage + " damage\n" + "[REMAINING HP ---- " + health + "]");
        }
        
    }

}
