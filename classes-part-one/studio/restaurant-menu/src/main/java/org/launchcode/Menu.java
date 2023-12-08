package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> listOfItems = new ArrayList<>();
    private Date dateAdded = new Date();

    public ArrayList<MenuItem> getListOfItems() { return listOfItems; }

    public void setListOfItems(ArrayList<MenuItem> listOfItems) { this.listOfItems = listOfItems; }

    public Date getDateAdded() { return dateAdded; }

    public void setDateAdded(Date dateAdded) { this.dateAdded = dateAdded; }
}
