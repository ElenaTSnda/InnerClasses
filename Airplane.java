import java.util.ArrayList;
import java.util.Objects;

public class Airplane {
    // Task 1
    private String name;
    private ArrayList<AirplaneEngine> engines = new ArrayList<>(3);
    private boolean systemIsChecked = true;
    private int fuelCapacity = 200;

    public Airplane(String name) {

        this.name = name;
        AirplaneEngine airplaneEngine = new AirplaneEngine("12983", 2001);
        engines.add(airplaneEngine);
        airplaneEngine = new AirplaneEngine("943w8", 1995);
        engines.add(airplaneEngine);
        airplaneEngine = new AirplaneEngine("1029f", 2013);
        engines.add(airplaneEngine);
    }

    public String getAirplane() {
        return name;
    }

    public int addSomeFuel(int neededAmmount) {
        return fuelCapacity + neededAmmount;
    }

    public class AirplaneEngine implements IEngine { //либо объявить абстрактным

        private String identifier;
        private int yearOfProduction;
        private boolean systemIsWorking = true; // или лучше вынести в конструктор?

        public AirplaneEngine(String identifier, int yearOfProduction) {

            this.identifier = identifier;
            this.yearOfProduction = yearOfProduction;
        }

        @Override
        public void start() {
            if(systemIsChecked){
                System.out.println("AirplaneEngine #" + identifier + " system is checked and ready to start.");
            } else {
                System.out.println("Something is wrong with engine #" + identifier + ". It can't be started.");
            }
        }

        @Override
        public void fly() {
            if(fuelCapacity >= 300) {
                System.out.println("Starting flying.");
            } else {
                System.out.println("Fuel tank is almost empty. Attention, refueling is needed.");
            }
            int refueling = addSomeFuel(200);
            if(refueling >= 300){
                System.out.println("The plane was successfully refueled and ready to fly.");
            }
        }

        @Override
        public void stop() {
            systemIsWorking = false;
                System.out.println("The plane arrived at the destination and the engine #" + identifier + " stopped its work.");
        }

        class Engine implements IEngine{

            @Override
            public void start() {
                System.out.println("Engine started its work.");
            }

            @Override
            public void fly() {
                System.out.println("The plane is flying.");
            }

            @Override
            public void stop() {
                System.out.println("Engine stopped its work.");
            }
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return systemIsChecked == airplane.systemIsChecked &&
                fuelCapacity == airplane.fuelCapacity &&
                Objects.equals(name, airplane.name) &&
                Objects.equals(engines, airplane.engines);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, engines, systemIsChecked, fuelCapacity);
    }
}
