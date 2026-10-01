public class Potion extends Item {

    private int healing;

    public Potion(String name, int healing) {
        super(name);
        this.healing = healing;
    }

    @Override
    public void use() {
        System.out.println("Использовано зелье: " + getName()
                + ". Восстановлено HP: " + healing);
    }

}