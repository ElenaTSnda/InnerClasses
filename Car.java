import java.util.Objects;

public class Car {
    // Task 3
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

    // Task 4
    public static IEngine creatingElectricCarEngine() {

        return new IEngine() {

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
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {

        return Objects.hash(brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
