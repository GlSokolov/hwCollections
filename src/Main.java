import java.sql.Driver;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void space() {
        System.out.println("===============================================================");
    }
    public static void main(String[] args) {
        ChooseDriver<PassengerCar> driverB = new ChooseDriver<>("Глеб", true, 3);
        ChooseDriver<FreightCar> driverC = new ChooseDriver<>("Никита", true, 4);
        ChooseDriver<Bus> driverD = new ChooseDriver<>("Рустам", true, 5);
        ChooseDriver<Car> driverBCD = new ChooseDriver<>("Судья", true, 6);

        PassengerCar lada = new PassengerCar("Лада", "Гранта", 1.6, PassengerCar.BodyType.HATCHBACK,driverB);
        PassengerCar alteeza = new PassengerCar("Тайота", "Альтеза", 2.0, PassengerCar.BodyType.SEDAN,driverB);
        PassengerCar chaser = new PassengerCar("Тайота", "Чайзер", 2.5, PassengerCar.BodyType.SEDAN,driverB);
        PassengerCar sera = new PassengerCar("Тайота", "Сера", 1.5, PassengerCar.BodyType.COUPE,driverB);

        FreightCar kamaz = new FreightCar("КАМаз", "356", 4.0, FreightCar.BodyType.N1, driverC);
        FreightCar volvo = new FreightCar("Вольво", "123", 4.5, FreightCar.BodyType.N1,driverC);
        FreightCar mercedes = new FreightCar("Мерседес", "2346", 5.0, FreightCar.BodyType.N1,driverC);
        FreightCar man = new FreightCar("МАН", "26485", 6.0, FreightCar.BodyType.N2,driverC);

        Bus ikarus = new Bus("Икарус", "55", 2.0, Bus.BodyType.MEDIUM, driverD);
        Bus GAZel = new Bus("Газель", "Next", 1.6, Bus.BodyType.SMALL,driverD);
        Bus PAZ = new Bus("Паз", "32053", 2.5, Bus.BodyType.MEDIUM,driverD);
        Bus fiat = new Bus("Фиат", "228", 2.0, Bus.BodyType.SMALL,driverD);

        Mechanic serega = new Mechanic<PassengerCar>("Серега", "Золотые руки", "ИП");

        Sponsor tatneft = new Sponsor("Татнефть", 350_000);
        Sponsor tatneft2 = new Sponsor("Татнефть", 350_000);
        Sponsor lukoil = new Sponsor("Лукоил", 220_000);

        sera.addMechanic(serega);
        sera.addSponsor(tatneft);
        sera.addSponsor(tatneft2);
        sera.addSponsor(lukoil);
        System.out.println(sera);

        space();

        driverB.getDriverInfo(sera);
        driverB.getDriverInfo(chaser);
        driverC.getDriverInfo(man);
        driverD.getDriverInfo(fiat);
        driverBCD.getDriverInfo(sera);
        driverBCD.getDriverInfo(man);
        driverBCD.getDriverInfo(fiat);

space();
        service(sera, chaser, man, fiat,ikarus,lada);
space();
        Random random = new Random();
        Set<Exercise> exercises = new HashSet<>();
        while (exercises.size() < 15) {
            Exercise exercise = new Exercise(random.nextInt(10), random.nextInt(10));
            exercises.add(exercise);
            System.out.println(exercise);
        }
space();
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("1962 658974", "Сашка", "Сашкович", "СТол как стол", LocalDate.now().minusYears(30)));
        passports.add(new Passport("1962 658974", "Лешка", "Алешкович", "СТол как стол", LocalDate.now().minusYears(30)));
        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);
    }

    public static void service (Car... cars) {
        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].Service()) {
                throw new RuntimeException("Автомобиль "+cars[i].getBrand()+" "+cars[i].getModel()+ " не прошел диагностику");
            }
        }
    }

    // Какой из этих коллекций понадобится меньше времени на выполнение данного метода при большом наборе данных? Почему?
    // 1.ArrayList.
    // 2.LinkedList.
    // 3.HashSet.
    // Ответ: 3. Так как Array&LinkedList проверяют каждый элемент обьекта первого списка с элементоми обьектов второго, что затягивает проверку по времени.
    // HashSet же берет полный хешкод проверяемого обьекта и сравнивает его с хешкодом второго.
}