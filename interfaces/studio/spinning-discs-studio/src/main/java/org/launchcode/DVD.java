package org.launchcode;

public class DVD extends BaseDisk implements OpticalDisk{
    // TODO: Implement your custom interface.
    public void spinDisk() {
        System.out.println("A DVD spins at a rate of " + this.rpm + " rpm.");
    }

    public void dataWrite() {
        System.out.println("writing data");
    }

    public DVD (double aStorageCapacity, double aRpm) {
        this.storageCapacity = aStorageCapacity;
        this.rpm = aRpm;
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
