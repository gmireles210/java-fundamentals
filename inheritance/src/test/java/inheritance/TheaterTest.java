package inheritance;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void getAllElements() {
    }

    @Test
    public void testAddMovie() {
        Theater th1 = new Theater("IMAX", 0, 0);
        th1.addMovie("Movie");
        th1.addMovie("Movie1");
//        System.out.println(th1.getAllElements());
        String expected = "[Movie, Movie1]";
        assertEquals(expected, (th1.getAllElements()));
    }

    @Test
    public void removeMovie() {

        Theater th1 = new Theater("Demolition Man", 0, 0);
        th1.addMovie("Movie");
        th1.addMovie("Movie1");
        th1.addMovie("Movie2");
        th1.addMovie("Movie3");
        //remove the element

        th1.removeMovie("Movie1");

        String expected = "[Movie, Movie2, Movie3]";
        assertEquals(expected, (th1.getAllElements()));
//        System.out.println(th1.getAllElements());
    }

    @Test
    public void testToString() {
        LinkedList moviesList = new LinkedList();
        moviesList.add("Once Upon A Time in Hollywood");
        moviesList.add("Inglorious Bastards");

        String expected = "[Once Upon A Time in Hollywood, Inglorious Bastards]";
        assertEquals(expected, (moviesList.toString()));
    }

    @Test
    public void TheaterTest() {
        Theater IMAX = new Theater("IMAX", 4, 2);

        IMAX.addMovie("Bourne Supremacy");

        IMAX.addReview(new TheaterReview("anything", "Doug", 1, "Bourne Supremacy"));
        IMAX.addReview(new TheaterReview("anything", "Doug", 2, ""));
        IMAX.addReview(new TheaterReview("anything", "Doug", 3, "Bourne Supremacy2"));

        System.out.println(IMAX);
        String expected = "The theater IMAX has 2.00 stars and contains: [Bourne Supremacy] and has 3 reviews and 1 movie is shown";
        assertEquals(expected, (IMAX.toString()));
    }

}
