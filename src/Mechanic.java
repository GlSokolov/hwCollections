public class Mechanic<C extends Car> {
    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public void doService(C car){
        car.Service();
    }

    public void doRepair(){}

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return  name +" "+ surname;
    }
}
