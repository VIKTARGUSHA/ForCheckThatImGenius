package Taksopark.X;

import Taksopark.X.TaksiX;

public class XcarRio extends TaksiX {
        double priceKm = 0.6;
        double price = 15488;
    double fuelConsumption = 3.0;
    public int maxSpeed = 110;
    public XcarRio(int yearOfRelease) {
        super.marka = "Kia";
        model ="Rio";
        bodyType = "Hatchback";
        copasity = 1.4;
        super.price = this.price;
        super.fuelConsumption = fuelConsumption;
        super.maxSpeed = maxSpeed;
    }
    public String toString(){
        return ("---" + fuelConsumption + " " + nameOfClass + " " + priceKm + "km" + " " + yearOfRelease + " "
                + marka + " " + model + " " + bodyType + " " + copasity + "l" + " " + price );
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
}