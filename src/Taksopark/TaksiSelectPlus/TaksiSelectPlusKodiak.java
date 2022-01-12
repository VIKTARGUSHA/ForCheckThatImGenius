package Taksopark.TaksiSelectPlus;

public class TaksiSelectPlusKodiak extends TaksiSelectPlus{
    double priceKm = 1.5;
    int yearOfRelease = 2017;
    TaksiSelectPlusKodiak(int yearOfRelease){
        model = "Kodiak";
        marka = "Skoda";
        bodyType = "Outpath";
        copasity = 2.2;
        yearOfRelease = yearOfRelease;
    }
    public String toString(){
        return ("---" + model + " " + marka + " " + bodyType + " " + copasity + " " + yearOfRelease);
    }
}
