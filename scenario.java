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

    public void setBackground(String img){
        this.backgroundImage = img;
    }

    public ArrayList<String> printOptions(){
        return options;
    }
}
