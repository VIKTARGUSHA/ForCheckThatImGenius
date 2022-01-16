package Taksopark.Select;

public class WolkswagenPassien extends TaksiSelect {
    double priceKm = 1.2;
    double price = 38000;
    double fuelConsumption = 15.5;
    int maxSpeed =360;
    public WolkswagenPassien() {
        super.marka = "Wolkswagen";
        model = "Passat";
        bodyType = "Universal";
        copasity = 1.8;
        super.price = this.price;
        super.fuelConsumption = fuelConsumption;
        super.maxSpeed = maxSpeed;
    }

    public String toString() {
        return ("---" + fuelConsumption + " " + " " + nameOfClass + " " + priceKm + "km" + " " + marka + " " + model + " "
                + bodyType + " " + copasity + "l" + yearOfRelease + " " + price);
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
}
