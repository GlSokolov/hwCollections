import java.util.Objects;
import java.util.Set;

public class PassportList {
    private Set<Passport> passports;

    public PassportList(Set<Passport> passports) {
        this.passports = passports;
    }

    public void add (Passport passport) {
        Passport old = get(passport.getNumber());
        if (old!=null) {
            passports.remove(old);
            passports.add(passport);
        }
    }

    public Passport get(String number){
        for (Passport passport: passports){
            if (passport.getNumber().equals(number)){
                return passport;
            }
        }return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassportList that = (PassportList) o;
        return Objects.equals(passports, that.passports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passports);
    }

    @Override
    public String toString() {
        return passports.toString();    }
}
