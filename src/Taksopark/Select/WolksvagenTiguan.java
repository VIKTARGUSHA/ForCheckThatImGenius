package Taksopark.Select;

public class WolksvagenTiguan extends TaksiSelect{
    double priceKm = 1.4;
    int yearOfRelease;
    double price = 48000;
    double fuelConsumption = 18.0;
    int maxSpeed = 120;
    public WolksvagenTiguan(int yearOfRelease){
     super.marka = "Wolkswagen";
    model = "Tiguan";
    bodyType = "Parketnic";
    copasity = 1.8;
    yearOfRelease = yearOfRelease;
        super.price = this.price;
        super.fuelConsumption = fuelConsumption;
        super.maxSpeed = maxSpeed;
}

    public String toString() {
        return ("---" + fuelConsumption + " " + " " + nameOfClass + " " + priceKm + "km" + " " + marka + " " + model + " " +
                bodyType + " " + copasity + "l" + super.yearOfRelease + " " + price);
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
}
