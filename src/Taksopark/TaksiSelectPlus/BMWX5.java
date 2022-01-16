package Taksopark.TaksiSelectPlus;

public class BMWX5 extends TaksiSelectPlus{
    double priceKm = 2.0;
    double price = 66006;
    double fuelConsumption = 22.1;
    int maxSpeed = 230;
    public BMWX5 (int yearOfRelease){
        model = "X5";
        marka = "BMW";
        bodyType = "Jeep";
        copasity = 3.5;
        this.yearOfRelease = yearOfRelease;
        super.price = this.price;
        super.fuelConsumption = fuelConsumption;
        super.maxSpeed = maxSpeed;
    }
    public String toString(){
        return ("---" + fuelConsumption + " " + " " + nameOfClass + " "+ model + " " + marka + " " + bodyType + " " + copasity + " "
                + yearOfRelease + " " + price);
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
}
