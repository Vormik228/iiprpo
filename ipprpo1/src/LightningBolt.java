public class LightningBolt implements Ability {

    @Override
    public void use(Character character) {
        System.out.println(character.getName() + " использует Lightning Bolt! ⚡");
    }
}
