package Taksopark.TaksiSelectPlus;

public class BMWX5 extends TaksiSelectPlus{
    double priceKm = 2.0;
    double price = 66006;
    double fuelConsumption = 25.1;
    public BMWX5 (int yearOfRelease){
        model = "X5";
        marka = "BMW";
        bodyType = "Jeep";
        copasity = 3.5;
        this.yearOfRelease = yearOfRelease;
        super.price = this.price;
    }
    public String toString(){
        return ("---" + " " + nameOfClass + " "+ model + " " + marka + " " + bodyType + " " + copasity + " "
                + yearOfRelease + " " + price);
    }
}
