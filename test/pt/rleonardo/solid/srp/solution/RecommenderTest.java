package pt.rleonardo.solid.srp.solution;

import org.junit.Assert;
import org.junit.Test;
import pt.rleonardo.solid.srp.problem.BBDD;
import pt.rleonardo.solid.srp.problem.Movie;

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

        String csv = new CSVExporter().export(r.recommendations(BBDD.JOHN));

        String expected = "Saving Private Ryan,Spielberg,war";

        Assert.assertEquals(expected, csv);
    }

}