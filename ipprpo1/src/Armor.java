public class Armor extends Item {

    private int defense;

    public Armor(String name, int defense) {
        super(name);
        this.defense = defense;
    }

    @Override
    public void use() {
        System.out.println("Надета броня: " + getName() + ". Защита: " + defense);
    }

}