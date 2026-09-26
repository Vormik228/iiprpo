public class AppliedEnchantment {

    private String type;

    public AppliedEnchantment(String type) {
        this.type = type;
    }

    public void activate() {
        System.out.println("Активировано зачарование: " + type);
    }

}