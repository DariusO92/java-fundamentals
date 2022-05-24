package inheritance;

import java.util.ArrayList;

public class Restruant {
    public String name;
    public int numberOfStars = 0;
    public  String price;
    public ArrayList<Review> reviews = new ArrayList<>();

    public Restruant(String name, String price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return "name: "  + name  + " " + "price: " + price + " " +  "numberOfStars: " + numberOfStars + ".";
    }

    public void addReview(Review input){
        reviews.add(input);
        updateStars(input.numberOfStars);




    }
    public void updateStars(int numStars){
        if(numberOfStars == 0 ){
            numberOfStars = numStars;
        }
        else{
            numberOfStars = ( numberOfStars + numStars)/reviews.size();
        }
    }

}
