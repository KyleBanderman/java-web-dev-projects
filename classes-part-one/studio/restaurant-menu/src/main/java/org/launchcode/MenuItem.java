package org.launchcode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class MenuItem {
    //fields
    private double price;
    private String name;
    private String description;
    private String category;
    private boolean newItem;
    private LocalDate dateAddedToMenu;
    private int menuItemId;

    //static variables
    private static int nextMenuId = 1;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = true;
        this.dateAddedToMenu = LocalDate.now();
        this.menuItemId = getNextMenuId();
    }

    //accessors
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }

    public boolean isNewItem() { return newItem; }

    public void setNewItem(boolean newItem) { this.newItem = newItem; }

    public LocalDate getDateAddedToMenu() { return dateAddedToMenu; }

    //update IDs
    private static int getNextMenuId() {
        int id = nextMenuId;
        nextMenuId++;
        return id;
    }

    //Override default methods
    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }
        MenuItem aMenuItem = (MenuItem) toBeCompared;
        return aMenuItem.menuItemId == menuItemId;
    }

    //instance methods
    //TODO: isNewMenuItem()
    public void isNewMenuItem() {
        LocalDate twoWeekDate = dateAddedToMenu.plusWeeks(2);
        if (dateAddedToMenu.isAfter(twoWeekDate)) {
            this.newItem = false;
        }
    }
}