import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {

        items.add(item);
        System.out.println(item.getName() + " добавлен в инвентарь.");
    }

    public void showItems() {

        System.out.println("\nИнвентарь:");
        for (Item item : items) {
            System.out.println("- " + item.getName());
        }
    }

    public void useAllItems() {

        System.out.println("\nИспользование предметов:");
        for (Item item : items) {
            item.use();
        }
    }

}