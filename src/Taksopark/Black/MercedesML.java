package Taksopark.Black;

public class MercedesML extends TaksiBlack{

        double priceKm = 2.1;
        double price = 90000;
        double fuelConsumption = 25;
        String marka;
        int yearOfRelease;
        int maxSpeed = 170;
        public MercedesML (int yearOfRelease){
            marka = "Mercedes";
            model = "ML";
            copasity = 1.6;
            bodyType = "Cruiser";
            super.price = price;
            yearOfRelease = yearOfRelease;
            super.fuelConsumption = fuelConsumption;
            super.maxSpeed = maxSpeed;
        }
        public String toString() {
            return ("---" + fuelConsumption  + " " + nameOfClass + " " + priceKm + "km" + " " + marka + " " + model + " "
                    + bodyType + " " + copasity + "l" + yearOfRelease + " " + price);
        }
        public int getMaxSpeed(){
            return maxSpeed;
        }
    }

