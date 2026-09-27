public class LightningBolt implements Ability {

    public int getManaCost() {
        return 25;
    }
    @Override
    public void use(Character character) {
        System.out.println(character.getName() + " использует Lightning Bolt! ⚡");
    }
}
