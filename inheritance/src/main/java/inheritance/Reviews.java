package inheritance;

public class Reviews {
    public String body;
    public String author;
    public int numOfStars;

    public Reviews(String body, String author, int numOfStars) {
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
    }

    public Reviews(String itWasPrettyGood, String Doug, int i, String storeName) {
    }

    public String toString() {

        return String.format(
                "The review: %s The author is %s and it has %d stars",
                this.body,
                this.author,
                this.numOfStars
        );
    }
}
