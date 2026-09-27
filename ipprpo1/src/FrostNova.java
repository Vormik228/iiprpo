public class FrostNova implements Ability {

    public int getManaCost() {
        return 40;
    }
    @Override
        public void use(Character character) {
            System.out.println(character.getName() + " использует Frost Nova! 🧊");
        }
}

