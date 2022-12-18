import java.util.Objects;

public class PassengerCar extends Car implements Competing{
    private BodyType bodyType;
    private ChooseDriver driver;
    public PassengerCar(String brand, String model, double engineVolume, BodyType bodyType, ChooseDriver driver) {
        super(brand, model, engineVolume);
        setBodyType(bodyType);
        setDriver(driver);
    }
    public void StartMove() {
        System.out.println("Поехали!");
    }
    public void EndMove() {
        System.out.println("Приехали!");
    }

    public enum BodyType {
        SEDAN("Седан"), HATCHBACK("Хечбек"), COUPE("Купе"), UNIVERSAL("Универсал"), SUV("Внедорожник"), CROSSOVER("Кроссовер"), PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивен");
        final String translate;
        BodyType(String translate) {
            this.translate = translate;
        }
    }

    @Override
    public void PrintType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Автомобиль - " +getBrand()+ " "+getModel()+ " | Тип авто - " + bodyType);
        }
    }

    @Override
    public boolean Service() {
        System.out.println("Автомобиль "+getBrand()+getModel()+ " прошел диагностику");
        return true;
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль:" + getBrand() + " " + getModel());
        System.out.println("Смена шин");
        System.out.println("Дозаправка топлива");
    }
    @Override
    public void bestLapTime(double timeLap) {
        System.out.println("Лучшее время круга "+getBrand()+" "+getModel()+" - "+timeLap+"мин.");
    }
    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("Максимальная скорость "+getBrand()+" "+getModel()+" - "+maxSpeed+"км*ч");
    }

    public BodyType getBodyType() {
        return bodyType;
    }
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public ChooseDriver getDriver() {
        return driver;
    }

    public void setDriver(ChooseDriver driver) {
        this.driver = driver;
    }
    @Override
    public String toString() {
        return  super.toString()+"Водитель: "+driver+ "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return bodyType == that.bodyType && Objects.equals(driver, that.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType, driver);
    }
}