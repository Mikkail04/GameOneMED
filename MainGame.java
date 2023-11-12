import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        // GameGUI game = new GameGUI(); 
        Game();
    }
    public static void Game(){
        System.out.println("-----------------PHANTHOM VEIL-----------------");
        System.out.println("\nBrave Warrior what is your name?\n");

        Scanner userInput = new Scanner(System.in);
        String player = userInput.nextLine();

        Character mainCharacter = new Character(100,10,player);
        Monster goblin = new Monster(50,5,"Goblin");

        System.out.println("Welcome Young Blood, for your first Task I want you to defeat that goblin over there\n");

        mainCharacter.attack(goblin);
    }
}
