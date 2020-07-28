package com.tts.TransitApp.model;

import java.util.Comparator;

public class BusComparator implements Comparator<Bus> {
    @Override
    public int compare(Bus o1, Bus o2) {
        if (o1.distance < o2.distance) {
            return -1;
        } else if (o1.distance > o2.distance) {
            return 1;
        } else {
            return 0;
        }
        
    }
    
}