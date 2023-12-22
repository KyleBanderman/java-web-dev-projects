package org.technology;

public class Smartphone extends Computer {
    private boolean inPocket;

    public Smartphone (boolean isInPocket, boolean hasAMotherboard, String aBrandName, int aGigsOfRam) {
        super(hasAMotherboard, aBrandName, aGigsOfRam);
        this.inPocket = isInPocket;
    }

    public void Selfie () {
        System.out.println("Stop");
    }
}
