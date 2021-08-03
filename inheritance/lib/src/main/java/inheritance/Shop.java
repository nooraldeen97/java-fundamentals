package inheritance;

import java.util.ArrayList;

public class Shop implements AddReview{

    private String name;
    private String description;
    private int numberOfDollarSign;
    private ArrayList <Review> shopReview=new ArrayList<>();

    public Shop(String name, String description, int numberOfDollarSign){
        this.name=name;
        this.description=description;
        this.numberOfDollarSign=numberOfDollarSign;
    }

    @Override
    public void addRev(Review review) {
    shopReview.add(review);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfDollarSign() {
        return numberOfDollarSign;
    }

    public void setNumberOfDollarSign(int numberOfDollarSign) {
        this.numberOfDollarSign = numberOfDollarSign;
    }

    public ArrayList<Review> getShopReview() {
        return shopReview;
    }

    public void setShopReview(ArrayList<Review> shopReview) {
        this.shopReview = shopReview;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSign=" + numberOfDollarSign +
                ", shopReview=" + shopReview +
                '}';
    }
}
