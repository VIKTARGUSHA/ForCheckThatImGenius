package Taksopark.Select;

public class TaksiSelectTiguan extends TaksiSelect{
    double priceKm = 1.4;
    int yearOfRelease;
    TaksiSelectTiguan(int yearOfRelease){
     super.marka = "Wolkswagen";
    model = "Tiguan";
    bodyType = "Parketnic";
    copasity = 1.8;
    yearOfRelease = yearOfRelease;
}

    public String toString() {
        return ("---" + priceKm + "km" + " " + marka + " " + model + " " + bodyType + " " + copasity + "l" + super.yearOfRelease);
    }
}
