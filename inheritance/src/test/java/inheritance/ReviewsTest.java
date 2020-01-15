package inheritance;

import org.junit.Test;

public class ReviewsTest {

    @Test
    public void ReviewTest() {
        Reviews reviews1 = new Reviews("This is a great restaurant if you want to get salmonella.","Doug", 1);

        System.out.println(reviews1.toString());


    }
}
