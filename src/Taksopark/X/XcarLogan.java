package Taksopark.X;

import Taksopark.X.TaksiX;

public class XcarLogan extends TaksiX {
    double priceKm;
    double price = 12500;
    public XcarLogan(int yearOfRelease){
        this.priceKm = 0.8;
        this.marka = "Renault";
        this.model = "Logan";
        this.bodyType = "Sedan";
        this.copasity = 1.4;
    }
    public String toString (){
        return ("---" + " " + nameOfClass + " " + priceKm + "BYN" + yearOfRelease + " " + " " + marka + " "
                + model + " " + bodyType + " " + copasity + "L" + " " + price);
    }
}
