package inheritance;

import java.util.ArrayList;

public class Restaurant {
    public String name;
    public double numberOfStars;
    public int priceCategory;
    public ArrayList<Review> ArrayListReview = new ArrayList<>();
    public static float  counter=1;

    public Restaurant(String name,int numberOfStars,int priceCategory){
        this.name=name;
         if ((numberOfStars < 0) || (numberOfStars >5)) {
            System.out.println("value is out of range for a number of stars , it should be (0-5)");
        }else {
            this.numberOfStars = numberOfStars;
        };
        this.priceCategory=priceCategory;
    }


    public Object getArrayListReview() {
        return ArrayListReview;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public void addToRev(String body, String author, int numberOfStars){

        Review review = new Review( body, author,numberOfStars);

        this.numberOfStars = (this.numberOfStars*counter + review.numberOfStars) / ++counter;

        this.ArrayListReview.add(review);

    }






    @Override
    public String toString() {
        return "Restaurant{" +
                "Restaurant Name :" + name + '\'' +
                ",And its Rate is " + numberOfStars +
                ", priceCategory is " + priceCategory +
                ", Reviews" + ArrayListReview +
                '}';
    }
}
