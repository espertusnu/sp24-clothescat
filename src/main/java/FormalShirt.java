public class FormalShirt extends Shirt {

    private Tie tie;

    public FormalShirt(int size, Tie tie) {
        super(size);
        this.tie = tie;
    }

    @Override
    public void addButton(Button button) {
        if (button.fancy) {
            super.addButton(button);
        }
    }

    public class Tie {
    }
}
