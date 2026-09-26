public class Main {

    public static void main(String[] args) {

        Character character = new Character("Arthas");

        Ability fireball = new Fireball();
        Ability heal = new Heal();
        Ability dash = new Dash();

        System.out.println("=== СПОСОБНОСТИ ===");
        character.useAbility(fireball);
        character.useAbility(heal);
        character.useAbility(dash);


        AppliedEnchantment enchantment = new AppliedEnchantment("Огонь");


        Weapon sword = new Weapon(
                        "Огненный меч",
                        50,
                        enchantment
                );

        Armor armor = new Armor(
                        "Железная броня",
                        30
                );

        Potion potion = new Potion(
                        "Зелье лечения",
                        40
                );

        character.getInventory().addItem(sword);
        character.getInventory().addItem(armor);
        character.getInventory().addItem(potion);
        character.getInventory().showItems();
        character.getInventory().useAllItems();

    }

}