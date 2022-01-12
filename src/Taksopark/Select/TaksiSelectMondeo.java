package Taksopark.Select;

public class TaksiSelectMondeo extends TaksiSelect{
    double priceKm = 1.3;
    TaksiSelectMondeo(int yearOf){
        super.marka = "Ford";
        model = "Mondeo";
        bodyType = "Sedan";
        copasity = 1.6;
    }

    public String toString() {
        return ("---" + priceKm + "km" + " " + marka + " " + model + " " + bodyType + " " + copasity + "l" + yearOfRelease);
    }
    }

