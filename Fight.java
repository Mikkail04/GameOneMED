import java.util.Scanner;

public class Fight {

    /*
     * Fight.vs(maincharacter, whatever the fuck they fighting);
     * Doing it like this means I can do let the mc get jumped later, though thats a pain to add.
     */
    public static void vs(Character mc, Monster mon){
        int turnCount = 1;
        Scanner scan = new Scanner(System.in);

        //Goes until one gets JFkd
        while(mc.getHealth() != 0 && mon.getHealth() != 0){
            System.out.println("\n\nTurn: " + turnCount);
            System.out.println("What action would you like to take?:\n" + //
                    "1: Attack\n" + //
                    "2: Defend\n" +//
                    "3: Use an item\n");  
            //Scanne the playere
            String userChoice = scan.nextLine();
            switch(userChoice){
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
                /* *
                 * This one gonna be dumb. Prob not the best way to do it but ima use another switch case. Later gonna have to 
                 * display a list of all the user's items
                 */
                case "3":
                    System.out.println("What item would you like to use?");
                    mc.showInventory();
                    userChoice = scan.nextLine();
                    //Right here is where an item would be used, need to think of a way to do it.
                    break;
                //Buffe da dong
                case "SEXO??":
                    System.out.println("Ur attack got a small buff");
                    mc.setAttackPower(9999999);
                //User couldn't type a damn number
                default:
                    System.out.println("Enter something stupid");
            }
            turnCount++;
        }
        scan.close();
    }
}
