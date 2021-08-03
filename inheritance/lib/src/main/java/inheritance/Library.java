
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {

//        Restaurant res = new Restaurant("koko",5,1);
//        Review review1=new Review("nice","noor",2);
//        res.addRev(review1);
//        System.out.println(res.toString());


        Theater th =new Theater("Grand");
        Review revTh =new Review("nice nice nice","moka",2);
        th.addRev(revTh);
        th.addMovie("batman");
        th.addMovie("spiderman");
        th.removeMovie("batman");
        System.out.println(th.toString());

        Review revSpiderman = new Review("i would like to watch spiderman film","nooraldeen",5,"spiderman");
        th.addRev(revSpiderman);
        System.out.println(th.toString());


    }

}
