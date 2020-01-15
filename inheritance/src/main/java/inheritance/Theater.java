package inheritance;

import java.util.LinkedList;

public class Theater extends Restaurant {


    public Theater(String name, int numOfStars, int priceCategory) {
        super(name, numOfStars, priceCategory);
        this.movieShowingList = new LinkedList<>();
    }

    LinkedList<String> movieShowingList;


    public String getAllElements() {
        return movieShowingList.toString();
    }

    public void addMovie(String movie) {
        movieShowingList.add(movie);
    }


    public void removeMovie(String movie) {
        movieShowingList.remove(movie);
    }


    @Override
// To string method
    public String toString() {

        return String.format(
                "The theater %s has %.2f stars and contains: %s and has %d reviews and %d movie is shown",
                this.resName,
                this.numOfStars,
                this.movieShowingList.toString(),
                this.resReviews.size(),
                this.movieShowingList.size()
        );
    }



}
