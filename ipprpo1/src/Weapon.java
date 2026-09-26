public class Weapon extends Item {

    private int damage;
    private AppliedEnchantment enchantment;

    public Weapon(String name, int damage,
                  AppliedEnchantment enchantment) {

        super(name);

        this.damage = damage;
        this.enchantment = enchantment;
    }

    @Override
    public void use() {

        System.out.println("Используется оружие: " + getName() + ". Урон: " + damage);

        if (enchantment != null) {
            enchantment.activate();
        }
    }

}