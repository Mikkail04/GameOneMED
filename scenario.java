/*"Scenarios" are rooms where the player can interact with the environment, enemies, npcs, etc.*/

/*"Scenarios" are rooms where the player can interact with the environment, enemies, npcs, etc.*/

import java.util.ArrayList;
public class scenario {
    
    private String scenarioName;
    ArrayList<String> options = new ArrayList<String>();
    private String backgroundImage;

    /**
     * @param name sets name of scenario
     */
    public scenario(String name){
        this.scenarioName = name;
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
     * @param img is set as the background of the scenario
     */    
    public void setBackground(String img){
        this.backgroundImage = img;
    }

    
}
