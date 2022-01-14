package Taksopark.Select;

public class WolkswagenPassien extends TaksiSelect {
    double priceKm = 1.2;
    double price = 38000;
    public WolkswagenPassien() {
        super.marka = "Wolkswagen";
        model = "Passat";
        bodyType = "Universal";
        copasity = 1.8;
    }

    public String toString() {
        return ("---" + " " + nameOfClass + " " + priceKm + "km" + " " + marka + " " + model + " "
                + bodyType + " " + copasity + "l" + yearOfRelease + " " + price);
    }
}
