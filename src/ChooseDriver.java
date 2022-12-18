public class ChooseDriver <C extends Car> extends Driver {
    public ChooseDriver(String fio, boolean driverLicense, int standing) {
        super(fio, driverLicense, standing);
    }

    @Override
    public void StartMove() {
        System.out.println("Водитель " + getFio() + " заправляется");
    }
    @Override
    public void EndMove() {
        System.out.println("Водитель " + getFio() + " остановился");
    }
    @Override
    public void refuel() {
        System.out.println("Водитель " + getFio() + " поехал");
    }

    public void getDriverInfo (C Car) {
        System.out.println("Водитель " +getFio()+ " управляет автомобилем " +Car.getBrand()+ " " +Car.getModel()+ " и будет учасвтвовать в заезде");
    }
}
