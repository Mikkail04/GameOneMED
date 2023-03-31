import java.util.Random;

public class enemy {
    private String name;
    private int hp;
    private int atk;
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

    //Returns health stat for dmg calc
    public int health(){
        return this.hp;
    }

    //Use to change health points during combat
    public void setHealth(int hp){
        if(hp > 0){
            this.hp = hp;
        }
        else{
            this.hp = 0;
        }
    }

    //Returs attack stat for dmg calc
    public int attack(){
        return this.atk;
    }
}
