public class Trapeze extends Figures {
    private int sideA;
    private int sideB;
    private int height;
    private String color;

    public Trapeze(int sideA, int sideB, int height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0.5 * (sideA + sideB) * height;
    }

    public String getDraw() {
        return "трапеція, площа: " + getArea() + " кв. од., висота: " + getHeight() + " од., колір: " + getColor();
    }

    private double getHeight() {
        return height;
    }
}
