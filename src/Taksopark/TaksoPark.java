package Taksopark;

import Taksopark.Black.LexusLX;
import Taksopark.Black.MercedesML;
import Taksopark.Black.ToyotaLandCruiser;
import Taksopark.Select.FordMondeo;
import Taksopark.Select.TaksiSelect;
import Taksopark.Select.WolksvagenTiguan;
import Taksopark.Select.WolkswagenPassien;
import Taksopark.TaksiSelectPlus.BMWX5;
import Taksopark.TaksiSelectPlus.SkodaKodiak;
import Taksopark.TaksiSelectPlus.VolvoX80;
import Taksopark.X.XcarLogan;
import Taksopark.X.XcarPolo;
import Taksopark.X.XcarRio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;


public class TaksoPark {

    public void defineCarWithThisMaxSpeed(TreeSet<Taksi> taxiList, int permissibleSpeedMin, int permissibleSpeedMax){
       TreeSet<Taksi> taxiWithPermissibleSpeed = new TreeSet<>();
        for(Taksi taxa : taxiList){
            if(taxa.getMaxSpeed() < permissibleSpeedMax && taxa.getMaxSpeed() > permissibleSpeedMin ){
                taxiWithPermissibleSpeed.add(taxa);
            }
        }
        System.out.println(taxiWithPermissibleSpeed);
    }

    public static void defineCarWithThisSpeed(TreeSet<Taksi> taxiList, int permissibleSpeedMin, int permissibleSpeedMax){
        TreeSet<Taksi> taxiWithPermissibleSpeed = new TreeSet<>();
        for(Taksi taxa : taxiList){
            if(taxa.getMaxSpeed() < permissibleSpeedMax && taxa.getMaxSpeed() > permissibleSpeedMin ){
                taxiWithPermissibleSpeed.add(taxa);
            }
        }
        System.out.println(taxiWithPermissibleSpeed);
    }

    public static void main(String[] args) {
        double totalPrice = 0;
        TreeSet<Taksi> taksoPark = new TreeSet<>();
        LexusLX lexusLX = new LexusLX(2021);
        taksoPark.add(lexusLX);
        MercedesML mercedesML = new MercedesML(2008);
        taksoPark.add(mercedesML);
        ToyotaLandCruiser toyotaLandCruiser = new ToyotaLandCruiser(2022);
        taksoPark.add(toyotaLandCruiser);
        FordMondeo fordMondeo = new FordMondeo(1995);
        taksoPark.add(fordMondeo);
        WolksvagenTiguan wolksvagenTiguan = new WolksvagenTiguan(2015);
        taksoPark.add(wolksvagenTiguan);
        WolkswagenPassien wolkswagenPassien = new WolkswagenPassien();
        taksoPark.add(wolkswagenPassien);
        taksoPark.add(mercedesML);
        BMWX5 bmwx5 = new BMWX5(2002);
        taksoPark.add(bmwx5);
        SkodaKodiak skodaKodiak = new SkodaKodiak(2019);
        taksoPark.add(skodaKodiak);
        VolvoX80 volvoX80 = new VolvoX80();
        taksoPark.add(volvoX80);
        XcarLogan renaultLogan = new XcarLogan(2019);
        taksoPark.add(skodaKodiak);
        taksoPark.add(renaultLogan);
        XcarPolo wolksvagenPolo = new XcarPolo(2017);
        taksoPark.add(wolksvagenPolo);
        XcarRio kiaRio = new XcarRio(2023);
        taksoPark.add(kiaRio);
        Iterator<Taksi> totalPriceIterator = taksoPark.iterator();
        while (totalPriceIterator.hasNext()){
            double priceCar = totalPriceIterator.next().getPrice();
            totalPrice += priceCar;
        }
        System.out.println(totalPrice + " " + taksoPark.size());


        TaksiComparator taksiComparator = new TaksiComparator();
        TreeSet<Taksi> taksoParkTwo = new TreeSet<>(taksiComparator);
        LexusLX lexusLXTwo = new LexusLX(2021);
        taksoParkTwo.add(lexusLXTwo);
        MercedesML mercedesMLTwo = new MercedesML(2008);
        taksoParkTwo.add(mercedesMLTwo);
        ToyotaLandCruiser toyotaLandCruiserTwo = new ToyotaLandCruiser(2022);
        taksoParkTwo.add(toyotaLandCruiserTwo);
        FordMondeo fordMondeoTwo = new FordMondeo(1995);
        taksoParkTwo.add(fordMondeoTwo);
        WolksvagenTiguan wolksvagenTiguanTwo = new WolksvagenTiguan(2015);
        taksoParkTwo.add(wolksvagenTiguanTwo);
        WolkswagenPassien wolkswagenPassienTwo = new WolkswagenPassien();
        taksoParkTwo.add(wolkswagenPassienTwo);
        taksoParkTwo.add(mercedesMLTwo);
        BMWX5 bmwx5Two = new BMWX5(2002);
        taksoParkTwo.add(bmwx5Two);
        SkodaKodiak skodaKodiakTwo = new SkodaKodiak(2019);
        taksoParkTwo.add(skodaKodiakTwo);
        VolvoX80 volvoX80Two = new VolvoX80();
        taksoParkTwo.add(volvoX80Two);
        XcarLogan renaultLoganTwo = new XcarLogan(2019);
        taksoParkTwo.add(skodaKodiakTwo);
        taksoParkTwo.add(renaultLogan);
        taksoParkTwo.add(wolksvagenPolo);
        XcarRio kiaRioTwo = new XcarRio(2023);
        taksoParkTwo.add(kiaRio);
        System.out.println(taksoParkTwo.size());
        System.out.println(taksoParkTwo);

        TaksoPark taksoParkSpeed =new TaksoPark();
        taksoParkSpeed.defineCarWithThisMaxSpeed(taksoPark, 100, 200);
        TaksiSelect taksiSelect = new TaksiSelect();
        taksiSelect.defineCarWithThisMaxSpeed(taksoPark, 100, 200);

        defineCarWithThisSpeed(taksoPark, 250, 500);


    }
}