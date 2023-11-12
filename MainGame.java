import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        // GameGUI game = new GameGUI(); 
        
        Game();
    }
    public static void Game(){
        System.out.println("-----------------PHANTHOM VEIL-----------------");
        System.out.println("\nBrave Warrior what is your name? ");
        Scanner scan = new Scanner(System.in);
        String player = scan.nextLine();
        //Our mc
        Character mainCharacter = new Character(100,10,player);
        //Starter gob
        Monster goblin = new Monster(50,5,"Goblin");

        System.out.println("Welcome Young Blood, for your first task I want you to defeat that goblin over there\n");

        fight(mainCharacter, goblin);

        scan.close();
    }

    //Fight method, takes in the main character and whatever mon he's fighting. 
    public static void fight(Character mc, Monster mon){
        int turnCount = 1;
        Scanner scan = new Scanner(System.in);

        //Goes until one gets JFkd
        while(mc.getHealth() != 0 && mon.getHealth() != 0){
            System.out.println("---------------\nTurn: " + turnCount);
            System.out.println("Pick a move lil bro Your options are:\n" + 
                    "1: Attack\n" + 
                    "2: Defend\n");  
            //Scanne the playere
            String playerChoice = scan.nextLine();
            System.out.println(); //Just to space it out some more
            switch(playerChoice){
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
                    System.out.println("Ay buddy that wasn't an option");
                    turnCount--;
            }
            System.out.print("---------------");
            turnCount++;
        }
        scan.close();
    }
}