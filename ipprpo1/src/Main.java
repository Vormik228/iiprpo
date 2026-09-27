public class Main {

    public static void main(String[] args) {

        Character character = new Character("Arthas");

        Ability fireball = new Fireball();
        Ability heal = new Heal();
        Ability dash = new Dash();

        System.out.println("=== ABILITIES ===");
        character.useAbility(fireball);
        character.useAbility(heal);
        character.useAbility(dash);


        AppliedEnchantment enchantment = new AppliedEnchantment("Огонь");


        Weapon sword = new Weapon(
                        "Fire blade",
                        50,
                        enchantment
                );

        Armor armor = new Armor(
                        "Iron armor",
                        30
                );

        Potion potion = new Potion(
                        "Healing flask",
                        40
                );

        character.getInventory().addItem(sword);
        character.getInventory().addItem(armor);
        character.getInventory().addItem(potion);
        character.getInventory().showItems();
        character.getInventory().useAllItems();

    }

}