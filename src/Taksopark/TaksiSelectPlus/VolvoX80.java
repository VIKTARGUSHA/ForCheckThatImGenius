package Taksopark.TaksiSelectPlus;

public class VolvoX80 extends TaksiSelectPlus{
    double priceKm = 2.5;
    double price = 99000;
    double fuelConsumption = 14.7;
    int maxSpeed = 220;
    public VolvoX80(){
        model = "X80";
        marka = "Volvo";
        bodyType ="OutPath";
        copasity = 4.0;
        yearOfRelease = 2019;
        super.price = this.price;
        super.fuelConsumption = fuelConsumption;
        super.maxSpeed = maxSpeed;
    }
    public String toString(){
        return ("---" + fuelConsumption  + " " + nameOfClass + " " + model + " " + marka + " " + bodyType + " " + copasity + " "
                + yearOfRelease + " " + price);
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
}
