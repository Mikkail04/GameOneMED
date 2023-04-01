import java.util.Random;

public class enemy {
    private String name;
    private int hp;
    private int atk;
    private String[] dialogue;
    private String[] actions;

    Random rand = new Random();

    /**
     * @param name of enemy
     * @param hp stat
     * @param atk stat
     */
    public enemy(String name, int hp, int atk){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    //Returns name of enemy
    public String getEnemyName(){
        return name;
    }

    //Returns health stat of enemy for dmg calc
    public int getEnemyHealth(){
        return hp;
    }

    //Use to change health points of enemy during combat
    public void setEnemyHealth(int hp){
        if(hp > 0){
            this.hp = hp;
        }
        else{
            this.hp = 0;
        }
    }

    //Returs attack stat of enemy for dmg calc
    public int getEnemyAttack(){
        return this.atk;
    }

    public String toString(){
        return name + "\nHP: " + hp;
    }
}
