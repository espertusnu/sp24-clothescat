public class Lion extends Cat {
    public void knead() {
        System.out.println("I am a lion");
        super.knead();
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.knead();
    }
}
