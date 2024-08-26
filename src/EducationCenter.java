import java.time.LocalDate;

public abstract class EducationCenter {
    final String name;
    final String locatedCountry;
    final LocalDate foundationYear;

    public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }
}