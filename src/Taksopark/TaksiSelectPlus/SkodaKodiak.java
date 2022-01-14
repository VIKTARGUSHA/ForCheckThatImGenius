package Taksopark.TaksiSelectPlus;

public class SkodaKodiak extends TaksiSelectPlus{
    double priceKm = 1.5;
    int yearOfRelease = 2017;
    double price = 47000;
    double fuelConsumption = 15.1;
    public SkodaKodiak(int yearOfRelease){
        model = "Kodiak";
        marka = "Skoda";
        bodyType = "Outpath";
        copasity = 2.2;
        yearOfRelease = yearOfRelease;
        super.price = this.price;
    }
    public String toString(){
        return ("---" + " " + nameOfClass + " " + model + " " + marka + " " + bodyType + " " + copasity + " "
                + yearOfRelease + " " + price);
    }
}
