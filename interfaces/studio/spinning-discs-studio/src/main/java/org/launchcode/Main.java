package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD aCD = new CD (.7, 300);
        DVD aDVD = new DVD(17, 1100);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        aCD.dataWrite();
        aCD.spinDisk();
        aCD.dataRead();
        aCD.storeData("a", "b");
        aCD.dataRead();

        aDVD.dataWrite();
        aDVD.spinDisk();
        aDVD.dataRead();
        aDVD.storeData("b", "c");
        aDVD.dataRead();
    }
}