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
}
