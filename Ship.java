import java.util.Objects;

public class Ship {
    // Task 2
    SteamEngine steamEngine;

    public SteamEngine creatingShipEngine(String s) {
        return new SteamEngine(s);
    }

    private static class SteamEngine implements IEngine { // static?
        String name;

        public SteamEngine(String name) {
            this.name = name;
        }

        public String getSteamEngine(String name) {
            return name;
        }

        @Override
        public void start() {
            System.out.println("The ship engine starts its work.");
        }

        @Override
        public void fly() {
            System.out.println("Unfortunately, ships can't fly :( Only Cosmic :)");
        }

        @Override
        public void stop() {
            System.out.println("The ship engine ends its work.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Objects.equals(steamEngine, ship.steamEngine);
    }

    @Override
    public int hashCode() {

        return Objects.hash(steamEngine);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "steamEngine=" + steamEngine +
                '}';
    }
}
