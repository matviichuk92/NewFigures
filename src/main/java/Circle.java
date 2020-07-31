public class Circle extends Figures {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    public String getColor() {
        return color();
    }

    public String getDraw() {
        return "коло, площа: " + getArea() + " кв. од., радіус: " + getRadius() + " од., колір: " + color();
    }

    public int getRadius() {
        return radius;
    }
}
