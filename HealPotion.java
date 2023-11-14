public class HealPotion implements Item {

    private int healPower;
    private String name;

    public HealPotion(String name, int healPower){
        this.name = name;
        this.healPower = healPower;
    }
    
    @Override
    public void use(){
        System.out.println(name + "used. " + healPower + " health points recovered " );
    }

    @Override
    public String getName(){
        return name;
    }
}
