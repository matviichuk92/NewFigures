public class Triangle extends Figures {

    int katetA;
    int katetB;

    public Triangle(int katetA, int katetB) {
        this.katetA = katetA;
        this.katetB = katetB;
    }

    public double getArea() {
        return 0.5 * katetA * katetB;
    }

    public String getColor() {
        return color();
    }

    public String getDraw() {
        return "трикутник, площа: " + getArea() + " кв. од., довжина гіпотенузи: " + getHipoyenuse() + " од., колір: " + color();
    }

    public int getHipoyenuse() {
        return (int) Math.sqrt((Math.pow(katetA, 2) + Math.pow(katetB, 2)));
    }
}
