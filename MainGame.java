import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        // GameGUI game = new GameGUI(); // Commented out until we figure out the main game first
        Game();
    }
    public static void Game(){
        System.out.println("-----------------PHANTHOM VEIL-----------------");
        System.out.println("\nBrave Warrior what is your name?\n");
        Scanner scan = new Scanner(System.in);
        String player = scan.nextLine();
        Character mainCharacter = new Character(100,10,player);
        Monster goblin = new Monster(50,5,"Goblin");

        System.out.println("Welcome " + player + ", you shall be the defender of Earth. For your first task, you should defeat that goblin over there\n");

        Fight.vs(mainCharacter, goblin);
        Item potion = new Heals(10, "Healing Potion"); /* This is just testing the inventory system */
        System.out.println("Here is a potion for your hard fought victory!");
        mainCharacter.addToInventory(potion); // Ngl idk why I needed to do mainCharacter first for the methods to work
        mainCharacter.addToInventory(potion); // Testing to see if I can have multiple items
        mainCharacter.showInventory(); // Testing the showing inventory systemmaBobber
        
        scan.close();
    }

    public void ScenarioOne(){
        // PlaceHolder
    }

    public void ScenarioTwo(){
        // PlaceHolder
    }

    public void ScenarioThree(){
        //Placeholder
    }
}