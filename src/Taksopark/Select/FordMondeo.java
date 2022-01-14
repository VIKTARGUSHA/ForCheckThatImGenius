package Taksopark.Select;

public class FordMondeo extends TaksiSelect{
    double priceKm = 1.3;
    double price = 33.0;
    double fuelConsumption = 8.0;
    public FordMondeo(int yearOfRelyse){
        super.marka = "Ford";
        model = "Mondeo";
        bodyType = "Sedan";
        copasity = 1.6;
        super.price = this.price;
    }

    public String toString() {
        return ("---" + nameOfClass + " " + priceKm + "km" + " " + marka + " " + model + " " + bodyType + " " + copasity + "l"
                + yearOfRelease + " " + price);
    }
    }

