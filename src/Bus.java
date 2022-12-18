public class Bus extends Car implements Competing{
    private BodyType bodyType;
    private ChooseDriver driver;
    public Bus(String brand, String model, double engineVolume, BodyType bodyType, ChooseDriver driver) {
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
        EXTRASMALL("до 10 мест"), SMALL("до 25 мест"), MEDIUM("40-50 мест"), LARGE("60-80 мест"), EXTRALARGE("100-120 мест");
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
            System.out.println("Тип авто - " + bodyType);
        }
    }

    @Override
    public boolean Service() {
        System.out.println("Автобус "+getBrand()+getModel()+ " в диагностике не нуждается");
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
}
