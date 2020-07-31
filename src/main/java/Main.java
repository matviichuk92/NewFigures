public class Main {
    public static void main(String[] args) {
        int randomForLoop = (int) (Math.random() * 10);
        for (int i = 0; i < randomForLoop; i++) {
            int randomForConstructor = (int) (Math.random() * (10-2));
            int randomForSwitch = (int) (Math.random() * 4);
            switch (randomForSwitch) {
                case 1:
                    Figures figures = new Square(randomForConstructor);
                    System.out.println("Фігура: " + figures.getDraw());
                case 2:
                    Figures figures1 = new Circle(randomForConstructor);
                    System.out.println("Фігура: " + figures1.getDraw());
                case 3:
                    Figures figures2 = new Trapeze(randomForConstructor, randomForConstructor * 2, randomForConstructor);
                    System.out.println("Фігура: " + figures2.getDraw());
                default:
                    Figures figures3 = new Triangle(randomForConstructor, randomForConstructor);
                    System.out.println("Фігура: " + figures3.getDraw());
            }
        }
    }
}
