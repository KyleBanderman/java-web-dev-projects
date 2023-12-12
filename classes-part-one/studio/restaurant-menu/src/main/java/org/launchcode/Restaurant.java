package org.launchcode;

public class Restaurant {
    public static void main(String[] args) {
        Menu Menu1 = new Menu();
        Menu1.addMenuItem("Cheese", 1.1, "It's cheese", "Main");
        Menu1.addMenuItem("Chili", 5, "It's chili", "Main");
        Menu1.addMenuItem("Ice Cream", 1.6, "It's ice cream", "Dessert");
        Menu1.addMenuItem("Mozzarella Sticks", 15, "It's mozzarella sticks", "Appetizer");
        Menu1.addMenuItem("Quesadillas", 1.4, "It's quesadillas", "Main");
        Menu1.addMenuItem("Chocolate Pie", 4.6, "It's chocolate pie", "Dessert");
        Menu1.addMenuItem("Fried Okra", 2, "It's fried okra", "Appetizer");
        Menu1.printSingleItem("Cheese");
        Menu1.printMenu();
        Menu1.removeMenuItem("Taco");
        Menu1.printMenu();
    }
}
