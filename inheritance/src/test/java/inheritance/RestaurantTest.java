package inheritance;

import org.junit.Assert;
import org.junit.Test;

public class RestaurantTest {
    @Test
    public void RestaurantCreated() {
        Restaurant redLobster = new Restaurant("redLobster", 4, 2);
        String expected = "The restaurant redLobster has 4.00 stars and has price category of 2, and has 0 reviews";
        Assert.assertEquals(expected, (redLobster.toString()));

    }


    @Test
    public void RestaurantTest() {
        Restaurant arbys = new Restaurant("Arbys", 4, 2);
        Restaurant redLobster = new Restaurant("redLobster", 4, 2);

        arbys.addReview(new Reviews("anything", "Doug", 1));
        arbys.addReview(new Reviews("anything", "Doug", 2));
        arbys.addReview(new Reviews("anything", "Doug", 3));
        arbys.addReview(new Reviews("anything", "Doug", 4));
        arbys.addReview(new Reviews("anything", "Doug", 1));

        String expected = "The restaurant Arbys has 2.20 stars and has price category of 2, and has 5 reviews";

        Assert.assertEquals(expected, (arbys.toString()));

    }

}
