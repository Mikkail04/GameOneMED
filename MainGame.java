import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        // GameGUI game = new GameGUI(); 
        
        Game();
    }
    public static void Game(){
        System.out.println("-----------------PHANTHOM VEIL-----------------");
        System.out.println("\nBrave Warrior what is your name?\n");
        Scanner scan = new Scanner(System.in);

        String player = scan.nextLine();

        Character mainCharacter = new Character(100,10,player);
        Monster goblin = new Monster(50,99,"Goblin");

        System.out.println("Welcome Young Blood, for your first Task I want you to defeat that goblin over there\n");

        fight(mainCharacter, goblin);
    }

    //tbh I dont really got a plan for this one
    public static void fight(Character mc, Monster mon){
        int turnCount = 1;
        Scanner scan = new Scanner(System.in);

        while(mc.getHealth() != 0 && mon.getHealth() != 0){
            System.out.println("\n\nTurn: " + turnCount);
            System.out.println("Pick a move lil bro Your options are:\\n" + //
                    "Attack\\n" + //
                    "Defend\\n");  
            String opt = scan.nextLine();
            switch(opt){
                case "Attack":
                mc.attack(mon);
                mon.attack(mc);
                    break;
                case "Defend":
                    mon.weakAttack(mc);
                    break;
                case "SEXO??":
                    System.out.println("Ur attack got a small buff");

                    mc.setAttackPower(9999999);
                default:
                    System.out.println("Enter something stupid");
            }
            turnCount++;
        }
    }
}
