public class Car {
    // Task 2
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public static IEngine creatingCarEngine() {

        class CarEngine implements IEngine { // private/public is not allowed here

            @Override
            public void start() {
                System.out.println("CarEngine is started.");
            }

            @Override
            public void fly() {
                System.out.println("Unfortunately, cars can't fly :(");
            }

            @Override
            public void stop() {
                System.out.println("CarEngine has stopped its work.");
            }
        }
        return new CarEngine();
    }
}
