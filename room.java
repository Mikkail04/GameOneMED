/*"Rooms" are rooms where the player can interact with the environment, enemies, npcs, etc.*/

import java.util.ArrayList;
public class room {
    
    private String roomName;
    ArrayList<String> options = new ArrayList<String>();
    private String backgroundImage;

    /**
     * @param name sets name of room
     */
    public room(String name){
        this.roomName = name;
    }

    /**
     * @param option adds an option to choose from to options list
     */
    public void addOptions(String option){
        this.options.add(option);
    }
    
    /*
     * prints out the options array
     */
    public ArrayList<String> printOptions(){
        return options;
    }

    /**
     * @param img is set as the background of the room
     */    
    public void setBackground(String img){
        this.backgroundImage = img;
    }

    
}
