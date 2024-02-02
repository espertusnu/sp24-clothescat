import java.util.ArrayList;
import java.util.List;

public class Shirt implements IClothing {
    private int size;
    private List<Button> buttons;

    public Shirt(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void fold() {
        System.out.println("Folding");
    }

    public void addButton(Button button) {
        if (buttons == null) {
            buttons = new ArrayList<>();
        }
        buttons.add(button);
    }

    public static class Button {
        public boolean fancy;
    }
}
