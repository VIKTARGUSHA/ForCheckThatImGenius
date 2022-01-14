package Taksopark.X;

import Taksopark.X.TaksiX;

public class XcarPolo extends TaksiX {
    double priceKm;
    double price = 10328;
    double fuelConsumption = 43.0;
    public XcarPolo(int yearOfRelease){
        this.priceKm = 0.8;
        this.marka = "Volkswagen";
        this.model = "Polo";
        this.bodyType = "sedan";
        this.copasity = 1.6;
        super.price = this.price;
    }
    public String toString(){
        return ("---" + "X" + priceKm + " " + marka + " " + model + " " + bodyType + " " + copasity + " " + price +"---");
    }
}
