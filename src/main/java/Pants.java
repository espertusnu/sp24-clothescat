public class Pants implements IClothing {

    private int size;

    public Pants(int size) {
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

    public void setSize(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Negative size");
        }
        this.size = size;
    }
}
