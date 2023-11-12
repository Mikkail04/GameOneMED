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

        System.out.println("Welcome Young Blood, for your first Task I want you to defeat that goblin over there\n");

        fight(mainCharacter, goblin);
        Item potion = new Item(10, "Healing Potion"); /* This is just testing the inventory system */
        System.out.println("Here is a potion for your hard fought victory!");
        mainCharacter.addToInventory(potion); // Ngl idk why I needed to do mainCharacter first for the methods to work
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

    //tbh I dont really got a plan for this one
    public static void fight(Character mc, Monster mon){
        int turnCount = 1;
        Scanner scan = new Scanner(System.in);

        //Goes until one gets JFkd
        while(mc.getHealth() != 0 && mon.getHealth() != 0){
            System.out.println("\n\nTurn: " + turnCount);
            System.out.println("Pick a move lil bro Your options are:\n" + //
                    "1: Attack\n" + //
                    "2: Defend\n");  
            //Scanne the playere
            String opt = scan.nextLine();
            switch(opt){
                //Attake the mon
                case "1":
                mc.attack(mon);
                if(mon.getHealth() > 0)
                    mon.attack(mc);
                break;
                //Defende da mon
                case "2":
                    mon.weakAttack(mc);
                    break;
                //SEXO????????????????????????
                case "SEXO??":
                    System.out.println("Ur attack got a small buff");
                    mc.setAttackPower(9999999);
                default:
                    System.out.println("Enter something stupid");
            }
            turnCount++;
        }
        scan.close();
    }
}