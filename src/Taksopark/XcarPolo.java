package Taksopark;

public class XcarPolo extends TaksiX {
    double priceKm;
    public XcarPolo(){
        this.priceKm = 0.8;
        this.marka = "Volkswagen";
        this.model = "Polo";
        this.bodyType = "sedan";
        this.copasity = 1.6;
    }
    public String toString(){
        return ("---" + "X" + priceKm + " " + marka + " " + model + " " + bodyType + " " + copasity + "---");
    }
}
