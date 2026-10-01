public class Main {

    public static void main(String[] args) {

        Character character = new Character("Arthas");

        Ability fireball = new Fireball();
        Ability heal = new Heal();
        Ability dash = new Dash();

        System.out.println("=== СПОСОБНОСТИ ПЕРСОНАЖА===");
        character.useAbility(fireball);
        character.useAbility(dash);


        AppliedEnchantment enchantment = new AppliedEnchantment("Огонь");


        Weapon sword = new Weapon(
                        "Пламенный меч",
                        50,
                        enchantment
                );

        Armor armor = new Armor(
                        "Стальная броня",
                        30
                );

        Potion potion = new Potion(
                        "Крупное зелье лечения",
                        40
                );

        character.getInventory().addItem(sword);
        character.getInventory().addItem(armor);
        character.getInventory().addItem(potion);
        character.getInventory().showItems();
        character.getInventory().useAllItems();

    }

}