package Taksopark.TaksiSelectPlus;

import Taksopark.Taksi;

public class TaksiSelectPlus extends Taksi {
    int yearOfRelease = 2015;
    String nameOfClass = "SELECTPLUS";
    TaksiSelectPlus(){};
    public TaksiSelectPlus(int yearOfRelease){
        this.yearOfRelease = yearOfRelease;
    }
}
