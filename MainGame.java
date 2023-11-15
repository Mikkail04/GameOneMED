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
        Character mainCharacter = new Character(player,100,10); // Player

        // Intro message for the player
        System.out.println("\nWelcome " + player + ", you shall be the defender of Earth. For your first task, you should enter the goblin forest and hunt down Soujoubou, the Tengu Goblin.He holds the first piece of the [TBD] aramor.\n");

        // Runs scenarios then closes the game after each scenario is finished
        ScenarioOne(mainCharacter, scan);
        // ScenarioTwo(mainCharacter, scan); // commented out bc it's not done
        // ends game
        scan.close();
    }

    // This is the first scenario the player will be placed in
    public static void ScenarioOne /*Goblin Forest*/(Character mainCharacter, Scanner scan){
        // Intro message to Scenario One
        System.out.println("\nAs you approach the forest, you see some bushes rumbling before something jumps out at you.\n");
        // Declares the enemies in Scenario One
        Monster goblin = new Monster("Goblin", 50, 5);
        Monster goblinTwo = new Monster("Goblin", 50, 5);;
        Monster hobgoblin = new Monster("Hobgoblin", 75, 10);
        Monster boss1 = new Monster("Soujoubou, the Tengu Goblin", 1, 30);
        Armor armorSet = new Armor("Tengu Armor", 10);
        // First encounter
        System.out.println("A Goblin approaches!\nGoblins have 50 health and 5 ATK.");
        Fight.vs(mainCharacter, goblin, scan);
        HealPotion heal  = new HealPotion("Healing Potion", 10); /* This is just testing the inventory system */
        System.out.println("Here is a potion for your hard fought victory!");
        // Reward for first encounter
        mainCharacter.addToInventory(heal); // Ngl idk why I needed to do mainCharacter first for the methods to work
        //mainCharacter.addToInventory(potion); // Testing to see if I can have multiple items
        mainCharacter.showInventory(); // Testing the showing inventory systemmaBobber
        
        //note: The player now receives a potion from fighting the second goblin
        //The second encounter
        System.out.println("\n\n\nAnother goblin approaches!");
        Fight.vs(mainCharacter, goblinTwo, scan);
        System.out.println("Here is a potion for your hard fought victory! I also added an extra rare buff Potion!");
        BuffPotion buff = new BuffPotion("Buff Potion", 15);
        mainCharacter.addToInventory(heal);
        mainCharacter.addToInventory(buff);
        mainCharacter.showInventory(); // testig to see if i have multiple itenms in correct index
        
        // Chance for a difficult encounter against a hobgoblin
        double hobGobChance = Math.random() * 100;
        if (hobGobChance <= 30 ){
        System.out.println("\n\n\nA hobgoblin approaches!");
        System.out.println("Hobgoblins have 75 health and 10 ATK.");
        Fight.vs(mainCharacter,hobgoblin, scan);
        System.out.println("Here are two potions for your hard fought victory!");
        // Difficult enemy = extra rewards
        mainCharacter.addToInventory(heal); 
        mainCharacter.addToInventory(heal);
        }

        // Boss fight time
        System.out.println("\n\n\nThe slaughter of multiple of his minions has summoned the legendary goblin leader out of the shadows!");
        System.out.println("Soujoubou, the Tengu Goblin approaches!");
        // Actual encounter starts
        Fight.vs(mainCharacter, boss1, scan);
        // Player should get bonus loot for defeating bosses
        System.out.println("You have defeated a Phantom General! You will receive extra loot!");
        mainCharacter.addToInventory(heal);
        mainCharacter.addToInventory(heal);
        mainCharacter.addToInventory(heal);
        mainCharacter.addToInventory(buff);
        mainCharacter.addToInventory(buff);
        mainCharacter.addToInventory(buff);
        mainCharacter.addToInventory(armorSet);
        mainCharacter.showInventory();
        // Story message that tells the player where they're headed next
        System.out.println("\nCongratulations hero, you have defeated the first of the Phantom Generals! \nThis feat has never been accomplished before, you might truly be the chosen one after all...\nI recommend you head to [TBD] next in order to hunt down [TBD]. Good luck, hero.\n");
    }

    // This is the second scenario the player will be placed in
    public static void ScenarioTwo(Character mainCharacter, Scanner scan){
       // test that scenario 2 activates before the game closes
        System.out.println("Scenario 2");
        // enter actual scenario 2 stuff
    }

    public void ScenarioThree(){
        //Placeholder
    }
}