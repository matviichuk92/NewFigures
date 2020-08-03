public class Square extends Figures {
    private int side;
    private String color;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return side * side;
    }

    public String getDraw() {
        return "квадрат, площа: " + getArea() + " кв. од., довжина сторони: " + getSide() + " од., колір: " + getColor();
    }

    public int getSide() {
        return side;
    }
}
