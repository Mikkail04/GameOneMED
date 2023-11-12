public class MainGame {
    public static void main(String[] args) {
        // GameGUI game = new GameGUI(); 
        Character hero = new Character(100,20, "Denny");
        Monster villan = new Monster(120,20,"daniel");
        hero.attack(villan);
    }
}
