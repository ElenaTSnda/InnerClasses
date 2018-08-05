public class Main {
    public static void main(String[] args) {
        // 1. Можно ли реализовать класс AirplaneEngine (двигатель) как внутренний класс для класса Airplane (самолет)?
        // В каком случае внутренний класс имеет смысл объявлять открытым/защищенным?
        // Определите сласс Engine внутри класса AirplaneEngine. Вынесите в отдельный интерфейс IEngine методы класса AirplaneEngine
        // и реализуйте их в классе AirplaneEngine. Определите класс Airplane, имеющий несколько двигателей.
        // 2. Создайте открытый интерфейс, содержащий хотя бы один метод. Реализуйте его в закрытом внутреннем классе.
        // Дополните внешний класс порождающим методом, который возвращает ссылку на созданный объект внутреннего класса.
        // Какой вид классов предпочтительнее при этом использовать: внутренний или вложенный?
        // 3. Повторите предыдущее задание, определив внутренний класс внутри порождающего метода.
        // 4. Повторите предыдущее задание, определив вместо локального внутреннего класса анонимный.

        System.out.println("Task 1");
        Airplane airplane = new Airplane("AN-124");
        System.out.println(airplane.getAirplane() + " is ready to conquer the sky.");
        Airplane.AirplaneEngine airplaneEngine = airplane.new AirplaneEngine("231567", 2009);
        airplaneEngine.start();
        airplaneEngine.fly();
        airplaneEngine.stop();
        System.out.println(" ");

        System.out.println("Task 2");
        Ship ship = new Ship();
        System.out.println(ship.creatingShipEngine("7q938w")); // WTF
        System.out.println(" ");

        System.out.println("Task 3");
        IEngine carEngine = Car.creatingCarEngine();
        carEngine.start();
        carEngine.fly();
        carEngine.stop();
        System.out.println(" ");

        System.out.println("Task 4");




    }
}
