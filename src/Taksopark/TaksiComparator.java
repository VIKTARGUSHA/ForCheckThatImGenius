package Taksopark;

import java.util.Comparator;

public class TaksiComparator implements Comparator<Taksi> {

    @Override
    public int compare(Taksi o1, Taksi o2) {
        return (o1.getFuelConsumption() - o2.getFuelConsumption()) > 0 ? 1 : (o1.getFuelConsumption() - o2.getFuelConsumption()) < 0 ? -1 : 0;
    }
}
