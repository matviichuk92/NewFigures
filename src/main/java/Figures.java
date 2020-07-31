abstract public class Figures {

    public abstract double getArea();

    public abstract String getColor();

    public abstract String getDraw();

    public String color() {
        int color = (int) (Math.random() * 4);
        switch (color) {
            case 1:
                return "червоний";
            case 2:
                return "зелений";
            case 3:
                return "синій";
            default:
                return "білий";
        }
    }
}
