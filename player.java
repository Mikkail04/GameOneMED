import java.util.ArrayList;
import java.util.Random;

public class player {   
    private String name;
    private int lvl;
    private int maxHp;
    private int currentHp;
    private int atk;
    private int skillPoints;
    private int sanity;
    private ArrayList<String> inv;
    Random rand = new Random();

    /**
     * @param name When first starting the game, contruct the object while asking the user to enter a name
     * hp and atk starting stats are TBD, give them actual numbers when doing combat
     */
    public player(String name){
        this.name = name;
        maxHp = 10;
        atk = 5;
        lvl = 1;
        inv = new ArrayList<String>();
    }

    //Returns name of player
    public String getPlayerName(){
        return name;
    }

     //Returns max health stat of player for dmg calc
     public int getPlayerMaxHealth(){
        return maxHp;
    }

    //Returns current health of player for dmg calc
    public int getPlayerCurrentHealth(){
        return currentHp;
    }
    
    //Returns level of player
    public int getPlayerLevel(){
        return lvl;
    }

    //Use to change health points of player during combat
    public void setPlayerHealth(int hp){
        if(hp > 0){
            this.currentHp = hp;
        }
        else{
            this.currentHp = 0;
        }
    }

    public int getPlayerAttack(){
        return atk;
    }

    /**
     * When leveling up, stats will decrease randomly
     * Decide the range when working on combat
     */
    public void levelUp(){
        lvl++;
        maxHp += rand.nextInt(1, 5);
        atk += rand.nextInt(1, 3);
    }

    /**
     * 
     * @returns sanity
     * pretty straightforward
     */
    public int getSanity(){
        return sanity;
    }

    //Also pretty straightforward
    public void setSanity(int sanity){
        this.sanity = sanity;
    }
}
