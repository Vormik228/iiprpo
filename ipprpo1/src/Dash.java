public class Dash implements Ability {

    public int getManaCost() {
        return 15;
    }
    @Override
    public void use(Character character) {
        System.out.println(character.getName() + " использует Dash! 💨");
    }

}