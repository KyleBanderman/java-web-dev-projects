package org.launchcode;
import java.util.Date;

public class MenuItem {
    private double price;
    private String name;
    private String description;
    private String category;
    private boolean newItem;
    private Date dateAddedToMenu;

    public MenuItem(double price, String name, String description, String category) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.dateAddedToMenu = new Date();
        this.newItem = true;
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

    public Date getDateAddedToMenu() { return dateAddedToMenu; }
}
