public class Circle extends Figures {
    int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    public String getDraw() {
        return "коло, площа: " + getArea() + " кв. од., радіус: " + getRadius() + " од., колір: " + getColor();
    }

    public int getRadius() {
        return radius;
    }
}
