package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testShopCreated() {

        Shop shop_1 = new Shop("shop_1", 0, 2, "All you can eat");

        System.out.println(shop_1);

    }

    @Test
    public void ShopTest() {
        Shop shop_2 = new Shop("shop_2", 0, 2, "All you can eat");
        Shop shop_3 = new Shop("shop_3", 0, 1, "Vegetarians");

        shop_2.addReview(new Reviews("anything", "Doug", 3));
        shop_2.addReview(new Reviews("anything", "Doug", 4));
        shop_3.addReview(new Reviews("anything", "Doug", 3));
        shop_3.addReview(new Reviews("anything", "Doug", 4));
        shop_2.addReview(new Reviews("anything", "Doug", 5));

        String expected1 = "The restaurant shop_2 has 4.00 stars and contains: All you can eat and has price category of 2, and has 3 reviews";
        String expected2 = "The restaurant shop_3 has 3.50 stars and contains: Vegetarians and has price category of 1, and has 2 reviews";

        assertEquals(expected1, (shop_2.toString()));
        assertEquals(expected2, (shop_3.toString()));
    }


}
