public class ElectricCar {
    // Task 4
    private String brand;

    public ElectricCar(String brand) {
        this.brand = brand;
    }

    public String creatingElectricCarEngine() {
        return brand {
//           как анонимный класс может implements IEngine ????

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

}
