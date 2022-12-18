import java.util.*;

public abstract class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private final Set<Sponsor> sponsors;
    private final Set<Mechanic<?>> mechanics;
    public Car (String brand, String model, double engineVolume,Sponsor... sponsors) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        this.sponsors = new HashSet<>();
        this.mechanics = new HashSet<>();
    }

    public abstract void StartMove();
    public abstract void EndMove();
    public abstract void PrintType();
    public abstract boolean Service();
    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }
    public void addMechanic(Mechanic<?> mechanic){
        mechanics.add(mechanic);
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public void setBrand(String brand) {
        if (brand == null && brand.isEmpty() && brand.isBlank()) {
            this.brand = "<Информация не указана>";
        } else {this.brand = brand; }
    }
    public void setModel(String model) {
        if (model == null && model.isEmpty() && model.isBlank()) {
            this.model = "<Информация не указана>";
        } else {this.model = model; }
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0 ) {
            this.engineVolume = 1.0;
        } else {
            this.engineVolume = engineVolume;}
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public void printInfo(){
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(sponsors, car.sponsors) && Objects.equals(mechanics, car.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, sponsors, mechanics);
    }

    @Override
    public String toString() {
        return "Car: [" +
                "Брэнд - " + brand +
                ", Марка - " + model +
                ", Обьем двигателя - " + engineVolume +
                "л.]" + " [Механики: "+mechanics+
                ", Спонсора: "+sponsors+", ";
    }
}