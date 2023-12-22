package org.launchcode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> listOfItems = new ArrayList<>();
    private Date dateAdded = new Date();

    //accessors
    public ArrayList<MenuItem> getListOfItems() { return listOfItems; }

    public void setListOfItems(ArrayList<MenuItem> listOfItems) { this.listOfItems = listOfItems; }

    public Date getDateAdded() { return dateAdded; }

    public void setDateAdded(Date dateAdded) { this.dateAdded = dateAdded; }

    //instance methods
    public void addMenuItem(String name, double price, String description, String category) {
        MenuItem newMenuItem = new MenuItem(name, price, description, category);
        listOfItems.add(newMenuItem);
    }

    public void removeMenuItem(String name) {
        MenuItem foundItem = null;
        for (MenuItem item : listOfItems) {
            int originalSize = listOfItems.size();
            if (item.getName().equalsIgnoreCase(name)) {
                foundItem = item;
                System.out.println(foundItem.getName() + " has been removed from the menu");
            }
        }
        int originalSize = listOfItems.size();
        listOfItems.remove(foundItem);
        int newSize = listOfItems.size();
        if (originalSize == newSize) {
            System.out.println("No items have been found with that name");
        }
    }

    public MenuItem searchMenuItem(String name) {
        MenuItem output = null;
        for (MenuItem item : listOfItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                output = item;
            }
        }
        return output;
    }

    public void printMenu() {
        for (MenuItem item : listOfItems) {
            System.out.println("*****");
            System.out.println(String.format("%s is a %s dish that is %s that costs %s", item.getName(), item.getCategory(), item.getDescription(), item.getPrice()));
            System.out.println("*****\n");
        }

    }

    public void printSingleItem(String input) {
        MenuItem searchedItem = searchMenuItem(input);
        System.out.println("*****");
        System.out.println(String.format("%s is a %s dish that is %s that costs %s", searchedItem.getName(), searchedItem.getCategory(), searchedItem.getDescription(), searchedItem.getPrice()));
        System.out.println("*****\n");
    }
}
