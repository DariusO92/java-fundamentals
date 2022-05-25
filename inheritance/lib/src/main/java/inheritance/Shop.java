package inheritance;

import java.util.ArrayList;

public class Shop {
    public String name;
    public  String description;
    public int price;
    public ArrayList<Review> reviews = new ArrayList<>();

    public Shop(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString(){
        return "name: " + name + " "
                + "description: " + description + " " +
                "price: " + price + ".";
    }
    public void addReview(Review input){
        reviews.add(input);
    }
}
