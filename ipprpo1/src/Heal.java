public class Heal implements Ability {

    public int getManaCost() {
        return 20;
    }
    @Override
    public void use(Character character) {
        System.out.println(character.getName() + " использует Heal! ❤️");
    }

}