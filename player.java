import java.util.ArrayList;
import java.util.Random;

public class player {   
    private String name;
    private int lvl;
    private int hp;
    private int atk;
    private int sanity;
    private ArrayList<String> inv;
    Random rand = new Random();

    /**
     * @param name When first starting the game, contruct the object while asking the user to enter a name
     * hp and atk starting stats are TBD, give them actual numbers when doing combat
     */
    public player(String name){
        this.name = name;
        hp = 10;
        atk = 5;
        lvl = 1;
        inv = new ArrayList<String>();
    }

    /**
     * When leveling up, stats will decrease randomly
     * Decide the range when working on combat
     */
    public void levelUp(){
        lvl++;
        hp += rand.nextInt(1, 5);
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
