

public class FlyweightButton {
    private int label;

    public FlyweightButton(int label) {
        this.label = label;
        System.out.println("Rodzina Flyweight Buttonów:" + label);
    }

    public void draw(int num) {
        System.out.println(label + " " + num + " " + this.hashCode());
    }
}