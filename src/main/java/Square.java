public class Square extends Figures {

    int side;

    public Square(int side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String getColor() {
        return color();
    }

    public String getDraw() {
        return "квадрат, площа: " + getArea() + " кв. од., довжина сторони: " + getSide() + " од., колір: " + color();
    }

    public int getSide() {
        return side;
    }
}
