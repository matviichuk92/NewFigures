public class Trapeze extends Figures {
    private int sideA;
    private int sideB;
    private int height;

    public Trapeze(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * (sideA + sideB) * height;
    }

    public String getDraw() {
        return "трапеція, площа: " + getArea() + " кв. од., висота: " + getHeight() + " од., колір: " + color();
    }

    private int getHeight() {
        return height;
    }
}
