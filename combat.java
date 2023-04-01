public class combat {
    private int playerHealth;
    private int playerAttack;
    private int enemyHealth;
    private int enemyAttack;

    /**
     * Takes the main stats for both parties
     * @param playerHealth
     * @param playerAttack
     * @param enemyHealth
     * @param enemyAttack
     */
    public combat(int playerHealth, int playerAttack, int enemyHealth, int enemyAttack){
        this.playerHealth = playerHealth;
        this.playerAttack = playerAttack;
        this.enemyHealth = enemyHealth;
        this.enemyAttack = enemyAttack;
    }

    /**
     * Ngl this is confusing, but enter the attackers atk stat, and the defenders hp stat
     * @param atk
     * @param hp
     */
    public void dmgCalc(int atk, int hp){

    }
}
