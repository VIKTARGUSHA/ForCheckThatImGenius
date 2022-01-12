package Taksopark.TaksiSelectPlus;

public class BMWX5 extends TaksiSelectPlus{
    double priceKm = 2.0;
    BMWX5 (int yearOfRelease){
        model = "X5";
        marka = "BMW";
        bodyType = "Jeep";
        copasity = 3.5;
        this.yearOfRelease = yearOfRelease;
    }
    public String toString(){
        return ("---" + model + " " + marka + " " + bodyType + " " + copasity + " " + yearOfRelease);
    }
}
