 public class BuffPotion implements Item {

    private int buffAtk;
    private String name;

    public BuffPotion(String name, int buffAtk){
        this.name = name;
        this.buffAtk = buffAtk;
    }

    @Override
    public void use(){
        System.out.println(name + " buffs attack by " + buffAtk + " points");
    }

    @Override
    public String getName(){
        return name;
    }
}
