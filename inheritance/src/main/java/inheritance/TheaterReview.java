package inheritance;

public class TheaterReview extends Reviews {
    public TheaterReview(String body, String author, int numOfStars, String movie) {
        super(body, author, numOfStars);
        this.movie = movie;
    }

    String movie;

    @Override
// To string method
    public String toString() {

        return String.format(
                "The review: %s the author is %s and it has %d stars and watched %s movie",
                this.body,
                this.author,
                this.numOfStars,
                this.movie
        );
    }
}
