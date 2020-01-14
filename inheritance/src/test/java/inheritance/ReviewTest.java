package inheritance;

import org.junit.Test;

public class ReviewTest {

    @Test
    public void ReviewTest() {
        Review review1 = new Review("This is a great restaurant if you want to get salmonella. ", "Doug", 1);

        System.out.println(review1.toString());


    }
}
