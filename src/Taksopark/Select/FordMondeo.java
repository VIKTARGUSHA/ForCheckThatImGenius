package Taksopark.Select;

public class FordMondeo extends TaksiSelect{
    double priceKm = 1.3;
    double price = 3300.0;
    double fuelConsumption = 8.0;
    int maxSpeed = 200;
    public FordMondeo(int yearOfRelease){
        super.marka = "Ford";
        model = "Mondeo";
        bodyType = "Sedan";
        copasity = 1.6;
        super.price = this.price;
        super.fuelConsumption = fuelConsumption;
        super.maxSpeed = maxSpeed;
    }

    public String toString() {
        return ("---" + fuelConsumption + " " + nameOfClass + " " + priceKm + "km" + " " + marka + " " + model + " " + bodyType + " " + copasity + "l"
                + yearOfRelease + " " + price);
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    }

