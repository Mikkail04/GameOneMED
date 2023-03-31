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

    /**
     * Mikkail wants to add MANY options so here ya go buddy
     */
    public void addOptions(String option1, String option2, String option3, String option4){
        this.options.add(option1);
        this.options.add(option2);
        this.options.add(option3);
        this.options.add(option4);
    }
    /*
     * Returns name of room
     * and all options
     */
    public String toString(){
        return "Room name: " + roomName + "\nOptions: \n" + options;
    }

    /**
     * @param img is set as the background of the room
     */    
    public void setBackground(String img){
        this.backgroundImage = img;
    }

    //returns string holding image path
    public String getBackground(){
        return backgroundImage;
    }
    
}
