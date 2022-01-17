package Taksopark.Black;

import Taksopark.Taksi;

public class LexusLX extends TaksiBlack {
    double priceKm = 2.5;
    double price = 120000;
    double fuelConsumption = 17;
    int yearOfRelease;
    String marka;
    int maxSpeed = 250;
    public LexusLX (int yearOfRelease){
        marka = "Lexus";
        model = "LX";
        copasity = 5.7;
        bodyType = "Cruiser";
        super.price = price;
        this.yearOfRelease = yearOfRelease;
        super.fuelConsumption = fuelConsumption;
        super.maxSpeed = maxSpeed;
    }
    public String toString() {
        return ("---" + fuelConsumption + " " + nameOfClass + " " + priceKm + "km" + " " + marka + " " + model + " "
                + bodyType + " " + copasity + "l" + yearOfRelease + " " + price);
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
}
