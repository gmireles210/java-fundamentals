package inheritance;

public class Review {
    public String body;
    public String author;
    public int numOfStars;

    public Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        this.numOfStars = numberOfStars;
    }

    public String toString() {
//        name= this.name;

        return String.format(
                "The review: %s the author is  %s and it has %d stars",
                this.body,
                this.author,
                this.numOfStars
        );
    }
}
