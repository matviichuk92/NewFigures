public class Triangle extends Figures {
    private int katetA;
    private int katetB;
    private String color;

    public Triangle(int katetA, int katetB, String color) {
        this.katetA = katetA;
        this.katetB = katetB;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0.5 * katetA * katetB;
    }

    public String getDraw() {
        return "трикутник, площа: " + getArea() + " кв. од., довжина гіпотенузи: " + getHipoyenuse()
                + " од., колір: " + getColor();
    }

    public int getHipoyenuse() {
        return (int) (Math.sqrt((Math.pow(katetA, 2) + Math.pow(katetB, 2))));
    }
}
