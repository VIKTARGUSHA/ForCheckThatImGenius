package Taksopark.Select;

public class WolksvagenTiguan extends TaksiSelect{
    double priceKm = 1.4;
    int yearOfRelease;
    double price = 48000;
    public WolksvagenTiguan(int yearOfRelease){
     super.marka = "Wolkswagen";
    model = "Tiguan";
    bodyType = "Parketnic";
    copasity = 1.8;
    yearOfRelease = yearOfRelease;
}

    public String toString() {
        return ("---" + " " + nameOfClass + " " + priceKm + "km" + " " + marka + " " + model + " " +
                bodyType + " " + copasity + "l" + super.yearOfRelease + " " + price);
    }
}
