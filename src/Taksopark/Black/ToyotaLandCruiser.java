package Taksopark.Black;

public class ToyotaLandCruiser extends TaksiBlack {

        double priceKm = 2.3;
        double price = 110000;
        double fuelConsumption = 15.0;
        String marka;
        int yearOfRelease;
        int maxSpeed = 295;
        public ToyotaLandCruiser (int yearOfRelease){
            marka = "Toyota";
            model = "LandCruiser";
            copasity = 6.7;
            bodyType = "Cruiser";
            super.price = price;
            this.yearOfRelease = yearOfRelease;
            super.fuelConsumption = fuelConsumption;
            super.maxSpeed = maxSpeed;
        }
        public String toString() {
            return ("---" + fuelConsumption + " " + " " + nameOfClass + " " + priceKm + "km" + " " + marka + " " + model + " "
                    + bodyType + " " + copasity + "l" + yearOfRelease + " " + price);
        }
        public int getMaxSpeed(){
            return maxSpeed;
        }
    }

