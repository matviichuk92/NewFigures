public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Figures[] figures = random.createFigureArray();
        for (Figures figure : figures) {
            System.out.println(figure.getDraw());
        }
    }
}
