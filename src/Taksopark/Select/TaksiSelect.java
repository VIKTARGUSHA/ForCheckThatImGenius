package Taksopark.Select;

import Taksopark.Taksi;

import java.util.TreeSet;

public class TaksiSelect extends Taksi {
    int yearOfRelease = 2010;
    String nameOfClass = "SELECT";
    public TaksiSelect() {
    }
    public void defineCarWithThisMaxSpeed(TreeSet<Taksi> taxiList, int permissibleSpeedMin, int permissibleSpeedMax){
        TreeSet<Taksi> taxiWithPermissibleSpeed = new TreeSet<>();
        for(Taksi taxa : taxiList){
            if(taxa.getMaxSpeed() < permissibleSpeedMax && taxa.getMaxSpeed() > permissibleSpeedMin ){
                taxiWithPermissibleSpeed.add(taxa);
            }
        }
        System.out.println(taxiWithPermissibleSpeed);
    }
}
