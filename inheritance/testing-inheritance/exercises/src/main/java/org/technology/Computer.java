package org.technology;

public class Computer {
    private boolean hasMotherboard;
    private String brandName;
    private int gigsOfRam;

    public Computer (boolean hasAMotherboard, String aBrandName, int aGigsOfRam) {
        this.hasMotherboard = hasAMotherboard;
        this.brandName = aBrandName;
        this.gigsOfRam = aGigsOfRam;
    }

    public void beepBoop () {
        System.out.println("Beep Boop");
    }

    public void amIAComputer () {
        System.out.println("Yes");
    }
}
