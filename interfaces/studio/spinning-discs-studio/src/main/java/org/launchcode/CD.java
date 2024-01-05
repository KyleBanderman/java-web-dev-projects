package org.launchcode;

public class CD extends BaseDisk implements OpticalDisk{
    // TODO: Implement your custom interface.
    public void spinDisk() {
        System.out.println("A CD spins at a rate of " + this.rpm + " rpm.");
    }

    public void dataWrite() {
        System.out.println("writing data");
    }

    public CD (double aStorageCapacity, double aRpm) {
        this.storageCapacity = aStorageCapacity;
        this.rpm = aRpm;
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
