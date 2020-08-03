public class Random {
    private static final int NUMBER_OF_COLOR = 4;
    private static final int NUMBER_OF_FIGURES = 4;
    private static final int MAX_NUMBER_OF_FIGURES = 10;
    private static final int MAX_VALUE = 10;

    private String createColor() {
        Color[] color = Color.values();
        return color[(int) (Math.random() * NUMBER_OF_COLOR)].getColor();
    }

    private int createValue() {
        return (int) (Math.random() * MAX_VALUE + 1);
    }

    public Figures[] createFigureArray() {
        Figures[] figures = new Figures[(int) (Math.random() * MAX_NUMBER_OF_FIGURES + 1)];
        for (int i = 0; i < figures.length; i++) {
            switch ((int) (Math.random() * NUMBER_OF_FIGURES) + 1) {
                case 1:
                    figures[i] = new Circle(createValue(), createColor());
                    break;
                case 2:
                    figures[i] = new Square(createValue(), createColor());
                    break;
                case 3:
                    figures[i] = new Trapeze(createValue(), createValue(), createValue(), createColor());
                    break;
                case 4:
                    figures[i] = new Triangle(createValue(), createValue(), createColor());
                    break;
            }
        }
        return figures;
    }
}
