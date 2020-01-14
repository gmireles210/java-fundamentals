package inheritance;

import java.util.LinkedList;

public class Restaurant {

    public String resName;
    public double numOfStars;
    public int resPricing;
    LinkedList<Review> resReviews;

    public Restaurant(String resName, int numOfStars, int resPricing) {
        this.resName = resName;
        this.numOfStars = numOfStars;
        this.resPricing = resPricing;
        this.resReviews = new LinkedList<>();

    }
//   add review method

    public void addReview(Review newReview) {

        this.resReviews.add(newReview);
        double reviewTally = 0;
        for (int i = 0; i < resReviews.size(); i++) {
            reviewTally += resReviews.get(i).numOfStars;
        }
        numOfStars = reviewTally / resReviews.size();
    }

    // To string method
    public String toString() {

        return String.format(
                "The restaurant %s has %.2f stars and has price category of %d, and has %d reviews",
                this.resName,
                this.numOfStars,
                this.resPricing,
                this.resReviews.size()
        );
    }
}
