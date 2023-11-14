public class Monster extends Character {
    // Sub - Class of Character

    /**
     * Monster constructor
     * @param name String representing name of the monster.
     * @param health double representing the health of the monster.
     * @param attackPower double representing the attack power of the monster.
     */
    public Monster(String name, double health, double attackPower){
        super(name, health, attackPower);
    }

    //Commenting this out for now, idk why its was being used.
    // @Override
    // public void attack(Character target){
    //     System.out.println(getName() + " atacks " + target.getName() + ", dealing " + getAttackPower() + " attack\n");
    //     target.takeDamage(getAttackPower());
    // }


    /**
     * Weak attack. To be used when the player defends. Halfs damgage
     * @param target Character object. Our cowarding MC. Who even blocks nowadays?
     */
    public void weakAttack(Character target){
        System.out.println(getName() + " atacks a defending " + target.getName() + ", dealing " + getAttackPower() / 2 + " attack\n");
        target.takeDamage(getAttackPower() / 2);
    }

    //Has to override cause when a normal character dies the game ends. Different message when monster dies.
    @Override
    public void takeDamage(double damage){
        health -= damage;
        if(health <= 0){
            health  = 0; // We want to make sure that our any enemy does not go under 0 health cause that wouldn't make sense LOL
            System.out.println("Victory! " + getName() + " has died!");
        }
        else{
            System.out.println(name + " has taken " + damage + " damage\n" + "[REMAINING HP ---- " + health + "]\n");
        }
        
    }

}
