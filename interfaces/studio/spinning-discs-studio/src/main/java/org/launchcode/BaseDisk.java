package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseDisk {
    public double storageCapacity;
    public double rpm;
    private HashMap<String, String> data = new HashMap<String, String>();

    public void storeData(String input, String input2) {
        data.put(input, input2);
    };

    public void dataRead() {
        for(Map.Entry <String, String> item : data.entrySet()) {
            System.out.println(item);
        }
    }

    public HashMap<String, String> getData () {
        return data;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }
}
