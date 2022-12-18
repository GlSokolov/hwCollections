import java.util.Objects;

public class Sponsor {
    private final String name;
    private final int amountOfSupport;

    public Sponsor(String name, int amountOfSupport) {
        this.name = name;
        this.amountOfSupport = amountOfSupport;
    }
    public int getAmountOfSupport() {
        return amountOfSupport;
    }

    public void sponsorRace () {

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return amountOfSupport == sponsor.amountOfSupport && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amountOfSupport);
    }
}
