package inheritance;

public class Shop extends Restaurant {
    public Shop (String resName, int numOfStars, int resPricing, String overview) {
        super(resName, numOfStars, resPricing);
        this.overview = overview;
    }
    String overview;


    @Override
// To string method
    public String toString() {

        return String.format(
                "The restaurant %s has %.2f stars and contains: %s and has price category of %d, and has %d reviews",
                this.resName,
                this.numOfStars,
                this.overview,
                this.resPricing,
                this.resReviews.size()
        );
    }
}
