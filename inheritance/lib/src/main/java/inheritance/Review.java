package inheritance;

public class Review {

    public String body;
    public String author;
    public int numberOfStars;
    public String movie;

    public Review(String body, String author, int numberOfStars) {
        this.body=body;
        this.author=author;
        if ((numberOfStars < 0) || (numberOfStars >5)) {
            System.out.println("value is out of range for a number of stars , it should be (0-5)");
        }else {
            this.numberOfStars = numberOfStars;
        };
    }

    public Review(String body, String author, int numberOfStars,String movie) {
        this.body=body;
        this.author=author;
        if ((numberOfStars < 0) || (numberOfStars >5)) {
            System.out.println("value is out of range for a number of stars , it should be (0-5)");
        }else {
            this.numberOfStars = numberOfStars;
        };
        this.movie=movie;

    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }


    @Override
    public String toString() {
        if(this.movie==null) {
            return "Review{" +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", numberOfStars=" + numberOfStars +

                    '}';
        }else{
            return "Review{" +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", numberOfStars=" + numberOfStars +
                    ", movie ="+ movie+
                    '}';
        }
    }


}
