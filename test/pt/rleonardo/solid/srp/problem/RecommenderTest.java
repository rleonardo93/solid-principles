package pt.rleonardo.solid.srp.problem;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RecommenderTest {

    @Test
    public void basic_test() {
        Recommender r = new Recommender();

        List<Movie> recommendations = r.recommendations(BBDD.JOHN);

        // The list of recommendations does not include films that the client has already seen.
        Assert.assertFalse(recommendations.contains(BBDD.ET));
    }

    @Test
    public void test_format() {
        Recommender r = new Recommender();

        String csv = r.recomendationCSV(BBDD.JOHN);

        String expected = "Saving Private Ryan,Spielberg,war";

        Assert.assertEquals(expected, csv);
    }

}