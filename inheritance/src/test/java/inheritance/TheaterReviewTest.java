package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterReviewTest {
    @Test
    public void theaterReviewTest() {
        TheaterReview review1 = new TheaterReview("This is a fantastic movie theater if you want to have a great experience","Doug",1,"blank");
        String expected = "The review: This is a fantastic movie theater if you want to have a great experience the author is Doug and it has 1 stars and watched blank movie";
        assertEquals(expected, (review1.toString()));
    }
}
