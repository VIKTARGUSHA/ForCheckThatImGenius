package Taksopark.X;

import Taksopark.X.TaksiX;

public class XcarLogan extends TaksiX {
    double priceKm;
    public XcarLogan(){
        this.priceKm = 0.8;
        this.marka = "Renault";
        this.model = "Logan";
        this.bodyType = "Sedan";
        this.copasity = 1.4;
    }
    public String toString (){
        return ("---" + priceKm + "BYN" + " " + marka + " " + model + " " + bodyType + " " + copasity + "L" + " ");
    }
}
