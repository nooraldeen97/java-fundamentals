package inheritance;

import java.util.ArrayList;

public class Theater implements AddReview{

    private String name;
    private ArrayList <String> movies=new ArrayList<>();
    private ArrayList <Review> TheaterReview=new ArrayList<>();

    public Theater(String name) {
        this.name = name;
    }

    public void addMovie(String mov){
        movies.add(mov);
    }

    public void removeMovie(String mov){
        movies.remove(mov);
    }


    @Override
    public void addRev(Review review) {
        TheaterReview.add(review);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public ArrayList<Review> getTheaterReview() {
        return TheaterReview;
    }

    public void setTheaterReview(ArrayList<Review> theaterReview) {
        TheaterReview = theaterReview;
    }


    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", TheaterReview=" + TheaterReview +
                '}';
    }
}

