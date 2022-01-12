package Taksopark.Select;

import Taksopark.Select.TaksiSelect;

public class TaksiSelectPassien extends TaksiSelect {
    double priceKm = 1.2;

    TaksiSelectPassien() {
        super.marka = "Wolkswagen";
        model = "Passat";
        bodyType = "Universal";
        copasity = 1.8;
    }

    public String toString() {
        return ("---" + priceKm + "km" + " " + marka + " " + model + " " + bodyType + " " + copasity + "l" + yearOfRelease);
    }
}
