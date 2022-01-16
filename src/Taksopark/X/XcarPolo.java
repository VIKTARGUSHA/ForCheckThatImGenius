package Taksopark.X;

import Taksopark.X.TaksiX;

public class XcarPolo extends TaksiX {
    double priceKm;
    double price = 10328;
    double fuelConsumption = 43.0;
    public int maxSpeed = 380;
    public XcarPolo(int yearOfRelease){
        this.priceKm = 0.8;
        this.marka = "Volkswagen";
        this.model = "Polo";
        this.bodyType = "sedan";
        this.copasity = 1.6;
        super.price = this.price;
        super.fuelConsumption = fuelConsumption;
        super.maxSpeed = maxSpeed;
    }
    public String toString(){
        return ("---" + fuelConsumption + " " + "X" + priceKm + " " + marka + " " + model + " " + bodyType + " " + copasity + " " + price +"---");
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
}
