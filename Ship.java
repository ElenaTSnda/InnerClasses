public class Ship {
    // Task 3
    SteamEngine steamEngine;

    public SteamEngine creatingShipEngine(String s) { // как сюда передавать имя нового объекта SteamEngine?
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

}
