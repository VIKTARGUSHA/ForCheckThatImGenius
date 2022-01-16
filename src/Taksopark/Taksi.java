package Taksopark;
import java.util.*;
 public class Taksi implements Comparable <Taksi>{
    protected String marka, model, bodyType;
    protected double copasity,price, fuelConsumption;
    protected int maxSpeed;
    public String getMarka() {
        return marka;
    }
    public String getModel(){
        return model;
    }
    public String getBodyType(){
        return bodyType;
    }
    public double getCopasity(){
        return copasity;
    }
    public double getPrice(){ return price; }
    public double getFuelConsumption(){ return fuelConsumption;}
     public int getMaxSpeed(){return maxSpeed;};

     @Override
     public int compareTo(Taksi o) {
         return  (o.getFuelConsumption() - fuelConsumption) > 0 ? 1 :  (o.getFuelConsumption() - fuelConsumption) < 0 ? -1 : 0;
     }
 }