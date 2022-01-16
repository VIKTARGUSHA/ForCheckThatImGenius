package Taksopark.X;

import Taksopark.X.TaksiX;

public class XcarLogan extends TaksiX {
    double priceKm;
    double price = 12500;
    double fuelConsumption = 7.0;
    public int maxSpeed = 225;
    public XcarLogan(int yearOfRelease){
        this.priceKm = 0.8;
        this.marka = "Renault";
        this.model = "Logan";
        this.bodyType = "Sedan";
        this.copasity = 1.4;
        super.price = this.price;
        super.fuelConsumption = fuelConsumption;
        super.yearOfRelease = yearOfRelease;
        super.maxSpeed = maxSpeed;
    }
    public String toString (){
        return ("---" + fuelConsumption  + " " + nameOfClass + " " + priceKm + "BYN" + " " + yearOfRelease + " " + " " + marka + " "
                + model + " " + bodyType + " " + copasity + "L" + " " + price);
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
}
