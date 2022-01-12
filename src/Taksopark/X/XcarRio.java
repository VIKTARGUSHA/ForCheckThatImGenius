package Taksopark.X;

import Taksopark.X.TaksiX;

public class XcarRio extends TaksiX {
        double priceKm = 0.6;
    public XcarRio() {
        super.marka = "Kia";
        model ="Rio";
        bodyType = "Hatchback";
        copasity = 1.4;
    }
    public String toString(){
        return ("---" + priceKm + "km" + " " + marka + " " + model + " " + bodyType + " " + copasity + "l" );
    }
}