package Taksopark.TaksiSelectPlus;

public class VolvoX80 extends TaksiSelectPlus{
    double priceKm = 2.5;
    double price = 99000;
    public VolvoX80(){
        model = "X80";
        marka = "Volvo";
        bodyType ="OutPath";
        copasity = 4.0;
        yearOfRelease = 2019;
    }
    public String toString(){
        return ("---" + " " + nameOfClass + " " + model + " " + marka + " " + bodyType + " " + copasity + " "
                + yearOfRelease + " " + price);
    }
}
