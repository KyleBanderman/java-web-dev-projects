package org.technology;

public class Laptop extends Computer {
    private boolean isPortable;

    public Laptop (boolean isItPortable, boolean hasAMotherboard, String aBrandName, int aGigsOfRam) {
        super(hasAMotherboard, aBrandName, aGigsOfRam);
        this.isPortable = isItPortable;
    }

    public void isItFolded () {
        System.out.println("No");
    }
}
