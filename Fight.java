import java.util.Scanner;

public class Fight {
    
    /**
     * vs method. You call it by doing Fight.vs([args])
     * @param mc Character object. Our wonderful main character
     * @param mon Monster object. Whatever poor soul is about to get obliterated.
     * @param scan No resource leak here buddy.
     */
    // public static void vs(Character mc, Monster mon, Scanner scan){
    //     int turnCount = 1;

    //     //While loop continues until one gets JFkd (they die)
    //     while(mc.getHealth() != 0 && mon.getHealth() != 0){
    //         System.out.println("\nTurn: " + turnCount);
    //         System.out.println("What action would you like to take?:\n" + //
    //                 "1: Attack\n" + //
    //                 "2: Defend\n" +//
    //                 "3: Use an item\n");  
    //         //Scanne the playere
    //         String userChoice = scan.nextLine();
    //         switch(userChoice){
    //             //Attake the mon
    //             case "1":
    //             mc.attack(mon);
    //             if(mon.getHealth() > 0)
    //                 mon.attack(mc);
    //             break;
    //             //Defende da mon
    //             case "2":
    //                 mon.weakAttack(mc);
    //                 break;
    //             /* *
    //              * Displays a list of the user's inventory. They can pick an item to use, or leave
    //              */
    //             case "3":
    //                 System.out.println("What item would you like to use? \nTO EXIT TYPE 0");
    //                 mc.showInventory();
    //                 userChoice = scan.nextLine();
    //                 /**Right here is where an item would be used, need to think of a way to do it.
    //                  * For now just enter anything to exit it.
    //                  */ 
    //                 break;
    //             //Buffe da dong
    //             case "SEXO??":
    //                 System.out.println("Ur attack got a small buff");
    //                 mc.setAttackPower(9999999);
    //             //User couldn't type a damn number
    //             default:
    //                 System.out.println("Enter something stupid");
    //         }
    //         turnCount++;
    //     }
    // } 
    public static void vs(Character mc, Monster mon, Scanner scan) {
        int turnCount = 1;

        // While loop continues until one dies
        while (mc.getHealth() > 0 && mon.getHealth() > 0) {
            System.out.println("\nTurn: " + turnCount);
            System.out.println("What action would you like to take?:\n" +
                    "1: Attack\n" +
                    "2: Defend\n" +
                    "3: Use an item\n");

            // Scan the player
            String userChoice = scan.nextLine();
            switch (userChoice) {
                // Attack the monster
                case "1":
                    mc.attack(mon);
                    if (mon.getHealth() > 0)
                        mon.attack(mc);
                    break;
                // Defend against the monster
                case "2":
                    mon.weakAttack(mc);
                    break;
                // Use an item
                case "3":
                    boolean itemUsed = false;
                    while (!itemUsed) {
                        System.out.println("What item would you like to use? \nTO EXIT TYPE 0");
                        mc.showInventory();
                        userChoice = scan.nextLine();

                        switch (userChoice) {
                            case "0":
                                // Exit the item selection
                                itemUsed = true;
                                break;
                            default:
                                try {
                                    // Convert the user's input to an integer
                                    int itemIndex = Integer.parseInt(userChoice);

                                    // Check if the entered index is valid
                                    if (itemIndex >= 1 && itemIndex <= mc.getInventorySize()) {
                                        // Get the selected item
                                        Item selectedItem = mc.getItemFromInventory(itemIndex - 1);

                                        // Use the item
                                        selectedItem.use(mc);

                                        // Remove the used item from the inventory
                                        mc.removeItemFromInventory(itemIndex - 1);

                                        itemUsed = true;
                                    } else {
                                        System.out.println("Invalid item index. Please enter a valid index or 0 to exit.");
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Invalid input. Please enter a valid index or 0 to exit.");
                                }
                                break;
                        }
                    }
                    break;
                // Buff the character (for fun?)
                case "SEXO??":
                    System.out.println("Your attack got a small buff");
                    mc.setAttackPower(9999999);
                    break;
                // User couldn't type a number
                default:
                    System.out.println("Enter something stupid");
            }
            turnCount++;
        }
    }
}
